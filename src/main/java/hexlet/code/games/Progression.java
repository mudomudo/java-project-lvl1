package hexlet.code.games;

import hexlet.code.utils.Utils;

import java.util.Arrays;

import static hexlet.code.utils.Utils.getRandomNum;

public class Progression {
    private static String[] generateProgression() {
        int start = getRandomNum(10);
        int step = getRandomNum(10);
        int i = 1;
        int[] res = new int[10];
        res[0] = start;
        while (i < 10) {
            res[i] = res[i-1] + step;
            step++;
            i++;
        }
        return Arrays.toString(res).split(",");
    }

    public static void showProgression() {
        String name = Greet.greetings();

        System.out.println("What number is missing in the progression?");
        int i = 0;
        while (i < 3) {
            int numOfElement = getRandomNum(9);
            String[] input = generateProgression();
            String buffer = input[numOfElement].trim();
            input[numOfElement] = "..";
            String out = Arrays.toString(input).replaceAll("[^.\\d]+", " ").trim();

            System.out.println(out);
            System.out.print("Your answer: ");
            String answer = Utils.getString();
            if (answer.equals(buffer)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answer + "'"+ " is wrong answer ;(. Correct answer was "+ buffer +" .");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            System.out.println("Congratulations, " + name + "!");
        }

    }
}
