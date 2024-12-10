// Client class to demonstrate usage
public class Client {
    public static void main(String[] args) {
        // Basic TextField
        Widget widget = new TextField(80, 24);
        System.out.println("Basic TextField:");
        widget.draw();
        
        System.out.println("\nTextField with ScrollDecorator:");
        Widget widget2 = new ScrollDecorator(new TextField(80, 24));
        widget2.draw();
        
        System.out.println("\nTextField with multiple decorators:");
        Widget widget3 = new BorderDecorator(
            new BorderDecorator(
                new ScrollDecorator(
                    new TextField(80, 24)
                )
            )
        );
        widget3.draw();
    }
}