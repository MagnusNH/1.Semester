package Lesson05.DiceMan;

public class DiceMan01 {

        String activity1 = "Eat Breakfast";
        String activity2 = "Study Something boring";
        String activity3 = "Go Swimming";
        String activity4 = "Go Fishing";
        String activity5 = "Call his MOM";
        String activity6 = "Go Back to Bed";
        private Dice dice;


        public void setActivity1(String activity1, String activity2, String activity3, String activity4, String activity5, String activity6, int dice) {
            this.activity1 = activity1;
            this.activity2 = activity2;
            this.activity3 = activity3;
            this.activity4 = activity4;
            this.activity5 = activity5;
            this.activity6 = activity6;
        }

        public void rollDice(){


            if(dice ==1) {
                System.out.println(activity1);
            } else if(dice==2){
                System.out.println(activity2);
            } else if (dice==3){
                System.out.println(activity3);
            }else if (dice==4){
                System.out.println(activity4);
            }else if(dice==5){
                System.out.println(activity5);
            }else if(dice==6){
                System.out.println(activity6);
            }
        }
}
