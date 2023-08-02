package presenter;

import com.google.gson.reflect.TypeToken;
import json_model.Json;
import model.Toy;
import model.iGetGoods;

import java.io.*;
import java.util.ArrayList;
import java.lang.reflect.Type;
import java.util.HashMap;

public class FileStorage implements iGetGoods {
    private final String PATH_TOYS_DEFINITION = "resources/toys_definition.json";
    private Json json;


    public FileStorage() {
        json = new Json();
    }


    /**
     * @return
     */
    @Override
    public ArrayList<Toy> getToysDefinition() {
        ArrayList<Toy> toys = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(PATH_TOYS_DEFINITION));
            Type toyListType = new TypeToken<ArrayList<Toy>>() {
            }.getType();
            toys = json.getGson().fromJson(reader, toyListType);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File :>" + PATH_TOYS_DEFINITION + " not found! (" + e.getMessage() + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return toys;
    }

    /**
     * @param
     */
    @Override
    public void setToysDefinition(ArrayList<Toy> toyMap) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(PATH_TOYS_DEFINITION));
            json.getGson().toJson(toyMap, writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
