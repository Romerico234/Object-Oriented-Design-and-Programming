
// Abstract Decorator class
public abstract class Decorator implements Widget {
    protected Widget widget;
    
    public Decorator(Widget widget) {
        this.widget = widget;
    }
    
    @Override
    public void draw() {
        widget.draw();
    }
}





