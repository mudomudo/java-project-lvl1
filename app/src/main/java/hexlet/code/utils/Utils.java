package hexlet.code.utils;

import java.util.Scanner;

public class Utils {

    public static String getString() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        return name;
    }

    public static int getRandomNum() {
        int point = 100;

        return (int) (Math.random() * point);
    }

}
