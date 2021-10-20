package components;

public class GasEngine extends Engine{
    @Override
    public void ignite(){
        System.out.println("汽油发动机点火");
    }

    @Override
    public void show(){
        System.out.println("这是一个汽油发动机");
    }

    @Override
    public String toString() {
        return "汽油发动机";
    }
}
