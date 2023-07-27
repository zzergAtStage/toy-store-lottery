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
    public ArrayList<Toy> getGoods() {
        ArrayList<Toy> goods = new ArrayList<>();
       // File fileToyDescription = new File("resource/toy_model.json");
        File fileToyStoreLog = new File("resource/to_store.json");




        return goods;
    }

    /**
     * @param toys
     * @return
     */
    @Override
    public boolean setGoods(ArrayList<Toy> toys) {
        return false;
    }

    boolean checkFile(File file){
        return file.exists();
    }
}
