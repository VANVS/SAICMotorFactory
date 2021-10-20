package components;

abstract public class Gearbox {
    public void show(){
        System.out.println("这是一个抽象的变速箱");
    }

    @Override
    public String toString() {
        return "抽象变速箱";
    }
}
