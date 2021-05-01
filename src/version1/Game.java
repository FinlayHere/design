package version1;

import version1.duck.Duck;
import version1.duck.GreenHeadDuck;
import version1.duck.RedHeadDuck;
import version1.duck.RubberDuck;

// 现在我们想让一些鸭子会飞
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
    }
}
