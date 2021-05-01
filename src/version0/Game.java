package version0;

import version0.duck.Duck;
import version0.duck.GreenHeadDuck;
import version0.duck.RedHeadDuck;
import version0.duck.RubberDuck;

public class Game {
    // 假设现在设计一款游戏，游戏中有各种鸭子，一边游泳一边呱呱叫
    // 现在游戏中多了一个小黄鸭
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
