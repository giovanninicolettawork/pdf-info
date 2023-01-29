# Pdf Info

Questo software consente di ottenere varie informazioni relative ad un file pdf. 
Nello specifico, dopo aver inserito in console il path del file da analizzare, le informazioni estrapolate saranno:
- data di creazione file
- data di ultimo accesso al file
- dimensione del file
- data di ultima modifica
- numero di pagine del pdf
- data di modifica del pdf
- data di creazione del pdf
- titolo del pdf
- soggetto del pdf
- produttore del pdf
- creatore del pdf
- autore del pdf
- numero di righe del pdf calcolato con la libreria *org.apache.pdfbox* (tale risultato potrebbe essere non corretto nel caso di presenza di immagini, tabelle, ecc nel pdf)

# Specifiche

Il codice è stato scritto in *Java (11)* utilizzando *Maven*. Nel file *pom.xml* è definita la modalità di build.

## Installazione e utilizzo
Il codice può essere eseguito utilizzando un IDE (es. su Eclipse basta eseguire *Runs As Java Application* sul file *App.java*).
È altresì possibile generare il file jar tramite il comando *Maven Install*. Verrà generato, nella cartella target, il file *pdfInfo.jar* che potrà essere eseguito da terminale in ogni ambiente (con l'unico requisito che sia installato Java).
Per eseguire il jar lanciare sul terminale il comando

    java -jar pdfInfo.jar

## Stato del progetto
Si tratta di un software implementato al solo scopo di acquisire confidenza con *Java*