


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        Thread t1 = new Thread(new PrintJob(printer, "Document 1"));
        Thread t2 = new Thread(new PrintJob(printer, "Document 2"));
        Thread t3 = new Thread(new PrintJob(printer, "Document 3"));
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("All print jobs completed.");
    }
}
