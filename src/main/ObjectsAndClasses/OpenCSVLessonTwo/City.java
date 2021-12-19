package OpenCSVLessonTwo;

import com.opencsv.bean.CsvBindByName;

import java.util.ArrayList;
import java.util.List;

public class City {
    @CsvBindByName
    private String id;
    @CsvBindByName
    private String name;
    @CsvBindByName
    private String countryCode;
    @CsvBindByName
    private String district;
    @CsvBindByName
    private String population;
    @CsvBindByName
    private List<Language> languageList ;


    public City(){}


    public City(String id, String name, String countryCode, String district, String population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
        languageList = new ArrayList<>();
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public String getPopulation() {
        return population;
    }

    public List<Language> getLanguageList() {
        return languageList;
    }


    @Override
    public String toString() {

        return name+","+languageList.toString();
    }
}
