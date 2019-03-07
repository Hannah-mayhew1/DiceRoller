package hannahmayhew.DiceRoller;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the E-Dice!");
        System.out.println("----------------------");

        int noOfSides = getUserIntInput("Please enter the number of sides you wish for your dice to have: ");
        int noOfRolls = getUserIntInput("How many times would you like to Roll?");

        rollDice(noOfSides, noOfRolls);
    }

    private static int getUserIntInput(String instruction) {
        System.out.println(instruction);
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    private static void rollDice(int noOfSides, int noOfRolls) {

        for (int rolls = 0; rolls < noOfRolls; rolls++) {

            Random generator = new Random();
            int diceRoll = generator.nextInt(noOfSides) + 1;

            System.out.println("You rolled a " + (diceRoll) + "!");

        }
    }
}

