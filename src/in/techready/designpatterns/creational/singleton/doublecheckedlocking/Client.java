package in.techready.designpatterns.creational.singleton.doublecheckedlocking;

public class Client {
    public static void main(String[] args) {
        // Code breaks in multithreaded environment
        for(int i = 0; i < 10; i++){
            new Thread(() -> {
                ConfigurationManager instance = 
                           ConfigurationManager.getInstance();
                instance.printConfigurationManager();
            }).start();
        }
    }
}

