package hexlet.code;

import java.util.Scanner;

public class User {

    public static String getName() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        return name;
    }

}
