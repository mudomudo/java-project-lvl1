package hexlet.code;

import hexlet.code.utils.Utils;

public class Calc {
    private static char[] operations = {'*', '+', '-'};
    private static int endCountOfRightAnswers = 3;

    public static void initCalc() {
        String name = Greet.greetings();
        int numberOfTry = 0;
        while (numberOfTry != endCountOfRightAnswers) {
            int num1 = Utils.getRandomNum(100);
            int num2 = Utils.getRandomNum(100);
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
            if (numberOfTry == 3) {
                System.out.println("Congratulations, " + name + "!");
            }

        }


    }
}
