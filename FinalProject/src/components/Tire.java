package components;

abstract public class Tire {
    public void show(){
        System.out.println("这是一个抽象的轮胎");
    }

    @Override
    public String toString() {
        return "抽象轮胎";
    }
}
