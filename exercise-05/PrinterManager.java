public class PrinterManager {
    private static PrinterManager singleInstance;
    private Printer[] printers;
    private final int SIZE = 8;

    private PrinterManager() { 
        printers = new Printer[SIZE];
        for (int i = 0; i < SIZE; i++) {
            printers[i] = new Printer();
        } 
    }

    public static PrinterManager getInstance() {
        if (singleInstance == null) {
            singleInstance = new PrinterManager();
        }
        return singleInstance;
    }

    public void assignJob(String printJob) {
        boolean allPrintersBusy = true;
        for (int i = 0; i < printers.length; i++) {
            if (!printers[i].isBusy()) {
                allPrintersBusy = false;
                printers[i].setPrintJob(printJob);
                printers[i].setBusy(true);
                break;
            }
        }

        if (allPrintersBusy) {
            System.out.println("All printers were busy!");
        }
    }

    public void showStatus() {
        for (int i = 0; i < printers.length; i++) {
            String message = "Printer " + i + " " + (printers[i].isBusy() ? "Status: Busy" : "Status: Available");
            System.out.println(message);
        }
    }

   
}