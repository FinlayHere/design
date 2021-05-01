package version2.duck;

import version2.duck.behavior.CannotFly;
import version2.duck.behavior.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new CannotFly());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void lookLike() {
        System.out.println("褐色外观，黄色嘴巴，木头材质");
    }

    @Override
    void whoAmI() {
        System.out.println("我是木头玩具鸭");
    }
}
