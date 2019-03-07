package hannahmayhew.DiceRoller;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the E-Dice!");
        System.out.println("----------------------");
        System.out.println("Type 'roll' to make your first move!");

        int numSides = 6;

        Scanner userInput = new Scanner(System.in);
        String input = userInput.next();

        if (input.equals("roll")) {

            Random generator = new Random();
            int diceRoll = generator.nextInt(numSides) + 1;

            System.out.println("You rolled a " + (generator.nextInt(numSides) + 1) + " !");
        }
    }
}
