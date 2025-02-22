package in.techready.designpatterns.creational.builder.after;

// Builder interface
interface Builder {
    Builder setCPU(String CPU);
    Builder setRAM(String RAM);
    Builder setStorageCapacity(int storageCapacity);
    Builder setGPU(String GPU);
}

// Concrete builder class
class ComputerBuilder implements Builder {
    protected String CPU;
    protected String RAM;
    protected int storageCapacity;
    protected String GPU;

    @Override
    public Builder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    @Override
    public Builder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    @Override
    public Builder setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
        return this;
    }

    @Override
    public Builder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    
    public Computer build() {
        return new Computer(this);
    }
}

// Director class
class Director {
    public Computer constructGamingPC(Builder builder) {
        return ((ComputerBuilder) builder.setCPU("Intel i9")
                              .setRAM("32GB RAM")
                              .setStorageCapacity(512)
                              .setGPU("NVIDIA RTX 3080"))
                      .build();
    }
    // You can have other construction methods for different 
    // types of computers...
}

// Product class
class Computer {
    private String CPU;
    private String RAM;
    private int storageCapacity;
    private String GPU;

    public Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storageCapacity = builder.storageCapacity;
        this.GPU = builder.GPU;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storageCapacity=" + storageCapacity +
                ", GPU='" + GPU + '\'' +
                '}';
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder computerBuilder = new ComputerBuilder();

        Computer gamingPC = 
                 director.constructGamingPC(computerBuilder);
        System.out.println(gamingPC);
    }
}

