import model.Menu;
import presenter.FileStorage;
import presenter.MenuManager;
import presenter.ToyManager;

public class App {
    public static void main(String[] args) {
        int action = 0;
        ToyManager mainStore = new ToyManager();
        FileStorage fs = new FileStorage();
        Menu menu = new Menu();

        while (action != 6) {
            action = MenuManager.runMenu();

            System.out.println("action: " + menu.getMenu().get(action));
            switch (action) {
                case 1 -> {
                   mainStore.setStorageStock(fs.getToysDefinition());
                   mainStore.setStatusLOADED();
                }
            }

            System.out.println( "ToyStorage loaded: " + mainStore.checkStatusLOADED());
        }
    }
}
