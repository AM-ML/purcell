class Engine {
    public void start(){
        System.out.println("Engine started running.");
    }

    public void stop(){
        System.out.println("Engine stopped running.");
    }
}

class Machine extends Engine{
    @Override
    public void start(){
        System.out.println("Engine started running.");
        System.out.println("Machine started.");
    }

    @Override
    public void stop(){
        System.out.println("Engine stopped running.");
        System.out.println("Machine stopped.");
    }
}

class Car extends Machine {
    public void turnOn(){
        this.start();
        System.out.println("Car is moving.");
    }

    public void breaks(){
        System.out.println("Car is breaking");
        this.stop();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Engine engine = new Engine();
        engine.start();
        engine.stop();
        
        System.out.println();
        System.out.println();

        Machine mach = new Machine();
        mach.start();
        mach.stop();
        
        System.out.println();
        System.out.println();

        Car car = new Car();
        car.start();
        car.stop();
        car.turnOn();
    }
}
