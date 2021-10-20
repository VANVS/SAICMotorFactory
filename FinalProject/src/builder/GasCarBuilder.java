package builder;
import motors.cars.Car;
import motors.cars.GasCar;
import type.CarTypes;


public class GasCarBuilder extends CarBuilder{
    public GasCarBuilder(){
        CAR_NAME = CarTypes.GASGAR;
        car = new GasCar();
    }

    public void buildEngine(){
        System.out.print("#开始生产燃油汽车发动机... ");
        this.car.setEngine(componentFactory.produceEngine());
    }
    public void buildGearbox(){
        System.out.print("#开始生产燃油汽车变速箱... ");
        this.car.setGearbox(componentFactory.produceGearbox());
    }

    public void buildFrame(){
        System.out.print("#开始生产燃油汽车车架... ");
        this.car.setFrame(componentFactory.produceFrame());
    }

    public void buildTire(){
        System.out.print("#开始生产燃油汽车轮胎... ");
        this.car.setTire(componentFactory.produceTire());
    }


    public Car getCar(){
        System.out.println("组装 燃油汽车 完毕");
        return super.getCar();
    }
}
