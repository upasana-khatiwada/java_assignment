public class Printer {
    public synchronized void printDocument(String document) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Printing page " + i + " of " + document);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Document printing completed: " + document);
    }
}