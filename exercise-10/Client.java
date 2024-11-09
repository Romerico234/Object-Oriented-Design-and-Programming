public class Client {
    private static Dialog dialog;

    public static void main(String[] args) {
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
