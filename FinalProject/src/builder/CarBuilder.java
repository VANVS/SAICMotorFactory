package builder;

import motors.cars.Car;
import factory.AbstractComponentFactory;

abstract public class CarBuilder {
    protected String CAR_NAME;
    protected Car car;
    protected AbstractComponentFactory componentFactory;

    public abstract void buildEngine();
    public abstract void buildGearbox();
    public abstract void buildFrame();
    public abstract void buildTire();

    public void setComponentFactory(AbstractComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
    }

    public String getCAR_NAME() {
        return CAR_NAME;
    }

    public Car getCar(){
        return car;
    }
}
