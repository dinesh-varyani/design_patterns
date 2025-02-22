package in.techready.designpatterns.behavioral.command.after;

// Lets create a new concrete device say
// Television which will implement all the
// methods of Device interface.
public class TV implements Device {

   public void on() {
      System.out.println("TV is On");
   }

   public void off() {
      System.out.println("TV is Off");
   }
}