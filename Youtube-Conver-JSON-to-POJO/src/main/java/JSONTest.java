import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.imageio.stream.ImageInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class JSONTest {
    public static void main(String[] args) throws IOException {
        // POJO to JSON
        ObjectMapper mapper = new ObjectMapper();

        ArrayList<City> list =new ArrayList<>();

        City city=new City("Jaipur",50,4343,753); //object the class of City..
        list.add(city);
        City city2=new City("Jaipur2",502,432243,75223); //object the class of City..
        list.add(city2);

        String JsonData = mapper.writeValueAsString(list);
        mapper.writeValue(new File("G:\\Projects\\Youtube-Conver-JSON-to-POJO//final.json"),list);
        System.out.println(JsonData);

        // JSON to POJO
        ObjectMapper mapper1 = new ObjectMapper();
        String json = "[{\"city\":\"Jaipur\",\"AQI\":50,\"population\":4343,\"area\":753.0},{\"city\":\"Jaipur2\",\"AQI\":502,\"population\":432243,\"area\":75223.0}]";
        ArrayList<City> list1 = mapper1.readValue(json,ArrayList.class);
        System.out.println(list1.size());


    }
}
class City {

    public City(String city, int aqi, int population, double area) {
        this.city = city;
        this.aqi = aqi;
        this.population = population;
        this.area = area;
    }

    @JsonProperty("city")
    private String city;



    @JsonProperty("AQI")
    private int aqi;

    @JsonProperty("population")
    private int population;

    @JsonProperty("area")
    private double area;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAqi() {
        return aqi;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


}


