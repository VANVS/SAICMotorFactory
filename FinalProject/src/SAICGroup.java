import ObserverModal.Observer;
import ObserverModal.Subject;
import builder.CarBuilder;
import directors.MotorDirector;
import directors.SAICMOTORCarDirector;
import factory.AbstractComponentFactory;
import builder.*;
import factory.*;
import motors.Motor;

import java.util.*;

// 上汽集团类，用于接受命令，生产汽车或作出调整
public class SAICGroup {
    // 用于存储 命令 和 目标类 的对应关系
    private static Map<String, Subject> infoAndAction = new HashMap<>();
    // 用于存储 命令 和 装配指挥者 的对应关系
    private static Map<String, MotorDirector> constructInst = new HashMap<>();
    // 建造者 和 零件制造工厂 一一对应，表示一类汽车的制造，以及对应的 计划制造数
    private static Map<Map.Entry<CarBuilder, AbstractComponentFactory>, Integer> CarProductSchedule = new HashMap<>();

    static{
        Subject subject = new SAICMOTOREnergySaving();
        SAICMOTORCarDirector carDirector;

        Scanner sc = new Scanner(System.in);
        System.out.println("初始只能生产燃油汽车和电动汽车，请输入两者的计划产量：");
        System.out.print("燃油汽车：");
        int gasNum = sc.nextInt();
        System.out.print("电动汽车：");
        int eleNum = sc.nextInt();

        CarProductSchedule.put(new AbstractMap.SimpleEntry<>(new GasCarBuilder(), new GasCarComponentFactory()), gasNum);
        CarProductSchedule.put(new AbstractMap.SimpleEntry<>(new ElectricCarBuilder(), new ElectricCarComponentFactory()), eleNum);
        carDirector = new SAICMOTORCarDirector(CarProductSchedule);
        subject.add(carDirector);

        infoAndAction.put("节能减排", subject);
        constructInst.put("生产汽车", carDirector);

    }

    // 添加相应的发布信息（目标类）
    public static void AddInfo(String info, Subject subject){
        infoAndAction.put(info, subject);
    }

    // 接受信息 作出相应的调整
    public static void Adjust(String info){
        System.out.println("*******************");
        System.out.println("收到讯息：" + info + ", #开始调整");
        System.out.println("*******************");
        try{
            infoAndAction.get(info).notifyObserver();
        }catch(Exception e){
            System.out.println("没有相关命令");
            e.printStackTrace();
        }
    }

    // 根据命令 生成一批车
    public static void ConstructMotor(String info){
        try{
            List<Motor> motors = constructInst.get(info).Construct();
            System.out.println(motors.toString());
        }catch(Exception e){
            System.out.println("没有相关命令");
            e.printStackTrace();
        }
    }


    public static Map<String, Subject> getInfoAndAction() {
        return infoAndAction;
    }
}
