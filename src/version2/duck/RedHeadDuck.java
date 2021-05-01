package version2.duck;

public class RedHeadDuck extends Duck {
    @Override
    public void lookLike(){
        System.out.println("一只红色头的鸭子");
    }

    @Override
    void whoAmI() {
        System.out.println("我是红头鸭");
    }
}
