package Hm_wrk6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int pos = 0, neg = 0, zero = 0;
        for (int i = 1; i>0; i++) {
            System.out.println("Ввести число ");
            int num = x.nextInt();
            if (num > 0)
                pos++;
            else if (num < 0)
                neg++;
            else
                zero++;
            System.out.println("Введите 0 для выхода и любую цифровую клавишу для продолжения входа");
            int choice = x.nextInt();
            if (choice==0)
                break;
        }
        System.out.println("Положительное число %d" + pos);
        System.out.println("Негативное число %d" + neg);
        System.out.println("Нулевое число %d" + zero);
        x.close();
    }
}


