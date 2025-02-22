package in.techready.designpatterns.behavioral.command.after;

// This would be another concrete device
// other than Television
public class Light implements Device {
   public void on() {
      System.out.println("Light is On");
   }

   public void off() {
      System.out.println("Light is Off");
   }
}