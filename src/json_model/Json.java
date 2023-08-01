package json_model;


import com.google.gson.Gson;

public class Json {
    private Gson gson;
    public Json(){
        gson = new Gson();
    }

    public Gson getGson() {
        return gson;
    }
}
