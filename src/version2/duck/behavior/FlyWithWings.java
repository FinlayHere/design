package version2.duck.behavior;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("扇动翅膀，飞了起来");
    }
}
