package in.techready.designpatterns.structural.proxy.before;

// Step 1: Class directly interacting with the remote service
public class RemoteServiceClient {
    public String fetchData(String endpoint) {
        // Making a request to the remote service
        String data = 
                  RemoteService.fetchDataFromRemote(endpoint);
        return data;
    }
}