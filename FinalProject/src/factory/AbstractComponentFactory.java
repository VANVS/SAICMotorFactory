package factory;

import components.Engine;
import components.Frame;
import components.Gearbox;
import components.Tire;
/*
* + produceEngine() : Engine
* + produceGearbox() : Gearbox
* + produceFrame() : Frame
* + produceTire() : Tire
* */
public interface AbstractComponentFactory {
    public Engine produceEngine();
    public Gearbox produceGearbox();
    public Frame produceFrame();
    public Tire produceTire();
}
