package hannahmayhew.DiceRoller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the E-Dice!");
        System.out.println("----------------------");

        System.out.println("Would you like to use a 'standard' or a 'custom' dice?");
        Scanner typeOfDiceInput = new Scanner(System.in);
        String typeOfDice = typeOfDiceInput.next();

        if (typeOfDice.equals("standard")) {
            standardDiceRoll();
        }
        else if (typeOfDice.equals("custom")) {
            customDiceRoll();
        }

    }

    private static void standardDiceRoll() {
        int noOfSides = getUserIntInput("Please enter the number of sides you wish for your dice to have: ");
        int noOfRolls = getUserIntInput("How many times would you like to Roll?");

        List<Integer> listOfStandardRolls = rollStandardDice(noOfSides, noOfRolls);

        System.out.println("The sum of your rolls is " + calculateSumOfRolls(listOfStandardRolls));
    }

    private static void customDiceRoll() {
        int noOfRolls = getUserIntInput("How many times would you like to Roll?");

        List<Integer> customFaces = getCustomFacesInput();

        List<Integer> listOfCustomRolls = rollCustomDice(customFaces, noOfRolls);

        System.out.println("The sum of your rolls is " + calculateSumOfRolls(listOfCustomRolls));

    }

    private static List<Integer> getCustomFacesInput() {
        int noOfFaces = getUserIntInput("How many faces does your custom dice have?");
        List<Integer> customFaces = new ArrayList<>();

        for (int face = 0; face < noOfFaces ; face++) {
            int faceNumber = getUserIntInput("What number is on face " + (face + 1) + "?");
            customFaces.add(faceNumber);
        }
        return customFaces;
    }

    private static int getUserIntInput(String instruction) {
        System.out.println(instruction);
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    private static List<Integer> rollStandardDice(int noOfSides, int noOfRolls) {
        List<Integer> listOfStandardRolls = new ArrayList<>();

        for (int rolls = 0; rolls < noOfRolls; rolls++) {

            Random standardGenerator = new Random();
            int standardDiceRoll = standardGenerator.nextInt(noOfSides) + 1;

            listOfStandardRolls.add(standardDiceRoll);
        }
        return listOfStandardRolls;
    }

    private static List<Integer> rollCustomDice(List<Integer> customFaces, int noOfRolls) {
        List<Integer> listOfCustomRolls = new ArrayList<>();

        for (int rolls = 0; rolls < noOfRolls; rolls++) {
            Random customGenerator = new Random();
            int customRoll = customFaces.get(customGenerator.nextInt(customFaces.size()));
            listOfCustomRolls.add(customRoll);
        }
        return listOfCustomRolls;
    }

    private static int calculateSumOfRolls (List<Integer> listOfRolls) {
        int sumOfStandardRolls = listOfRolls.get(0);
        for (int standardRoll = 1; standardRoll < listOfRolls.size(); standardRoll++) {
            sumOfStandardRolls = sumOfStandardRolls + listOfRolls.get(standardRoll);
        }
        return sumOfStandardRolls;
    }
}

