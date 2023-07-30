package presenter;

import model.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
    public static int runMenu() {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        int choice = 0;
        boolean process = true;
        while (process) {
            menu.showMenu();
            try {
                System.out.print("->: ");
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Неверный формат выбора.");
                choice = 0;
                menu.showMenu();
            }
            if (choice == 6) {
                //on exit close scanner
                sc.close();
                process = false;
                System.out.println("Завершаем работу приложения");
            } else if (choice > 6) {
                System.out.println("Неверный выбор.");
                choice = 0;
            } else {
                return choice;
            }
        }
        return choice;
    }

}
