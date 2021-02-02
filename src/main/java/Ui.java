import java.util.Scanner;

public class Ui {
    private static final String LINE = String.format("%" + 5 + "s", " ")
            + "____________________________________________________________________";
    private final Scanner sc = new Scanner(System.in);

    public Ui() { }

    public String readCommand() {
        return sc.nextLine();
    }

    public void printStart() {
        System.out.println(LINE);
        String logo =
                "      _ __ ___   ___  _   _ _ __ ___   ___  _   _ \n"
                      + "     | '_ ` _ \\ / _ \\| | | | '_ ` _ \\ / _ \\| | | |\n"
                      + "     | | | | | | (_) | |_| | | | | | | (_) | |_| |\n"
                      + "     |_| |_| |_|\\___/ \\__,_|_| |_| |_|\\___/ \\__,_|";
        System.out.println(logo + " is back!\n     What have you awoken MouMou for?");
        System.out.println(LINE);
    }

    //output at the end
    public void printEnd() {
        System.out.println(LINE);
        System.out.println(Aligner.align("Goodnight! MouMou will go back to sleep now."));
        System.out.println(LINE);
    }

    public static void printLine() {
        System.out.println(LINE);
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public void showError(String message) {
        System.out.println(LINE);
        System.out.println(message);
        System.out.println(LINE);
    }
}