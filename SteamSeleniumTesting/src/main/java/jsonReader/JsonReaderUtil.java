package jsonReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonReaderUtil {

    public static String getValue(String jsonName, String key){
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject;
        try {
            jsonObject = (JSONObject) jsonParser.parse(new FileReader("src/main/resources/jsons/" + jsonName + ".json"));
        }catch (IOException|ParseException e){
            throw new RuntimeException(e);
        }
        return (String) jsonObject.get(key);
    }
}
