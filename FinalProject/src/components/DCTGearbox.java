package components;

public class DCTGearbox extends Gearbox {
    @Override
    public void show(){
        System.out.println("这是一个DCT变速箱");
    }

    @Override
    public String toString() {
        return "DCT变速箱";
    }
}
