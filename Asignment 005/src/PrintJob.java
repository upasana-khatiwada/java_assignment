public class PrintJob implements Runnable {
    Printer printer;
     String document;

    public PrintJob(Printer printer, String document) {
        this.printer = printer;
        this.document = document;
    }

    public void run() {
        printer.printDocument(document);
    }
}
