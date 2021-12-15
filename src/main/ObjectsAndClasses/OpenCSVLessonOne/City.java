package OpenCSVLessonOne;

import com.opencsv.bean.CsvBindByName;

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

    public City(){}

    public City(String id, String name, String countryCode, String district, String population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    @Override
    public String toString() {
        return id+","+name+","+countryCode+","+district+","+population;
    }
}
