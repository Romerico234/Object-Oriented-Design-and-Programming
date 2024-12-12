
public class Aggregator {

    private final Menu menu;
    private final Orders orders;

    public Aggregator(Menu menu, Orders orders) {
        this.menu = menu;
        this.orders = orders;
    }

    public Menu getMenu() {
        return menu;
    }

    public Orders getOrders() {
        return orders;
    }
}
