package in.techready.designpatterns.structural.proxy.before;

// Step 2: The actual remote service
public class RemoteService {
    public static String fetchDataFromRemote(String endpoint){
        // Simulating a network request to fetch data
        System.out.println("Fetching data from remote service: " + endpoint);
        // Actual implementation would involve HTTP requests, 
        // etc.
        return "Data from remote service for " + endpoint;
    }
}