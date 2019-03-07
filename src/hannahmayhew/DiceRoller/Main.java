package hannahmayhew.DiceRoller;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the E-Dice!");
        System.out.println("----------------------");

        System.out.println("How many times would you like to Roll?");

        Scanner noOfRollsInput = new Scanner(System.in);
        int noOfRolls = noOfRollsInput.nextInt();

        for (int rolls = 0; rolls < noOfRolls; rolls++) {

            int numSides = 6;

            Random generator = new Random();
            int diceRoll = generator.nextInt(numSides) + 1;

            System.out.println("You rolled a " + (diceRoll) + "!");

        }
    }
}
