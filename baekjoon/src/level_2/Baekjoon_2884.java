package level_2;

import java.util.Scanner;

public class Baekjoon_2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b >= 45) {
            b = b - 45;
        } else {
            b = b + 15;
            if (a == 0) {
                a = 23;
            } else {
                a--;
            }
        }
        System.out.println(a + " " + b);
    }
}
