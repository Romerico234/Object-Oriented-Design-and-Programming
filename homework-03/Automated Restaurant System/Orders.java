
import java.util.ArrayList;
import java.util.List;

public class Orders {

    private final List<OrderItem> orderItems = new ArrayList<>();

    public void addItem(int itemNumber) {
        orderItems.add(new OrderItem(itemNumber));
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
}
