package presenter;

import model.Toy;
import model.iGetGoods;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * TBD: Класс создан для демонстрации возможности взаимодействия через интерфейс с разными
 * источниками хранения информации
 */
public class DataBaseStorage implements iGetGoods {
    /**
     * @return
     */

    /**
     * @return
     */
    @Override
    public ArrayList<Toy> getToysDefinition() {
        return null;
    }

    /**
     * @param toys
     */
    @Override
    public void setToysDefinition(ArrayList<Toy> toys) {

    }
}
