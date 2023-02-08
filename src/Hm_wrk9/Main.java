package Hm_wrk9;
import java.util.Scanner;
public class Main {
    //так и не понял как
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your nth term for the series.");
        double userInput = input.nextInt();
        double sum = 0.0;
        for(int i = 2; i <= userInput*2; i+=2) {
            sum += ((double)(i-1)/(i+1));
        }
        System.out.printf("The sum of the series is %12.12f" , sum);
        double Pi = 0;
        for (int counter = 1; counter < userInput; counter++){
            Pi += 4 * (Math.pow(-1,counter + 1)/((2*counter) - 1));
        }
        System.out.printf(" ,The computation of Pi is %1.12f",  Pi);
    }
}

