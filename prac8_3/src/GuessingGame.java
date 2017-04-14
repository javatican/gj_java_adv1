
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ryannieh
 */
public class GuessingGame {

    public static void main(String[] args) {
        int randomNum;
        int guess;
        if (args.length == 0 || args[0].compareTo("help") == 0) {
            System.out.println("java GuessingGame <a number between 1 and 5>");
        } else {
            randomNum = (int) (Math.random() * 5) + 1;
            guess = Integer.parseInt(args[0]);
            if (guess < 1 || guess > 5) {
                System.out.println("invalid argument (an integer between 1 and 5 expected!)");
            } else if (randomNum == guess) {
                System.out.println("Correct answer!");
            } else {
                System.out.println("Sorry. The number was " + randomNum + ". Try again!");
            }
        }
    }
}
