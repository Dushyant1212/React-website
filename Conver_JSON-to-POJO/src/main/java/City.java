import com.fasterxml.jackson.annotation.JsonProperty;

public class City {

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

    @Override
    public String toString() {
        return String.format(
                "City Details:\n" +
                        "- Name: %s\n" +
                        "- Air Quality Index (AQI): %d (lower is better)\n" +
                        "- Population: %,d (approx.)\n" +
                        "- Area: %.2f square kilometers",
                city, aqi, population, area);
    }
}
