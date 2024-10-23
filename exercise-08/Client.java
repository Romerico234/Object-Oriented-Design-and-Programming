//Aimable Mugwaneza and Romerico David

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
  