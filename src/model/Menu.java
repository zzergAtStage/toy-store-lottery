package model;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private final HashMap<Integer, String> menu;

    public Menu (){
        menu = new HashMap<>();
        menu.put(1, "Загрузка характериских игрушек");
        menu.put(2, "Загрузить склад");
        menu.put(3, "Обновить вес игрушки в розыгрыше");
        menu.put(4, "Вывести хранилище в консоль");
        menu.put(5, "Провести розыгрыш");
        menu.put(6, "Выход из приложения");
    }
    public void showMenu(){
        System.out.println("------- Главное меню --------");
        for (Map.Entry<Integer, String> menuPoint: menu.entrySet()
             ) {
            System.out.println(menuPoint.getKey() + " -> " + menuPoint.getValue());
        }
    }
    public HashMap<Integer, String> getMenu() {
        return menu;
    }
}
