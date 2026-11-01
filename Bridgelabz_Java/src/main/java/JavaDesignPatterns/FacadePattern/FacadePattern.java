package JavaDesignPatterns.FacadePattern;


class CPU {
    void start() {
        System.out.println("CPU started");
    }
}

class Memory {
    void check() {
        System.out.println("Memory checked");
    }
}

class HardDrive {
    void load() {
        System.out.println("Operating system loaded");
    }
}

// Facade
class ComputerFacade {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private HardDrive hardDrive = new HardDrive();

    public void startComputer() {
        cpu.start();
        memory.check();
        hardDrive.load();
    }
}

public class FacadePattern {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
    }
}