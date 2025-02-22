package in.techready.designpatterns.creational.singleton.eager;

public class ConfigurationManager {

    // Step 1: Create a private static instance variable
    private static final ConfigurationManager instance = new ConfigurationManager();

    // Application settings
    private String databaseUrl;
    private String apiKey;

    // Step 2: Make the constructor private to prevent 
    // external instantiation
    private ConfigurationManager() {
        // Private constructor to prevent instantiation
        // Initialize default settings
        this.databaseUrl = 
            "jdbc:mysql://localhost:3306/mydatabase";
        this.apiKey = "default-api-key";
    }

    // Step 3: Provide a public static method to access the  
    // single instance
    public static ConfigurationManager getInstance() {
        return instance;
    }

    // Getter and setter methods for application settings
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    // Other methods related to configuration management
    // ...

    // Example method
    public void displayConfiguration() {
        System.out.println("Database URL: " + databaseUrl);
        System.out.println("API Key: " + apiKey);
    }
}

