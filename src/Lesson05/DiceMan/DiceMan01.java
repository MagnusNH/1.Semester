package Lesson05.DiceMan;

public class DiceMan01 {
        //Attribute
        String activity1 = "Eat Breakfast";
        String activity2 = "Study Something boring";
        String activity3 = "Go Swimming";
        String activity4 = "Go Fishing";
        String activity5 = "Call his MOM";
        String activity6 = "Go Back to Bed";
        Dice dice = new Dice();

        //Konstuktør
        public void setActivity1(String activity1, String activity2, String activity3, String activity4, String activity5, String activity6, int dice) {
            this.activity1 = activity1;
            this.activity2 = activity2;
            this.activity3 = activity3;
            this.activity4 = activity4;
            this.activity5 = activity5;
            this.activity6 = activity6;
        }

        //Method
        public void rollDice(){
            int diceRoll = dice.rollDice();


            if(diceRoll ==1) {
                System.out.println("You rolled: " + diceRoll + " - " + activity1);
            } else if(diceRoll==2){
                System.out.println("You rolled: " + diceRoll + " - " + activity2);
            } else if (diceRoll==3){
                System.out.println("You rolled: " + diceRoll + " - " + activity3);
            }else if (diceRoll==4){
                System.out.println("You rolled: " + diceRoll + " - " + activity4);
            }else if(diceRoll==5){
                System.out.println("You rolled: " + diceRoll + " - " + activity5);
            }else if(diceRoll==6){
                System.out.println("You rolled: " + diceRoll + " - " + activity6);
            }
        }
}
