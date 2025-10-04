package org.creation_pattern.builder_pattern.my_data.my_code;

public class Computer {
    private Long id;
    private int RAM;
    private String CPU;
    private String GPU;
    private String Storage;
    private String SMPS;

    // 🔹 Static nested Builder class
    public static class Builder {
        private final Long id; // mandatory
        private int RAM;
        private String CPU;
        private String GPU;
        private String Storage;
        private String SMPS;

        // Mandatory parameter in constructor
        public Builder(Long id) {
            this.id = id;
        }

        // Fluent builder methods
        public Builder tempMemory(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder processor(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder graphicsCard(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder dataStore(String Storage) {
            this.Storage = Storage;
            return this;
        }

        public Builder powerSupply(String SMPS) {
            this.SMPS = SMPS;
            return this;
        }

        // Build method
        public Computer build() {
            Computer computer = new Computer();
            computer.id = id;
            computer.RAM = RAM;
            computer.CPU = CPU;
            computer.GPU = GPU;
            computer.Storage = Storage;
            computer.SMPS = SMPS;
            return computer;
        }
    }

    // Private constructor
    private Computer() { }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getRAM() { return RAM; }
    public void setRAM(int RAM) { this.RAM = RAM; }

    public String getCPU() { return CPU; }
    public void setCPU(String CPU) { this.CPU = CPU; }

    public String getGPU() { return GPU; }
    public void setGPU(String GPU) { this.GPU = GPU; }

    public String getStorage() { return Storage; }
    public void setStorage(String storage) { Storage = storage; }

    public String getSMPS() { return SMPS; }
    public void setSMPS(String SMPS) { this.SMPS = SMPS; }
}
