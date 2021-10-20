package components;

abstract public class Engine {
    public void ignite(){
        System.out.println("发动机点火");
    }

    public void show(){
        System.out.println("这是一个抽象的发动机");
    }

    @Override
    public String toString() {
        return "抽象发动机";
    }
}
