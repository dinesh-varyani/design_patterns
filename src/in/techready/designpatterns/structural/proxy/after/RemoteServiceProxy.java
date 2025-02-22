package in.techready.designpatterns.structural.proxy.after;

import java.util.HashMap;
import java.util.Map;

// Step 4: Proxy class for controlling access, caching, and 
// logging
public class RemoteServiceProxy implements 
                                      RemoteServiceInterface {
    private RemoteService realService;
    private Map<String, String> cache;

    public RemoteServiceProxy() {
        this.realService = new RemoteService();
        this.cache = new HashMap<>();
    }

    public String fetchData(String endpoint) {
        // Check if data is in the cache
        if (cache.containsKey(endpoint)) {
            System.out.println("Fetching data from cache: " + 
                                endpoint);
            return cache.get(endpoint);
        } else {
            // Fetch data from the real service
            String data = 
                    realService.fetchDataFromRemote(endpoint);
            // Cache the result
            cache.put(endpoint, data);
            // Log the access
            System.out.println("Logged access to: " + 
                                                    endpoint);
            return data;
        }
    }
}