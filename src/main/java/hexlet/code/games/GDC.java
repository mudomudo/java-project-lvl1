package hexlet.code.games;

import hexlet.code.engine.Consts;
import hexlet.code.utils.Utils;

import static hexlet.code.engine.Consts.endCountOfRightAnswers;

public class GDC {
    public static void initGDC() {
        String name = Greet.greetings();
        System.out.println("Find the greatest common divisor of given numbers.");
        int correct = 0;
        while (correct != endCountOfRightAnswers) {
            int num1 = Utils.getRandomNum(Consts.limitOfNumbers);
            int num2 = Utils.getRandomNum(Consts.limitOfNumbers);
            System.out.println("Question:" + " " + num1 + " " + num2);
            System.out.print("Your answer:");
            int gcdValue = gcdByEuclidsAlgorithm(num1, num2);
            int input = Integer.parseInt(Utils.getString());

            if (gcdValue == input) {
                System.out.println("Correct!");
                correct++;
            } else {
                System.out.println("'" + input + "'"+ " is wrong answer ;(. Correct answer was "+ gcdValue +" .");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        System.out.println("Congratulations, " + name + "!");

    }

    private static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        else {
            return gcdByEuclidsAlgorithm(n2, n1 % n2);
        }
    }
}
