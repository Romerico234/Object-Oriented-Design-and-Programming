
import java.util.ArrayList;
import java.util.List;

public class Menu implements Subject {

    private final List<MenuItem> items = new ArrayList<>();
    private final List<Observer> observers = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public MenuItem getItemByNumber(int num) {
        for (MenuItem mi : items) {
            if (mi.getItemNumber() == num) {
                return mi;
            }
        }
        return null;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public String[] toStringArray() {
        String[] lines = new String[items.size()];
        for (int i = 0; i < items.size(); i++) {
            MenuItem mi = items.get(i);
            lines[i] = mi.getItemNumber() + ": " + mi.getDescription() + " - $" + mi.getPrice();
        }
        return lines;
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update();
        }
    }
}
