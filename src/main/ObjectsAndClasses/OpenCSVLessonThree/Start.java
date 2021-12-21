package OpenCSVLessonThree;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Start {
    public static void main(String[] args) throws IOException, CsvValidationException {
        //Задание 2
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

        //Задание 3

        long a = cities.stream()
                .flatMap(c -> c.getLanguageList().stream()
                        .filter(l -> l.getLanguage().equals("Russian") & l.getIsOfficial().equals("FALSE"))).count();
        System.out.println(a);

        /* cities.stream().filter(e->e.getName().equals("Singapore")).forEach(t-> System.out.println(t.toString()));*/

        int count = 0;
        for (City c : cities) {
            for (Language s : c.getLanguageList()) {
                if (s.getIsOfficial().equals("TRUE")) count++;
            }
            if (count >= 4) {
                System.out.println(c.getName());
                count = 0;
            } else count = 0;
        }

    }
}
