package Hm_wrk8;
public class Main {
    static void ArmstrongNum(int l, int h) {
    for (int j = l + 1; j < h; ++j) {
        int y = j;
        int x = 0;
        while (y != 0) {
            y /= 10;
            ++x;
        }
        int sum_power = 0;
        y = j;
        while (y != 0) {
            int d = y % 10;
            sum_power += Math.pow(d, x);
            y /= 10;
        }
        if (sum_power == j)
            System.out.print(j + " ");
    }
}
    public static void main(String[] args)
    {
        int n1 = 1;
        int n2 = 500;
        ArmstrongNum(n1, n2);
        System.out.println();
    }
}

