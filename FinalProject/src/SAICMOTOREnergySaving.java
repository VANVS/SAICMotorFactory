import ObserverModal.Observer;
import ObserverModal.Subject;

// 具体目标类，通知所有观察者需要根据节能减排作出调整
public class SAICMOTOREnergySaving extends Subject{
    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.response();
        }
    }
}
