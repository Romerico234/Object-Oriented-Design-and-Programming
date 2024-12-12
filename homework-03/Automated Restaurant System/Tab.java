
import java.util.ArrayList;
import java.util.List;

public class Tab {

    private final List<String> lineItems;
    private double total;

    public Tab(Menu menu, Orders orders) {
        lineItems = new ArrayList<>();
        total = 0.0;
        for (OrderItem oi : orders.getOrderItems()) {
            MenuItem mi = menu.getItemByNumber(oi.getItemNumber());
            if (mi != null) {
                lineItems.add(mi.getDescription() + " - $" + mi.getPrice());
                total += mi.getPrice();
            }
        }
        lineItems.add("Total: $" + total);
    }

    public String[] getTabLines() {
        return lineItems.toArray(new String[0]);
    }
}
