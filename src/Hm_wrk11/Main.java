package Hm_wrk11;


import java.util.Random;
import java.util.Scanner;
public class Main {

        public static void main (String [] args) {
            Random rand = new Random();
            int numberToGuess =rand.nextInt(10);
            Scanner input=new Scanner(System.in);
            int guess;
            boolean win =false;
            while (win == false)
                System.out.println("Прошу, не выгоняйте меня!!!!!!");
            guess = input.nextInt();{
                if(guess == numberToGuess)
                    win=true;}
            if(guess<numberToGuess) {
                System.out.println("Your guess is too low");
            }

            {
                if (guess > numberToGuess)

                    System.out.println("Your guess is too high");
                System.out.println("You win!");
                System.out.println("The number was"  +numberToGuess);
            }
        }
}

