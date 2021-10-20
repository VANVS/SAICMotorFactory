package directors;

import ObserverModal.Observer;
import builder.*;
import factory.*;
import motors.Motor;
import motors.cars.Car;
import type.CarTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class SAICMOTORCarDirector extends MotorDirector{
    private Map<Map.Entry<CarBuilder,AbstractComponentFactory>, Integer> carBuilderIntegerMap;

    public SAICMOTORCarDirector(Map<Map.Entry<CarBuilder, AbstractComponentFactory>, Integer> carBuilderIntegerMap){
        this.carBuilderIntegerMap = carBuilderIntegerMap;
    }

    public List<Motor> Construct(){
        List<Motor> products = new ArrayList<>();
        for(Map.Entry<Map.Entry<CarBuilder,AbstractComponentFactory>, Integer> entry : carBuilderIntegerMap.entrySet()){

            Map.Entry<CarBuilder,AbstractComponentFactory> builderAndFactoryPair = entry.getKey();

            CarBuilder carBuilder = builderAndFactoryPair.getKey();
            AbstractComponentFactory factory = builderAndFactoryPair.getValue();

            int num = entry.getValue();
            for(int i=0; i <num;i++){
                carBuilder.setComponentFactory(factory);
                carBuilder.buildEngine();
                carBuilder.buildGearbox();
                carBuilder.buildFrame();
                carBuilder.buildTire();
                Car car = carBuilder.getCar();
                products.add(car);
            }
        }

        return products;
    }

    @Override
    public void response(){
        for(Map.Entry<Map.Entry<CarBuilder,AbstractComponentFactory>, Integer> entry : carBuilderIntegerMap.entrySet()){
            Map.Entry<CarBuilder,AbstractComponentFactory> builderAndFactoryPair = entry.getKey();
            if (builderAndFactoryPair.getKey().getCAR_NAME().equals(CarTypes.GASGAR)){
                this.carBuilderIntegerMap.put(builderAndFactoryPair, entry.getValue() / 2);
            }
            if (builderAndFactoryPair.getKey().getCAR_NAME().equals(CarTypes.ELECTRICGAR)){
                this.carBuilderIntegerMap.put(builderAndFactoryPair, entry.getValue() * 2);
            }
        }
    }

}
