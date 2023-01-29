package project.pdf.info;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;
import java.util.Scanner;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.text.PDFTextStripper;

public class App {
	public static void main(String[] args) {
		String filePath = getInputFromUser();
		File pdfFile = new File(filePath);

		PdfInformationResponse resp = getFileAttributes(pdfFile);
		System.out.println(resp == null ? "Nessun Risultato" : resp.toString());
	}

	
	/**
	 * Allows the user to input into console
	 * 
	 * @return the string entered by the user
	 */
	private static String getInputFromUser() {
		System.out.println("Incolla il path ad un file pdf e premi invio");
		String filePath = "";
		try (Scanner scan = new Scanner(System.in);) {
			filePath = scan.next();
		}
		return filePath;
	}

	private static PdfInformationResponse getFileAttributes(File file) {
		Path path = file.toPath();
		PdfInformationResponse response = new PdfInformationResponse();
		try {
			BasicFileAttributes fileAttr = Files.readAttributes(path, BasicFileAttributes.class);

			response.setFileCreationTime(
					fileAttr.creationTime() != null ? new Date(fileAttr.creationTime().toMillis()) : null);

			response.setFileLastAccessTime(
					fileAttr.lastAccessTime() != null ? new Date(fileAttr.lastAccessTime().toMillis()) : null);

			response.setFileLastModifyTime(
					fileAttr.lastModifiedTime() != null ? new Date(fileAttr.lastModifiedTime().toMillis()) : null);

			response.setFileSize(fileAttr.size());
			return getPdfInfo(file, response);
		} catch (IOException e) {
			System.out.println(String.format("Errore estrazione info dal file %s ", file.getAbsolutePath()));
			e.printStackTrace();
			return null;
		}
	}

	private static PdfInformationResponse getPdfInfo(File file, PdfInformationResponse response) {
		if (response == null) {
			response = new PdfInformationResponse();
		}
		try (PDDocument doc = Loader.loadPDF(file)) {
			PDDocumentInformation info = doc.getDocumentInformation();
			response.setPdfAuthor(info.getAuthor());
			response.setPdfCreator(info.getCreator());
			response.setPdfProducer(info.getProducer());
			response.setPdfSubject(info.getSubject());
			response.setPdfTitle(info.getTitle());
			if (info.getCreationDate() != null) {
				response.setPdfCreationDate(info.getCreationDate().getTime());
			}
			if (info.getModificationDate() != null) {
				response.setPdfModificationDate(info.getModificationDate().getTime());
			}
			response.setPdfPageNumber(doc.getNumberOfPages());

			response.setPdfLinesNumber(getPdfLineNumber(doc));
		} catch (Exception e) {
			System.out.println(String.format("Errore estrazione info dal pdf %s", file.getAbsolutePath()));
			e.printStackTrace();
		}
		return response;
	}

	/**
	 * Calculate the number of lines in a pdf. The result may be incorrect if there
	 * are images, tables, etc.
	 * 
	 * @param document (org.apache.pdfbox.pdmodel.PDDocument)
	 * @return the number of lines of the pdf; -1 in case of error
	 */
	private static int getPdfLineNumber(PDDocument document) {
		try {
			PDFTextStripper pdfStripper = new PDFTextStripper();
			pdfStripper.setStartPage(1);
			pdfStripper.setEndPage(document.getNumberOfPages());

			String pages = pdfStripper.getText(document);

			return pages.split("\r\n|\r|\n").length;
		} catch (Exception e) {
			System.out.println("Errore estrazione info dal pdf");
			e.printStackTrace();
			return -1;
		}

	}

}
