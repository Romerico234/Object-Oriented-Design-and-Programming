public class Client {
	public static void main(String[] args) {

		// get the singleton instance
		PrinterManager printerManager = PrinterManager.getInstance();
		// assign some job
		printerManager.assignJob("print something");
		printerManager.showStatus();
		
		System.out.println();
		printerManager.assignJob("print something again");
		// show status
		printerManager.showStatus();

		System.out.println();

		// check if you can get another instance
		PrinterManager printerManager2 = PrinterManager.getInstance();
		// show status
		printerManager2.showStatus();
	}

}
