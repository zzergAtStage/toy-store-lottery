import model.Menu;
import presenter.MenuManager;

public class App {
    public static void main(String[] args) {
        int action = 0;

        Menu menu = new Menu();
        while (action != 6) {
            action = MenuManager.runMenu();
            //some action
            System.out.println("action: " + menu.getMenu().get(action));
        }
    }
}
