package org.creation_pattern.builder_pattern.my_data.my_code;

public class Dell {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder(1L)
                .tempMemory(1048)
                .processor("Intel i7")
                .graphicsCard("NVIDIA RTX 3050")
                .dataStore("2TB")
                .powerSupply("500W")
                .build();

        System.out.println(
                "The ID of computer: " + computer.getId() +
                        "\nThe TempMemory: " + computer.getRAM() +
                        "\nThe Processor is: " + computer.getCPU() +
                        "\nThe Graphic Card is: " + computer.getGPU() +
                        "\nThe DataStorage is: " + computer.getStorage() +
                        "\nThe Power Supply is: " + computer.getSMPS()
        );
    }
}
