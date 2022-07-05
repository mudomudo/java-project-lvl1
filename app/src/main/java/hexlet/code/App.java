package hexlet.code;


import hexlet.code.utils.Utils;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        String gamesList =
                "1 - Greet\n"
                        + "2 - Parity\n"
                        + "3 - Calc\n"
                        + "0 - Exit";

        System.out.println(gamesList);
        String choice = Utils.getString();
        System.out.println("Your choice: " + choice);

        switch (choice) {
            case "0":
                break;
            case "1":
                Greet.greetings();
                break;
            case "2":
                Parity.checkParity();
                break;
            case "3":
                Calc.initCalc();
                break;
            default:
                break;
        }

    }
}
