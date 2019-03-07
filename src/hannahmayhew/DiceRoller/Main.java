package hannahmayhew.DiceRoller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the E-Dice!");
        System.out.println("----------------------");

        int noOfSides = getUserIntInput("Please enter the number of sides you wish for your dice to have: ");
        int noOfRolls = getUserIntInput("How many times would you like to Roll?");

        List<Integer> listOfRolls = rollDice(noOfSides, noOfRolls);

        System.out.println("The sum of your rolls is " + calculateSumOfRolls(listOfRolls));
    }

    private static int getUserIntInput(String instruction) {
        System.out.println(instruction);
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    private static List<Integer> rollDice(int noOfSides, int noOfRolls) {
        List<Integer> listOfRolls = new ArrayList<>();

        for (int rolls = 0; rolls < noOfRolls; rolls++) {

            Random generator = new Random();
            int diceRoll = generator.nextInt(noOfSides) + 1;

            listOfRolls.add(diceRoll);
        }
        return listOfRolls;
    }

    private static int calculateSumOfRolls (List<Integer> listOfRolls) {
        int sumOfRolls = listOfRolls.get(0);
        for (int roll = 1; roll < listOfRolls.size(); roll++) {
            sumOfRolls = sumOfRolls + listOfRolls.get(roll);
        }
        return sumOfRolls;
    }
}

