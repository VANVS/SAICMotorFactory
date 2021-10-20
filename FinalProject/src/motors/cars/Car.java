package motors.cars;

import components.Engine;
import components.Frame;
import components.Gearbox;
import components.Tire;
import motors.Motor;

// 抽象小汽车类
abstract public class Car implements Motor {
    protected Engine engine;
    protected Frame frame;
    protected Gearbox gearbox;
    protected Tire tire;

    public abstract void setEngine(Engine engine);

    public abstract void setFrame(Frame frame);

    public abstract void setGearbox(Gearbox gearbox);

    public abstract void setTire(Tire tire);

    public void show(){
        System.out.println("这是一辆抽象汽车，组成部分有: "
                + engine.toString() + ", "
                + gearbox.toString() + ", "
                + frame.toString() + ", "
                + tire.toString() + "。");
    }

    @Override
    public String toString() {
        return "抽象汽车";
    }
}
