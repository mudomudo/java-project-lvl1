package hexlet.code.games;

import hexlet.code.utils.Utils;

import static hexlet.code.engine.Consts.endCountOfRightAnswers;
import static hexlet.code.engine.Consts.limitOfNumbers;

public class Parity {



    public static void checkParity() {
        String name = Greet.greetings();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int correct = 0;
        while (correct != endCountOfRightAnswers) {
            int num = Utils.getRandomNum(limitOfNumbers);
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
                    System.out.println("'" + answer + "'"
                            + " is wrong answer ;(. Correct answer was 'no'.");

                } else {
                    System.out.println("'" + answer + "'"
                            + " is wrong answer ;(. Correct answer was 'yes'.");

                }

            }

        }
        System.out.println("Congratulations, " + name + "!");

    }
}
