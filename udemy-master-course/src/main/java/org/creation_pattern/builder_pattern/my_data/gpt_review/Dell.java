package org.creation_pattern.builder_pattern.my_data.gpt_review;

public class Dell {
    public static void main(String[] args) {
        Computer comp = new Computer.Builder(1L)
                .ram(1048)
                .processor("Intel i7")
                .graphicsCard("RTX 3050")
                .storage("2TB")
                .build();

        System.out.println(comp.toString());
//        System.out.println(
//                "  The ID of computer: " + computer.getId() +
//                        "\n  The TempMemory: " + computer.getRAM() +
//                        "\n  The Processor is: " + computer.getCPU() +
//                        "\n  The Graphic Card is: " + computer.getGPU() +
//                        "\n  The DataStorage is: " + computer.getStorage() +
//                        "\n  The Power Supply is: " + computer.getSMPS()
//        );
    }
}
