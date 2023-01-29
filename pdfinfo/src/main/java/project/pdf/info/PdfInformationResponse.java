package project.pdf.info;

import java.util.Date;

public class PdfInformationResponse {

	Date fileCreationTime;
	Date fileLastAccessTime;
	Long fileSize;
	Date fileLastModifyTime;

	int pdfPageNumber;
	Date pdfModificationDate;
	Date pdfCreationDate;
	String pdfTitle;
	String pdfSubject;
	String pdfProducer;
	String pdfCreator;
	String pdfAuthor;
	int pdfLinesNumber;
	int pdfLinesNumberWithSpacesLines;
	int pdfLinesNumberWithoutSpacesLines;

	public int getPdfLinesNumber() {
		return pdfLinesNumber;
	}

	public void setPdfLinesNumber(int pdfLinesNumber) {
		this.pdfLinesNumber = pdfLinesNumber;
	}

	public void setFileCreationTime(Date fileCreationTime) {
		this.fileCreationTime = fileCreationTime;
	}

	public void setFileLastAccessTime(Date fileLastAccessTime) {
		this.fileLastAccessTime = fileLastAccessTime;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public void setFileLastModifyTime(Date fileLastModifyTime) {
		this.fileLastModifyTime = fileLastModifyTime;
	}

	public void setPdfPageNumber(int pdfPageNumber) {
		this.pdfPageNumber = pdfPageNumber;
	}

	public void setPdfModificationDate(Date pdfModificationDate) {
		this.pdfModificationDate = pdfModificationDate;
	}

	public void setPdfCreationDate(Date pdfCreationDate) {
		this.pdfCreationDate = pdfCreationDate;
	}

	public void setPdfTitle(String pdfTitle) {
		this.pdfTitle = pdfTitle;
	}

	public void setPdfSubject(String pdfSubject) {
		this.pdfSubject = pdfSubject;
	}

	public void setPdfProducer(String pdfProducer) {
		this.pdfProducer = pdfProducer;
	}

	public void setPdfCreator(String pdfCreator) {
		this.pdfCreator = pdfCreator;
	}

	public void setPdfAuthor(String pdfAuthor) {
		this.pdfAuthor = pdfAuthor;
	}

	public Date getFileCreationTime() {
		return fileCreationTime;
	}

	public Date getFileLastAccessTime() {
		return fileLastAccessTime;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public Date getFileLastModifyTime() {
		return fileLastModifyTime;
	}

	public int getPdfPageNumber() {
		return pdfPageNumber;
	}

	public Date getPdfModificationDate() {
		return pdfModificationDate;
	}

	public Date getPdfCreationDate() {
		return pdfCreationDate;
	}

	public String getPdfTitle() {
		return pdfTitle;
	}

	public String getPdfSubject() {
		return pdfSubject;
	}

	public String getPdfProducer() {
		return pdfProducer;
	}

	public String getPdfCreator() {
		return pdfCreator;
	}

	public String getPdfAuthor() {
		return pdfAuthor;
	}

	@Override
	public String toString() {
		return "PdfInformationResponse [fileCreationTime=" + fileCreationTime + ", fileLastAccessTime="
				+ fileLastAccessTime + ", fileSize=" + fileSize + ", fileLastModifyTime=" + fileLastModifyTime
				+ ", pdfPageNumber=" + pdfPageNumber + ", pdfModificationDate=" + pdfModificationDate
				+ ", pdfCreationDate=" + pdfCreationDate + ", pdfTitle=" + pdfTitle + ", pdfSubject=" + pdfSubject
				+ ", pdfProducer=" + pdfProducer + ", pdfCreator=" + pdfCreator + ", pdfAuthor=" + pdfAuthor
				+ ", pdfLinesNumber=" + pdfLinesNumber + "]";
	}


}
