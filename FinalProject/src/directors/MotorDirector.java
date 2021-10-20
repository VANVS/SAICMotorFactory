package directors;

import ObserverModal.Observer;
import motors.Motor;
import java.util.List;

/*
* */
abstract public class MotorDirector implements Observer {
    public abstract List<Motor> Construct();
    @Override
    public abstract void response();
}
