package version2.duck;

import version2.duck.behavior.CannotFly;
import version2.duck.behavior.MuteQuack;
import version2.duck.behavior.ZhizhiQuack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehavior(new CannotFly());
        setQuackBehavior(new ZhizhiQuack());
    }

    @Override
    public void lookLike() {
        System.out.println("黄色外观，红色嘴巴，塑料材质");
    }

    @Override
    void whoAmI() {
        System.out.println("我是小黄鸭");
    }
}
