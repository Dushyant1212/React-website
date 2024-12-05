import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.nio.file.*;
import java.util.List;

public class JsonReader {

    private static final Logger logger = LogManager.getLogger(JsonReader.class);

    public static void main(String[] args) {


        String inputPath = "src/main/resources/input.json";
        String outputFolderPath = "destination";
        String outputFilePath = outputFolderPath + "/destination.txt";

        try {
            // Step 1: Read JSON into a list of City objects
            List<City> cities = JsonHelper.readJsonAsList(inputPath, City.class);
            logger.info("Successfully read JSON data.");

            // Step 2: Convert list of POJOs to meaningful paragraphs
            StringBuilder paragraphs = new StringBuilder();
            for (City city : cities) {
                paragraphs.append(city.toString()).append("\n");
            }
            logger.info("Converted City objects to paragraphs.");

            // Step 3: Create folder if not exists
            File folder = new File(outputFolderPath);
            if (!folder.exists()) {
                folder.mkdir();
                logger.info("Output folder created at: {}", outputFolderPath);
            }

            // Step 4: Write to file (append if exists)
            File outputFile = new File(outputFilePath);
            if (outputFile.exists()) {
                Files.write(Paths.get(outputFilePath), paragraphs.toString().getBytes(), StandardOpenOption.APPEND);
                logger.info("Data appended to existing file: {}", outputFilePath);
            } else {
                Files.write(Paths.get(outputFilePath), paragraphs.toString().getBytes());
                logger.info("Data written to new file: {}", outputFilePath);
            }

        } catch (IOException e) {
            logger.error("An error occurred: {}", e.getMessage(), e);
        }
       /* finally {
            logger.fatal("Successfully Run Application...");
        }*/
    }
}
