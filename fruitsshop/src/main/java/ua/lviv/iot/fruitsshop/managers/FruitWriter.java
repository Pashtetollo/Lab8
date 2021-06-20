package ua.lviv.iot.fruitsshop.managers;

import ua.lviv.iot.fruitsshop.models.Fruit;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FruitWriter {
    public void writeToFile(List<Fruit> fruits) throws IOException {
        FileWriter csvWriter = new FileWriter("new.csv");
        for (int i = 0; i < fruits.size(); i++) {
            csvWriter.append(fruits.get(i).getHeaders());
            csvWriter.append(",");
            csvWriter.append(fruits.get(i).toCSV());
            csvWriter.append("\n");
        }
        csvWriter.close();
    }

}
