package version2.duck;

public class GreenHeadDuck extends Duck{
    @Override
    public void lookLike(){
        System.out.println("一只绿色头的鸭子");
    }

    @Override
    void whoAmI() {
        System.out.println("我是绿头鸭");
    }
}
