package helper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.City;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonHelper {

    public static List<City> parseJsonToPojo(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(filePath), new TypeReference<List<City>>() {});
    }
}
