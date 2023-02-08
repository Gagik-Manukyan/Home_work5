package Hm_wrk2;
import java.util.Scanner;
    public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввести число ");
        int x = sc.nextInt();
        System.out.println("В степень");
        int y = sc.nextInt();
        int z = 1;
        if (y >= 1) {
            for (int i = 1; i < y; i++) {
                z = z * x;
            }
            System.out.println(z);
            System.out.println(Math.pow(x,y));
        }
    }
}