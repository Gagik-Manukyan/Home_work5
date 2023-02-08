package Hm_wrk1;

import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввести число");
        int y = in.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(y + "*" +(i+1)+ "=" + (y * (i + 1)));
        }
    }
}