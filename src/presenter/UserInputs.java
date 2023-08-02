package presenter;

import java.io.IOException;
import java.util.Scanner;

public class UserInputs {
    private static Scanner sc;

    public static int getIntFromConsole(String prompt) throws IOException {
        sc = new Scanner(System.in);
        while (true) {
            System.out.print(prompt + ": ");
            if (sc.hasNextInt()) return sc.nextInt();
        }
    }
    public static String getStringFromConsole(String prompt) throws IOException {
        sc = new Scanner(System.in);
        while (true) {
            System.out.print(prompt + ": ");
            if (sc.hasNextLine()) return sc.nextLine();
        }
    }
}
