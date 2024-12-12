
public abstract class MenuItemDecorator implements MenuItem {

    protected MenuItem wrappedItem;

    public MenuItemDecorator(MenuItem wrappedItem) {
        this.wrappedItem = wrappedItem;
    }

    @Override
    public String getDescription() {
        return wrappedItem.getDescription();
    }

    @Override
    public double getPrice() {
        return wrappedItem.getPrice();
    }

    @Override
    public int getItemNumber() {
        return wrappedItem.getItemNumber();
    }
}
