package presenter;

import model.Toy;
import model.iGetGoods;

import java.io.File;
import java.util.ArrayList;

public class FileStorage implements iGetGoods {

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
