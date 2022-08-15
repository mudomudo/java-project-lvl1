package hexlet.code.games;

import hexlet.code.utils.Utils;

public class Prime {

    private static String IsSimple(int value)
    {
        for (int i = 2; i < value; i++)
        {
            if (value % i == 0)
            {
                return "no";
            }
        }
        return "yes";
    }

    public static void initPrime() {
        String name = Greet.greetings();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int i = 0;
        while (i < 3) {
            int number = Utils.getRandomNum(100);
            String answer = IsSimple(number);
            System.out.println("Question: " + number);
            String input = Utils.getString();
            if (input.toLowerCase().equals(answer)) {
                System.out.println("Correct!");
                i++;
            }else {
                System.out.println("'" + input + "'"+ " is wrong answer ;(. Correct answer was "+ answer +" .");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            System.out.println("Congratulations, " + name + "!");
        }

    }

}
