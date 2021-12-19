package OpenCSVLessonTwo;

import com.opencsv.bean.CsvBindByName;

public class Language {
    @CsvBindByName
    private String countryCode;
    @CsvBindByName
    private String language;
    @CsvBindByName
    private String isOfficial;

    public Language(){}

    public Language(String countryCode, String language, String isOfficial) {
        this.countryCode = countryCode;
        this.language = language;
        this.isOfficial = isOfficial;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public String getIsOfficial() {
        return isOfficial;
    }

    @Override
    public String toString() {
        return language;
    }
}
