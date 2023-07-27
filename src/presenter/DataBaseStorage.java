package presenter;

import model.Toy;
import model.iGetGoods;

import java.util.ArrayList;

public class DataBaseStorage implements iGetGoods {
    /**
     * @return
     */
    @Override
    public ArrayList<Toy> getGoods() {
        return null;
    }

    /**
     * @param toys
     * @return
     */
    @Override
    public boolean setGoods(ArrayList<Toy> toys) {
        return false;
    }
}
