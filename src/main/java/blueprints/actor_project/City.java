package blueprints.actor_project;

import jakarta.persistence.*;

@Entity
@Table(name="city")
public class City {
    @Id
    @Column(name="city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int cityid;

    @Column(name="city")
    String city;

    @Column(name="country_id")
    int countryid;

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountryid() {
        return countryid;
    }

    public void setCountryid(int countryid) {
        this.countryid = countryid;
    }

    public City(){}
}
