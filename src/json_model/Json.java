package json_model;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Json {
    /**
     * Class is used for operate with java data types and json data types
     *
     */
    private static ObjectMapper objectMapper = new ObjectMapper();

    private  static  ObjectMapper getObjeckMapper(){
        ObjectMapper defaultObjectMapper = new ObjectMapper();
        //TODO configuring profile
        return defaultObjectMapper;
    }

}
