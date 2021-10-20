package components;

public class ElectralEngine extends Engine{
    @Override
    public void ignite(){
        System.out.println("电动发动机启动");
    }

    @Override
    public void show(){
        System.out.println("这是一个电动发动机");
    }

    @Override
    public String toString() {
        return "电动发动机";
    }
}
