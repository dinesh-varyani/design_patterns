package in.techready.designpatterns.structural.proxy.before;

// Step 3: Using the RemoteServiceClient
public class Client {
    public static void main(String[] args) {
        RemoteServiceClient client = 
                                   new RemoteServiceClient();
        String data = client.fetchData("/api/resource");
        System.out.println("Received data: " + data);
    }
}

