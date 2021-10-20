package motors.cars;

import components.Engine;
import components.Frame;
import components.Gearbox;
import components.Tire;

public class GasCar extends Car {
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

    public void show(){
        System.out.println("这是一辆燃油汽车，组成部分有: "
                + engine.toString() + ", "
                + gearbox.toString() + ", "
                + frame.toString() + ", "
                + tire.toString() + "。");
    }

    @Override
    public String toString() {
        return "燃油汽车";
    }
}
