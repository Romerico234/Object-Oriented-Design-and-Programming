
public class ConcreteMenuItem implements MenuItem {

    private final int itemNumber;
    private final String description;
    private double price;

    public ConcreteMenuItem(int itemNumber, String description, double price) {
        this.itemNumber = itemNumber;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getItemNumber() {
        return itemNumber;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
