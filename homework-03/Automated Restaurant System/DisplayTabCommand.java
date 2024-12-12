
public class DisplayTabCommand implements Command {

    private final Aggregator aggregator;

    public DisplayTabCommand(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public Object execute() {
        Menu menu = aggregator.getMenu();
        Orders orders = aggregator.getOrders();
        Tab tab = new Tab(menu, orders);
        return tab.getTabLines();
    }
}
