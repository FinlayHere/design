package version1.duck;

public class DecoyDuck extends Duck {
    public void swim() {
        System.out.println("随波逐流");
    }

    public void quack() {
        System.out.println("不能发出任何声音");
    }

    public void lookLike() {
        System.out.println("褐色外观，黄色嘴巴，木头材质");
    }
//    木头玩具鸭子同样也不会飞
    public void fly() {
        System.out.println("他不能飞");
    }
}
