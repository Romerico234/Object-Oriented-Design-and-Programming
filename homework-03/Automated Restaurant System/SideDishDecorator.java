
public class SideDishDecorator extends MenuItemDecorator {

    private String sideDescription;
    private double sideCost;

    public SideDishDecorator(MenuItem wrappedItem, String sideDescription, double sideCost) {
        super(wrappedItem);
        this.sideDescription = sideDescription;
        this.sideCost = sideCost;
    }

    @Override
    public String getDescription() {
        return wrappedItem.getDescription() + " + " + sideDescription;
    }

    @Override
    public double getPrice() {
        return wrappedItem.getPrice() + sideCost;
    }
}
