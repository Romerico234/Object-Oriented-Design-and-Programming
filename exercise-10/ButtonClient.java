public class ButtonClient {
    private static Dialog dialog;

    public static void main(String[] args) {
        System.out.println("Client: Testing Windows Dialog");
        configure();
        run();
    }

    static void configure() {
        if (System.getProperty("os.name").startsWith("Windows")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void run() {
        dialog.renderWindow();
    }
}
