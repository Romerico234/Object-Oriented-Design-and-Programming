
public class PriceManager implements Observer {

    private final Menu menu;

    public PriceManager(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void update() {
        // Example: Adjust the price of item #1 slightly upon update.
        // In a real system, this might be triggered by inventory levels or sales data.
        MenuItem mi = menu.getItemByNumber(1);
        if (mi instanceof ConcreteMenuItem) {
            ConcreteMenuItem cmi = (ConcreteMenuItem) mi;
            double newPrice = cmi.getPrice() + 0.50;
            cmi.setPrice(newPrice);
        }
    }
}
