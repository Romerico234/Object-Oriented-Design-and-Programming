
public class DisplayMenuCommand implements Command {

    private final Aggregator aggregator;

    public DisplayMenuCommand(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public Object execute() {
        Menu menu = aggregator.getMenu();
        return menu.toStringArray();
    }
}
