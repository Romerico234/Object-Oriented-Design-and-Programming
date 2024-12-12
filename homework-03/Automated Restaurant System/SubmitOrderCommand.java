
public class SubmitOrderCommand implements Command {

    private final Aggregator aggregator;
    private final int[] itemNums;

    public SubmitOrderCommand(Aggregator aggregator, int[] itemNums) {
        this.aggregator = aggregator;
        this.itemNums = itemNums;
    }

    @Override
    public Object execute() {
        Orders orders = aggregator.getOrders();
        Menu menu = aggregator.getMenu();

        for (int num : itemNums) {
            MenuItem mi = menu.getItemByNumber(num);
            if (mi == null) {
                return "Item number " + num + " does not exist in the menu.";
            }
        }

        for (int num : itemNums) {
            orders.addItem(num);
        }

        menu.notifyObservers();

        return Boolean.TRUE;
    }
}
