package Lesson05.DiceMan;

import java.util.Random;

public class Dice {
    //Attribute
    private Random rand = new Random();

    //Method
    public int rollDice(){
        int roll = rand.nextInt(6)+1; //1-6
        return roll;
    }
}
