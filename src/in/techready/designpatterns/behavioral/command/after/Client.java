package in.techready.designpatterns.behavioral.command.after;

// Client code
public class Client {
   public static void main(String[] args) {
      System.out.println("\nPlaying with Television .... ");
      // Create a Television object
      Device tv = new TV();

      // pass the device information to TurnOn Command so that
      // it invokes based on this television
      TurnOn turnOnCommand = new TurnOn(tv);

      // pass the command information to remotecontrol
      RemoteControl remoteControl = new RemoteControl();
      remoteControl.setCommand(turnOnCommand);
      // when we press the button based on turnOnCommand
      // television is made on
      remoteControl.pressButton();

      // Same is below for every other commands
      TurnOff turnOffCommand = new TurnOff(tv);
      remoteControl.setCommand(turnOffCommand);
      remoteControl.pressButton();

      System.out.println("\nPlaying with Light .... ");

      Device light = new Light();
      turnOnCommand = new TurnOn(light);
      remoteControl.setCommand(turnOnCommand);
      remoteControl.pressButton();
   }
}
