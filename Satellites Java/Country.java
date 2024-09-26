public class Country {
    
    private String countryName;
    
    //default constructor sets name as unknown
    Country() {
        setCountryName("unknown");
    }

    Country(String countryName) {
        setCountryName(countryName);
    }

    // setters and getters for country name
    public String getCountryName() {
        return countryName;
    }

    
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    //toString method to return changing countryName 
    public String toString() {
        return "The Country for the Constellation is " + countryName ;
    }
}
