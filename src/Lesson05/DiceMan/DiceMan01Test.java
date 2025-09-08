package Lesson05.DiceMan;

public class DiceMan01Test {
    public static void main(String[] args) {
        DiceMan01 dice = new DiceMan01();
        dice.rollDice();

        for (int i=0; i<4; i++){
            dice.rollDice();
        }
    }
}
