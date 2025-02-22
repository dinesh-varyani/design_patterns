package in.techready.designpatterns.structural.proxy.after;

// Step 6: Modify RealService to implement 
// RemoteServiceInterface
public class RemoteService implements RemoteServiceInterface {
    public String fetchDataFromRemote(String endpoint) {
        // Simulating a network request to fetch data
        System.out.println("Fetching data from remote service: " + endpoint);
        // Actual implementation would involve HTTP requests
        return "Data from remote service for " + endpoint;
    }

    public String fetchData(String endpoint) {
        return fetchDataFromRemote(endpoint);
    } 
}