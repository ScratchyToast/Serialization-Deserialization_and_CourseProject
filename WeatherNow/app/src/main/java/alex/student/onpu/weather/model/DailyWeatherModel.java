package alex.student.onpu.weather.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DailyWeatherModel {

    @SerializedName("data")
    @Expose
    List<DailyWeatherDataModel> data;

    @SerializedName("city_name")
    @Expose
    String city_name;

    @SerializedName("lon")
    @Expose
    String lon;

    @SerializedName("timezone")
    @Expose
    String timezone;

    @SerializedName("lat")
    @Expose
    String lat;

    @SerializedName("country_code")
    @Expose
    String country_code;

    @SerializedName("state_code")
    @Expose
    String state_code;

    public void setData(List<DailyWeatherDataModel> data){this.data = data;}
    public void setCity_name(String city_name){this.city_name = city_name;}
    public void setLon(String lon){this.lon = lon;}
    public void setTimezone(String timezone){this.timezone = timezone;}
    public void setLat(String lat){this.lat = lat;}
    public void setCountry_code(String country_code){this.country_code = country_code;}
    public void setState_code(String state_code){this.state_code = state_code;}

    public List<DailyWeatherDataModel> getData(){return this.data;}
    public String getCity_name(){return this.city_name;}
    public String getLon(){return this.lon;}
    public String getTimezone(){return this.timezone;}
    public String getLat(){return this.lat;}
    public String getCountry_code(){return this.country_code;}
    public String getState_code(){return this.state_code;}

    public String toString()
    {
        String format = "data: %s, city_name: %s, lon: %s, timezone: %s, lat: %s, country_code: %s, state_code: %s";

        return String.format(format, this.data, this.city_name, this.lon, this.timezone, this.lat,
                             this.country_code, this.state_code);
    }
}
