package in.techready.designpatterns.behavioral.command.after;

// Invoker class
public class RemoteControl {
   private Command command;

   void setCommand(Command command) {
      this.command = command;
   }

   void pressButton() {
      command.execute();
   }
}