package level_4;

import java.util.Scanner;

public class Baekjoon_10871 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            int a = sc.nextInt();
            if (a < x) {
                System.out.print(a + " ");
            }
        }
    }
}
