package presenter;

import model.Toy;
import model.iGetGoods;

import java.io.*;
import java.util.ArrayList;
import java.lang.reflect.Type;

public class FileStorage implements iGetGoods {
    private final String PATH_TOYS_DEFINITION = "resource/toys_definition.json";

    /**
     * @return
     */
    @Override
    public ArrayList<Toy> getToysDefinition() {
        ArrayList<Toy> toys = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(PATH_TOYS_DEFINITION));
            Type toyListType = new TypeToken<ArrayList<Toy>>() {}.getType();
            toys = gson.fromJson(reader, toyListType);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return null;
    }

    /**
     * @param toys
     */
    @Override
    public void setToysDefinition(ArrayList<Toy> toys) {

    }
}
