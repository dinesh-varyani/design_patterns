package in.techready.designpatterns.behavioral.command.after;

// ConcreteCommand classes - TurnOn Command is the concrete
// implementation of Command interface also having a Device
// with it which is been set up by the constructor.
// Its implemented execute method will call the
// turnOn Button on the remote control and will
// start the television or any other device.
public class TurnOn implements Command {
   private final Device device;

   public TurnOn(Device device) {
      this.device = device;
   }

   @Override
   public void execute() {
      device.on();
   }
}