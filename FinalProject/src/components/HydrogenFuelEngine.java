package components;

public class HydrogenFuelEngine extends Engine{
    @Override
    public void ignite(){
        System.out.println("氢燃料发动机启动");
    }

    @Override
    public void show(){
        System.out.println("这是一个氢燃料发动机");
    }

    @Override
    public String toString() {
        return "氢燃料发动机";
    }
}
