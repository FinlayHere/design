package version2.duck.behavior;

public class CannotFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我不能飞");
    }
}
