package ua.lviv.iot.fruitsshop.managers;


import org.junit.Assert;
import org.junit.Test;
import ua.lviv.iot.fruitsshop.models.*;


import java.io.IOException;
import java.io.PrintWriter;

public class FruitWriterTest implements FruitReader {

    @Test

    public void test() throws IOException {
        try (PrintWriter fileCleaner = new PrintWriter("fruits.csv")){
            fileCleaner.flush();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        FruitManager testShop = new FruitManager();
        testShop.addFruit(Pear.pearBuilder().name("Pear").season(Seasons.SPRING).color(Colors.GREEN).price(15.50)
                .fruitKind(Kinds.FRUIT).kind(Pears.TASTYPEAR).build());
        FruitWriter testWriter = new FruitWriter();
        testWriter.writeToFile(testShop.getFruits());
        String testString = readFile("fruits.csv");
        Assert.assertEquals(testString, "name,season,color,price,fruitKind,TASTYPEAR," +
                "Pear,SPRING,GREEN,15.5,FRUIT,TASTYPEAR\n");
    }

}
