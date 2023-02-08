package Hm_wrk5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Введите число");
            int x = in.nextInt();
            int z = in.nextInt();
            int y = x * z;
            System.out.println(y);
            System.out.println("Хотите продолжить операцию? Да/Нет");
            answer = in.next();
        }
        while(answer.equals("Да"));
        System.out.println("Тогда прощайте");
    }
}

