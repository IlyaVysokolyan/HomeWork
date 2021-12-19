package OpenCSVLessonTwo;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Start {
    public static void main(String[] args) throws IOException, CsvValidationException {
        List<Language> language = new CsvToBeanBuilder<Language>(new FileReader("countrylanguage.csv"))
                .withType(Language.class)
                .build().parse();

        List<City> cities = new ArrayList<>();
        CSVReader csvReader = new CSVReader(new FileReader("city.csv"));
        String[] nextline;
        while ((nextline = csvReader.readNext()) != null) {
            cities.add(new City(nextline[0], nextline[1], nextline[2], nextline[3], nextline[4]));
        }
        //Удаление 1й строки
        cities.remove(0);

        for (City c : cities) {
            for (Language l : language) {
                if (c.getCountryCode().equals(l.getCountryCode())) {
                    c.getLanguageList().add(new Language(l.getCountryCode(), l.getLanguage(), l.getIsOfficial()));
                }
            }
        }
        //Проверка списка
        cities.stream().filter(e -> e.getName().equals("Willemstad")).forEach(f -> System.out.println(f.toString()));


    }
}
