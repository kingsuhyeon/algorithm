package level_3;

import java.util.Scanner;

public class Baekjoon_11022 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int result = b + c;
            System.out.println("Case #" + i + ": " + (b + " + " + c) + " = " + result);
        }
    }
}
