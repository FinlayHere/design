import duck.Duck;
import duck.RedHeadDuck;

public class Game {
    // 假设现在设计一款游戏，游戏中有各种鸭子，一边游泳一边呱呱叫
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.display();

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
    }
}
