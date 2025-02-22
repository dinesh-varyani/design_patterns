package in.techready.designpatterns.structural.proxy.after;

// Step 5: Interface to be implemented by both RealService and 
// Proxy
public interface RemoteServiceInterface {
    String fetchData(String endpoint);
}