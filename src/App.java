import model.Menu;
import presenter.FileStorage;
import presenter.MenuManager;
import presenter.ToyManager;
import presenter.UserInputs;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
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
                case 2 -> { //update the toy weight
                    if (!mainStore.checkStatusLOADED()) {
                        System.out.println("Не загружены характеристики товаров. Запустите п.1");
                    } else {
                        mainStore.showStorage();
                        String toyIdStrFromUser = UserInputs.getStringFromConsole("Введите Id товара");
                        int toyWeigth = UserInputs.getIntFromConsole("Введите новый вес в розыгрыше");
                        if (toyIdStrFromUser != null || toyWeigth != 0) {
                            mainStore.getExistingToyFromStorage(toyIdStrFromUser).setSelection_weight(toyWeigth);
                        } else {
                            System.out.println("Некорректный ввод, повторите процедуру...");
                        }
                    }

                }
                case 3 -> mainStore.showStorage();
            }

            System.out.println( "ToyStorage loaded: " + mainStore.checkStatusLOADED());
        }
    }
}
