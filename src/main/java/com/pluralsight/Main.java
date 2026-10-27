package com.pluralsight;


public class Main {
    public static void main(String[] args) {

        Dice dice = new Dice();
    //    System.out.println(dice.roll());
        int roll1;
        int roll2;

        int numberOf2 = 0;
        int numberOf4 = 0;
        int numberOf6 = 0;
        int numberOf7 = 0;

        //System.out.println(numberOf2);

        for (int counter = 1; counter <= 100; counter++) {

             roll1 = dice.roll();
             roll2 = dice.roll();

            int sum = roll1 + roll2;
            System.out.println("Roll" + counter + ":    " +  roll1 + " - " + roll2 + "     Sum " + sum);
           // System.out.printf("%8d %8d %8d %8d\n", counter, roll1, roll2, sum );
            if (sum ==2){
                numberOf2++;
            }
            if (sum == 4){
                numberOf4++;
            }
            if (sum == 6){
                numberOf6++;
            }
            if (sum == 7){
                numberOf7++;
            }

            System.out.println("\n--- Final Counter Result ---");;
            System.out.println("Number of times sum was 2: "+ numberOf2);
            System.out.println("Number of times sum was 4: "+ numberOf4);
            System.out.println("Number of times sum was 6: "+ numberOf6);
            System.out.println("Number of times sum was 7: "+ numberOf7);
        }
    }
}