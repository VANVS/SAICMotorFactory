package builder;

import motors.cars.Car;
import motors.cars.ElectricCar;
import type.CarTypes;

public class ElectricCarBuilder extends CarBuilder{
    public ElectricCarBuilder(){
        CAR_NAME = CarTypes.ELECTRICGAR;
        car = new ElectricCar();
    }

    public void buildEngine(){
        System.out.print("#开始生产电动汽车发动机... ");
        this.car.setEngine(componentFactory.produceEngine());
    }
    public void buildGearbox(){
        System.out.print("#开始生产电动汽车变速箱... ");
        this.car.setGearbox(componentFactory.produceGearbox());
    }

    public void buildFrame(){
        System.out.print("#开始生产电动汽车车架... ");
        this.car.setFrame(componentFactory.produceFrame());
    }

    public void buildTire(){
        System.out.print("#开始生产电动汽车轮胎... ");
        this.car.setTire(componentFactory.produceTire());
    }

    public Car getCar(){
        System.out.println("组装 电动汽车 完毕");
        return super.getCar();
    }
}
