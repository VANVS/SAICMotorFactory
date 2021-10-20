package components;

abstract public class Frame {
    public void show(){
        System.out.println("这是一个抽象的汽车车架");
    }
    @Override
    public String toString() {
        return "抽象汽车车架";
    }
}
