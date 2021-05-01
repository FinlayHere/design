package version2.duck;

import version2.duck.behavior.FlyBehavior;
import version2.duck.behavior.FlyWithWings;
import version2.duck.behavior.Quack;
import version2.duck.behavior.QuackBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    private QuackBehavior quackBehavior;

    public Duck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    public void swim() {
        System.out.println("游泳");
    }

    abstract void lookLike();

    abstract void whoAmI();

    public void display() {
        whoAmI();
        lookLike();
        quackBehavior.quack();
        swim();
        flyBehavior.fly();
    }
}
