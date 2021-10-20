package motors.cars;

import components.Engine;
import components.Frame;
import components.Gearbox;
import components.Tire;
import motors.cars.Car;

public class ElectricCar extends Car {
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    @Override
    public void show(){
        System.out.println("这是一辆电动汽车，组成部分有: "
                + engine.toString() + ", "
                + gearbox.toString() + ", "
                + frame.toString() + ", "
                + tire.toString() + "。");
    }

    @Override
    public String toString() {
        return "电动汽车";
    }
}
