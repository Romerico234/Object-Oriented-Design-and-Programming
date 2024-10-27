import java.util.Scanner;

public class GenerateBill {
    public static void main(String[] args) {
        PlanFactory planFactory = new PlanFactory();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the name of plan for which the bill will be generated: ");
            String planName = scanner.nextLine();
            
            System.out.print("Enter the number of units for bill calculation: ");
            int units = scanner.nextInt();
            
            Plan plan = planFactory.getPlan(planName);
            if (plan != null) {
                plan.getRate();
                plan.calculateBill(units);
            } else {
                System.out.println("Invalid plan type.");
            }
        }
    }
}
