package in.techready.designpatterns.behavioral.command.before;

// Client code
public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        RemoteControl livingRoomRemote = 
                           new RemoteControl(livingRoomLight);
        livingRoomRemote.pressButton();
    }
}

