package in.techready.designpatterns.behavioral.command.after;

// Same as TurnOn Command
public class TurnOff implements Command {
   private final Device device;

   public TurnOff(Device device) {
      this.device = device;
   }

   @Override
   public void execute() {
      device.off();
   }
}