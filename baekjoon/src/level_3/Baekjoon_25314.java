package level_3;

import java.util.Scanner;

public class Baekjoon_25314 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a/4; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
