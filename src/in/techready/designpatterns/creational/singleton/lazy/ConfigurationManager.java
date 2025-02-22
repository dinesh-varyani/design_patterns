package in.techready.designpatterns.creational.singleton.lazy;

class ConfigurationManager {

    // Step 1: Create a private static instance variable (not 
    // initialized)
    private static ConfigurationManager instance;

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
    // single instance with lazy initialization
    public static ConfigurationManager getInstance() {
        // Lazy initialization: create the instance only if 
        // it's null
        if (instance == null) {
            instance = new ConfigurationManager();
        }
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

    public void printConfigurationManager() {
        System.out.println("ConfigurationManagerInfo - " +
                this.getClass().getSimpleName() + " - " + 
                this.hashCode());
    }
}

