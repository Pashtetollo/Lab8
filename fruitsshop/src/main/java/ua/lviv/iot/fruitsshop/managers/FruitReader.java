package ua.lviv.iot.fruitsshop.managers;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public interface FruitReader {


    public default String readFile(String filename) throws IOException {
        StringBuffer strBuffer = new StringBuffer("");
        try (FileReader fruitReader = new FileReader(filename);) {
            BufferedReader fruitBufferReader = new BufferedReader(fruitReader);
            String nextLine = "";
            while ( (nextLine = fruitBufferReader.readLine()) != null) {
                strBuffer.append(nextLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        return strBuffer.toString();
    }

}
