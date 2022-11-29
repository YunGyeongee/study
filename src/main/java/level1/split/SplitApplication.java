package level1.split;

import java.util.Scanner;

public class SplitApplication {

    public static Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("숫자를 입력해주세요.");

        String text = INPUT.next();
        String[] arr = StringParser.split(text);

        int sum = 0;

        System.out.println("모든 숫자의 합은 " + sum + " 입니다.");
    }

}
