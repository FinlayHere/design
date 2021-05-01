package version1;

import version1.duck.*;

// 现在我们想让一些鸭子会飞 并且现在多一种木头玩具鸭子
public class Game {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.display();

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();

        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
        greenHeadDuck.display();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
    }
}
