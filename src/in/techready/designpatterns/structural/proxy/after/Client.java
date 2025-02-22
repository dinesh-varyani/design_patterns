package in.techready.designpatterns.structural.proxy.after;

// Step 7: Modify the Client to use the Proxy
public class Client {
    public static void main(String[] args) {
        RemoteServiceInterface service = 
                                     new RemoteServiceProxy();
        String data = service.fetchData("/api/resource");
        System.out.println("Received data: " + data);
    }
}

