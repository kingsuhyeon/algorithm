package level_5;

import java.util.Scanner;

public class Baekjoon_27866 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int i = sc.nextInt();

        char result = s.charAt(i-1);

        System.out.println(result);
    }
}
