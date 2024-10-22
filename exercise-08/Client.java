//Aimable Mugwaneza and Romerico David
interface Command{
    public void execute();
}

 class Light{

    public void on(){
        System.out.println("Light on");
    }

    public void off(){
        System.out.println("Light off");
    }
}

  class LightsOnCommand implements Command{
    Light light;

    public LightsOnCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.on();
    }
}

 class LightsOffCommand implements Command{
    Light light;

    public  LightsOffCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.off();
    }

}



 class GarageDoor{

    public void open(){
        System.out.println("Door open");
    }

    public void close(){
        System.out.println("Door closed");
    }
}

 class GarageDoorOpenCommand implements Command{
    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door){
        this.door = door;
    }

    public void execute(){
        door.open();
    }

}

class GarageDoorCloseCommand implements Command{
    GarageDoor door;

    public GarageDoorCloseCommand(GarageDoor door){
        this.door = door;
    }

    public void execute(){
        door.close();
    }

}

class RemoteControl {
    private Command command;

    public RemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

//Client
public class Client{
    public static void main(String[] args)    {
      RemoteControl control = new RemoteControl();
      Light light = new Light();
      Command lightsOn = new LightsOnCommand(light);
      Command lightsOff = new LightsOffCommand(light);
      GarageDoor garageDoor = new GarageDoor ();
      Command garageDoorOpen = new GarageDoorOpenCommand (garageDoor);
      Command garageDoorClose = new GarageDoorCloseCommand (garageDoor);
  
      //switch on
      control.setCommand(lightsOn);
      control.pressButton();
      //switch off
      control.setCommand(lightsOff);
      control.pressButton();
      //switch on
      control.setCommand(garageDoorOpen);
      control.pressButton();
      //switch off
      control.setCommand(garageDoorClose);
      control.pressButton();
  
    }
  }
  