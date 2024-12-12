
public class Invoker {

    private final Aggregator aggregator;

    public Invoker(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    public Object invokeDisplayMenu() {
        Command cmd = new DisplayMenuCommand(aggregator);
        return cmd.execute();
    }

    public Object invokeSubmitOrder(int[] itemNums) {
        Command cmd = new SubmitOrderCommand(aggregator, itemNums);
        return cmd.execute();
    }

    public Object invokeDisplayTab() {
        Command cmd = new DisplayTabCommand(aggregator);
        return cmd.execute();
    }
}
