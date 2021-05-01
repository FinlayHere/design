package version2;

import version2.duck.DecoyDuck;
import version2.duck.GreenHeadDuck;
import version2.duck.RedHeadDuck;
import version2.duck.RubberDuck;
import version2.duck.Duck;

//  现在让我做一些重构 把鸭子的行为和鸭子类分开分开
public class Game {
    public static void main(String[] args) {
//        Duck duck = new Duck();
//        duck.display();
        System.out.println("<<------------------------我是分隔符---------------------->>");
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        System.out.println("<<------------------------我是分隔符---------------------->>");
        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
        greenHeadDuck.display();
        System.out.println("<<------------------------我是分隔符---------------------->>");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        System.out.println("<<------------------------我是分隔符---------------------->>");
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
    }

}
