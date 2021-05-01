package duck;

public class Duck {
    public void quack() {
        System.out.println("呱呱");
    }

    public void swim() {
        System.out.println("游泳中");
    }

    public void lookLike() {
        System.out.println("一直普通的鸭子");
    }

    public void display(){
        lookLike();
        swim();
        quack();
    }
}
