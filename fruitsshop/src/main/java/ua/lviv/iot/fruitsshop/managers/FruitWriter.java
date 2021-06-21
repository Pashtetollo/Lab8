package ua.lviv.iot.fruitsshop.managers;

import ua.lviv.iot.fruitsshop.models.Fruit;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FruitWriter implements FruitReader {
    public void writeToFile(List<Fruit> fruits) throws IOException {
        String fileContent = readFile("fruits.csv");
        try (FileWriter csvWriter = new FileWriter("fruits.csv")) {
            csvWriter.append(fileContent);
            for (int i = 0; i < fruits.size(); i++) {
                csvWriter.append(fruits.get(i).getHeaders());
                csvWriter.append(",");
                csvWriter.append(fruits.get(i).toCSV());
                csvWriter.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
