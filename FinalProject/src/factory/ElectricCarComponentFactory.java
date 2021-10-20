package factory;

import components.*;

public class ElectricCarComponentFactory implements AbstractComponentFactory{
    public Engine produceEngine(){
        System.out.println("生产了一台电动发动机");
        return new ElectralEngine();
    }
    public Gearbox produceGearbox(){
        System.out.println("生产了一台DCT变速箱");
        return new DCTGearbox();
    }
    public Frame produceFrame(){
        System.out.println("生产了一台金属车架");
        return new MetalFrame();
    }
    public Tire produceTire(){
        System.out.println("生产了一股PC轮胎");
        return new PCTire();
    }
}
