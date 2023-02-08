package Hm_wrk4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввести число");
        int num = in.nextInt();
        boolean a = true;
        for (int i = 2; i < num; i++) {
            if(num%i==0)
            {
            a = false;
            break;
            }
        }
        if (a) {
            System.out.println("Число: " +num+ " простое");
        }else {
            System.out.println("Число: " +num+ " не является простым");
        }
    }
}