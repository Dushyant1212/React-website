package reader;

import helper.JsonHelper;
import model.City;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class JsonReader {
    public static void main(String[] args) {
        try {
            // Step 1: Read JSON file and parse to POJO
            String inputPath = "src/main/resources/input.json";
            List<City> cityList = JsonHelper.parseJsonToPojo(inputPath);

            // Step 2: Convert List of POJOs to a meaningful paragraph
            StringBuilder paragraph = new StringBuilder();
            cityList.forEach(city -> paragraph.append(city.toString()).append("\n"));

            // Step 3: Create 'destination' folder
            File destinationFolder = new File("destination");
            if (!destinationFolder.exists()) {
                destinationFolder.mkdir();
            }

            // Step 4: Check if 'destination.json' exists, append or create
            File destinationFile = new File("destination/destination.json");
            if (destinationFile.exists()) {
                try (FileWriter writer = new FileWriter(destinationFile, true)) {
                    writer.write("\n" + paragraph);
                }
            } else {
                try (FileWriter writer = new FileWriter(destinationFile)) {
                    writer.write(paragraph.toString());
                }
            }

            System.out.println("Process completed. Data written to 'destination.json'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
