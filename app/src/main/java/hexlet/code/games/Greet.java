package hexlet.code.games;


import hexlet.code.utils.Utils;

public class Greet {
    public static String greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = Utils.getString();
        System.out.println("Hello, " + name + "!");
        return name;

    }


}
