package version1.duck;

// 小黄鸭
public class RubberDuck extends Duck {
    public void quack() {
        System.out.println("不会叫，被捏的时候会发出吱吱的声音");
    }

    public void lookLike() {
        System.out.println("黄色外观，红色嘴巴，塑料材质");
    }

    //小黄鸭不会飞
    public void fly() {
        System.out.println("他不能飞");
    }
}
