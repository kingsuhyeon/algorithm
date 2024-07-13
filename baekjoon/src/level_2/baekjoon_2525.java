package level_2;

import java.util.Scanner;

public class baekjoon_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        if (m < 59) {
            h ++;
        }
    }
}
