package Hm_wrk7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice;
        do{
            System.out.print("Введите число ");
            number = console.nextInt();
            if(number > max) {
                max = number;
            }
            if(number < min) {
                min = number;
            }
            System.out.print("Хотите продолжить? Да/Нет? ");
            choice = console.next().charAt(0);
        }while(choice=='Д' || choice == 'д');
        System.out.println("Largest number: " + max);
    }
}

