package ua.lviv.iot.fruitsshop.managers;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import ua.lviv.iot.fruitsshop.models.*;

import java.io.FileReader;
import java.io.IOException;

public class FruitWriterTest {

    @Test
    public void test() throws IOException {

        FruitManager ATB = new FruitManager();

        ATB.addFruit(Pear.pearBuilder().name("Pear").season(Seasons.SPRING).color(Colors.GREEN).price(15.50)
                .fruitKind(Kinds.FRUIT).kind(Pears.TASTYPEAR).build());
        FruitWriter testWriter = new FruitWriter();
        testWriter.writeToFile(ATB.getFruits());
        FileReader testReader = new FileReader("new.csv");
        String testString = "";
        int i;
        while ((i = testReader.read()) != -1) {
            testString = testString + (char) i;
        }
        testReader.close();
        Assert.assertEquals(testString, "name,season,color,price,fruitKind,TASTYPEAR,Pear,SPRING,GREEN,15.5,FRUIT,TASTYPEAR\n");
    }

}
