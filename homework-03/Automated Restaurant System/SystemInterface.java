
import java.util.InputMismatchException;
import java.util.Scanner;

public class SystemInterface {

    private static Invoker invoker;

    public static void main(String[] args) {
        Aggregator aggregator = setupSystem();
        invoker = new Invoker(aggregator);

        try (Scanner sc = new Scanner(System.in)) {
            boolean running = true;

            while (running) {
                System.out.println("\n--- Automated Restaurant System ---");
                System.out.println("1. Display Menu");
                System.out.println("2. Submit Order");
                System.out.println("3. Display Tab");
                System.out.println("4. Exit");
                System.out.print("Select an option: ");

                int choice = -1;
                try {
                    choice = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number for your choice.");
                    sc.nextLine(); // consume invalid input
                    continue;
                }
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1 ->
                        displayMenu();
                    case 2 ->
                        submitOrder(sc);
                    case 3 ->
                        displayTab();
                    case 4 -> {
                        running = false;
                        System.out.println("Goodbye!");
                    }
                    default ->
                        System.out.println("Invalid choice, please select a valid option.");
                }
            }
        }
    }

    private static Aggregator setupSystem() {
        Menu menu = new Menu();

        // Add some menu items
        menu.addItem(new ConcreteMenuItem(1, "Roast Beef", 15.00));
        menu.addItem(new ConcreteMenuItem(2, "Chicken Korma", 12.50));
        menu.addItem(new ConcreteMenuItem(3, "Jiaozi", 10.00));

        // Attach an PriceManager Observer
        PriceManager priceManager = new PriceManager(menu);
        menu.attach(priceManager);

        Orders orders = new Orders();
        return new Aggregator(menu, orders);
    }

    public static void displayMenu() {
        Object result = invoker.invokeDisplayMenu();
        if (result instanceof String[]) {
            String[] menuLines = (String[]) result;
            System.out.println("----- MENU -----");
            for (String line : menuLines) {
                System.out.println(line);
            }
        } else {
            System.out.println("Error displaying menu.");
        }
    }

    public static void submitOrder(Scanner sc) {
        System.out.print("Enter menu item numbers to order, separated by spaces: ");
        String line = sc.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println("No items entered.");
            return;
        }

        String[] parts = line.split("\\s+");
        int[] itemNums = new int[parts.length];
        try {
            for (int i = 0; i < parts.length; i++) {
                itemNums[i] = Integer.parseInt(parts[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric item numbers.");
            return;
        }

        Object result = invoker.invokeSubmitOrder(itemNums);
        if (result instanceof Boolean && (Boolean) result) {
            System.out.println("Order submitted successfully!");
        } else if (result instanceof String) {
            System.out.println("Error submitting order: " + result);
        } else {
            System.out.println("An unknown error occurred when submitting the order.");
        }
    }

    public static void displayTab() {
        Object result = invoker.invokeDisplayTab();
        if (result instanceof String[]) {
            String[] tabLines = (String[]) result;
            System.out.println("----- TAB -----");
            for (String line : tabLines) {
                System.out.println(line);
            }
        } else {
            System.out.println("Error displaying tab.");
        }
    }
}
