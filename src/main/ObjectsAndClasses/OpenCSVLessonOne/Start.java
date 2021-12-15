package OpenCSVLessonOne;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Start {
    public static void main(String[] args) throws IOException, CsvValidationException {
      //способ 1 City
        List<City> cities = new ArrayList<>();
        CSVReader csvReader = new CSVReader(new FileReader("city.csv"));
        String[] nextline;
        while ((nextline = csvReader.readNext()) != null) {
            cities.add(new City(nextline[0], nextline[1], nextline[2], nextline[3], nextline[4]));
        }
        //Удаление 1 строки
        cities.remove(0);
        cities.stream().forEach(e -> System.out.println(e.toString()));

        //способ 2 Language

        List<Language> list = new CsvToBeanBuilder<Language>(new FileReader("countrylanguage.csv"))
                .withType(Language.class)
                .build().parse();

        list.forEach(e-> System.out.println(e.toString()));


    }

}
