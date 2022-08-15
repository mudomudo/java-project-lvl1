package hexlet.code.games;

import hexlet.code.engine.Consts;
import hexlet.code.utils.Utils;

import static hexlet.code.engine.Consts.limitOfNumbers;

public class Calc {
    private static char[] operations = {'*', '+', '-'};

    public static void initCalc() {
        String name = Greet.greetings();
        int numberOfTry = 0;
        while (numberOfTry != Consts.endCountOfRightAnswers) {
            int num1 = Utils.getRandomNum(limitOfNumbers);
            int num2 = Utils.getRandomNum(limitOfNumbers);
            int indexOfOperation = Utils.getRandomNum(2);
            char operation = operations[indexOfOperation];

            System.out.println("Question: "
                    + num1 + " " + operation + " " + num2);
            int result = 0;

            switch (indexOfOperation) {
                case 0:
                    result = num1 * num2;
                    break;
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                default:
                    break;
            }
            int input = Integer.parseInt(Utils.getString());
            System.out.print("Your answer: " + input);
            if (input == result) {
                System.out.println("\nCorrect!");
                numberOfTry++;
            } else {
                System.out.println("\n'" + input + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'" + result + "'");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            if (numberOfTry == Consts.endCountOfRightAnswers) {
                System.out.println("Congratulations, " + name + "!");
            }

        }


    }
}
