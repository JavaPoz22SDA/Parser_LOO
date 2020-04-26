package pl.sda.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {

    private Path file = Paths.get("Sacramentorealestatetransactions.csv");

    public List<RealEstate> readFile() throws IOException {

        byte[] data = Files.readAllBytes(file);
        String convertData = new String(data);
        String[] dataArray = convertData.split("\\r");
        List<String> dataList = new ArrayList<>(Arrays.asList(dataArray));
        dataList.remove(0);
        for (String line : dataList) {
            System.out.println(line);
            /*
            1. Posplitowac linie po , i dla kazdej lini stworzyc obiekt
             RealEstate i go wypełnic.
             2. Wypełniony obiekt dodać na listę List<RealEstate>
             */

            String[] l = line.split(",");


        }


        return null;
    }
}
