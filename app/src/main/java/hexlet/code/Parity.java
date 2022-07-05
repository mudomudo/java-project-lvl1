package hexlet.code;

import hexlet.code.utils.Utils;

public class Parity {
    public static void checkParity() {
        String name = Greet.greetings();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int correct = 0;
        int point = 3; //Количество правильных ответов.
        while (correct != point) {
            int num = Utils.getRandomNum();
            System.out.println("Question: " + num);
            System.out.print("Your answer: ");
            String answer = Utils.getString().toLowerCase();
            if (num % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct!");
                correct++;
            } else if (num % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                correct++;
            } else {
                if (answer.equals("yes")) {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");

                } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");

                }

            }

        }
        System.out.println("Congratulations, " + name + "!");

    }
}
