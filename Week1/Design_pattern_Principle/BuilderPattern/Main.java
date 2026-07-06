public class Main {
    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1000)
                .setGPU("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();
        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM(8)
                .setStorage(512)
                .setOperatingSystem("Windows 10")
                .build();

        gamingPC.display();
        officePC.display();
    }
}
