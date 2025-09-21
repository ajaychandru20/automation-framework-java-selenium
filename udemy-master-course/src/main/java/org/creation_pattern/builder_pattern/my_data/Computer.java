package org.creation_pattern.builder_pattern.my_data;

class Computer {
    private final Long id;   // immutable
    private final int RAM;
    private final String CPU;
    private final String GPU;
    private final String Storage;
    private final String SMPS;

    // private constructor
    private Computer(Builder builder) {
        this.id = builder.id;
        this.RAM = builder.RAM;
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.Storage = builder.Storage;
        this.SMPS = builder.SMPS;
    }

    public static class Builder {
        private final Long id;   // mandatory
        private int RAM;
        private String CPU;
        private String GPU;
        private String Storage;
        private String SMPS;

        public Builder(Long id) {
            this.id = id;
        }

        public Builder ram(int RAM) { this.RAM = RAM; return this; }
        public Builder processor(String CPU) { this.CPU = CPU; return this; }
        public Builder graphicsCard(String GPU) { this.GPU = GPU; return this; }
        public Builder storage(String Storage) { this.Storage = Storage; return this; }
        public Builder powerSupply(String SMPS) { this.SMPS = SMPS; return this; }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", RAM=" + RAM +
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", Storage='" + Storage + '\'' +
                ", SMPS='" + SMPS + '\'' +
                '}';
    }
}
