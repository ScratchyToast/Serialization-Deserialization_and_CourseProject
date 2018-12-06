package alex.student.onpu.weather.model;

import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DailyWeatherDataModel {

    @SerializedName("moonrise_ts")
    @Expose
    String moonrise_ts;

    @SerializedName("wind_cdir")
    @Expose
    String wind_cdir;

    @SerializedName("rh")
    @Expose
    String rh;

    @SerializedName("pres")
    @Expose
    String pres;

    @SerializedName("sunset_ts")
    @Expose
    String sunset_ts;

    @SerializedName("ozone")
    @Expose
    String ozone;

    @SerializedName("moon_phase")
    @Expose
    String moon_phase;

    @SerializedName("wind_gust_spd")
    @Expose
    String wind_gust_spd;

    @SerializedName("snow_depth")
    @Expose
    String snow_depth;

    @SerializedName("clouds")
    @Expose
    String clouds;

    @SerializedName("ts")
    @Expose
    String ts;

    @SerializedName("sunrise_ts")
    @Expose
    String sunrise_ts;

    @SerializedName("app_min_temp")
    @Expose
    String app_min_temp;

    @SerializedName("wind_spd")
    @Expose
    String wind_spd;

    @SerializedName("pop")
    @Expose
    String pop;

    @SerializedName("wind_cdir_full")
    @Expose
    String wind_cdir_full;

    @SerializedName("slp")
    @Expose
    String slp;

    @SerializedName("app_max_temp")
    @Expose
    String app_max_temp;

    @SerializedName("vis")
    @Expose
    String vis;

    @SerializedName("dewpt")
    @Expose
    String dewpt;

    @SerializedName("snow")
    @Expose
    String snow;

    @SerializedName("uv")
    @Expose
    String uv;

    @SerializedName("valid_date")
    @Expose
    String valid_date;

    @SerializedName("wind_dir")
    @Expose
    String wind_dir;

    @SerializedName("max_dhi")
    @Expose
    String max_dhi;

    @SerializedName("clouds_hi")
    @Expose
    String clouds_hi;

    @SerializedName("precip")
    @Expose
    String precip;

    @SerializedName("weather")
    @Expose
    IconWeatherModel weather;

    @SerializedName("max_temp")
    @Expose
    String max_temp;

    @SerializedName("moonset_ts")
    @Expose
    String moonset_ts;

    @SerializedName("datetime")
    @Expose
    String datetime;

    @SerializedName("temp")
    @Expose
    String temp;

    @SerializedName("min_temp")
    @Expose
    String min_temp;

    @SerializedName("clouds_mid")
    @Expose
    String clouds_mod;

    @SerializedName("clouds_low")
    @Expose
    String clouds_low;

    public void setMoonrise_ts(String moonrise_ts){this.moonrise_ts = moonrise_ts;}
    public void setWind_cdir(String wind_cdir){this.wind_cdir = wind_cdir;}
    public void setRh(String rh){this.rh = rh;}
    public void setPres(String pres){this.pres = pres;}
    public void setSunset_ts(String sunset_ts){this.sunset_ts = sunset_ts;}
    public void setOzone(String ozone){this.ozone = ozone;}
    public void setMoon_phase(String moon_phase){this.moon_phase = moon_phase;}
    public void setWind_gust_spd(String wind_gust_spd){this.wind_gust_spd = wind_gust_spd;}
    public void setSnow_depth(String snow_depth){this.snow_depth = snow_depth;}
    public void setClouds(String clouds){this.clouds = clouds;}
    public void setTs(String ts){this.ts = ts;}
    public void setSunrise_ts(String sunrise_ts){this.sunrise_ts = sunrise_ts;}
    public void setApp_min_temp(String app_min_temp){this.app_min_temp = app_min_temp;}
    public void setWind_spd(String wind_spd){this.wind_spd = wind_spd;}
    public void setPop(String pop){this.pop = pop;}
    public void setWind_cdir_full(String wind_cdir_full){this.wind_cdir_full = wind_cdir_full;}
    public void setSlp(String slp){this.slp = slp;}
    public void setApp_max_temp(String app_max_temp){this.app_max_temp = app_max_temp;}
    public void setVis(String vis){this.vis = vis;}
    public void setDewpt(String dewpt){this.dewpt = dewpt;}
    public void setSnow(String snow){this.snow = snow;}
    public void setUv(String uv){this.uv = uv;}
    public void setValid_date(String valid_date){this.valid_date = valid_date;}
    public void setWind_dir(String wind_dir){this.wind_dir = wind_dir;}
    public void setMax_dhi(String max_dhi){this.max_dhi = max_dhi;}
    public void setClouds_hi(String clouds_hi){this.clouds_hi = clouds_hi;}
    public void setPrecip(String precip){this.precip = precip;}
    public void setWeather(IconWeatherModel weather){this.weather = weather;}
    public void setMax_temp(String max_temp){this.max_temp = max_temp;}
    public void setMoonset_ts(String moonset_ts){this.moonset_ts = moonset_ts;}
    public void setDatetime(String datetime){this.datetime = datetime;}
    public void setTemp(String temp){this.temp = temp;}
    public void setMin_temp(String min_temp){this.min_temp = min_temp;}
    public void setClouds_mod(String clouds_mod){this.clouds_mod = clouds_mod;}
    public void setClouds_low(String clouds_low){this.clouds_low = clouds_low;}

    public String getMoonrise_ts(String moonrise_ts){ return this.moonrise_ts;}
    public String getWind_cdir(String wind_cdir){ return this.wind_cdir;}
    public String getRh(String rh){ return this.rh;}
    public String getPres(String pres){ return this.pres;}
    public String getSunset_ts(String sunset_ts){ return this.sunset_ts;}
    public String getOzone(String ozone){ return this.ozone;}
    public String getMoon_phase(String moon_phase){ return this.moon_phase;}
    public String getWind_gust_spd(String wind_gust_spd){ return this.wind_gust_spd;}
    public String getSnow_depth(String snow_depth){ return this.snow_depth;}
    public String getClouds(String clouds){ return this.clouds;}
    public String getTs(String ts){ return this.ts;}
    public String getSunrise_ts(String sunrise_ts){ return this.sunrise_ts;}
    public String getApp_min_temp(String app_min_temp){ return this.app_min_temp;}
    public String getWind_spd(String wind_spd){ return this.wind_spd;}
    public String getPop(String pop){ return this.pop;}
    public String getWind_cdir_full(String wind_cdir_full){ return this.wind_cdir_full;}
    public String getSlp(String slp){ return this.slp;}
    public String getApp_max_temp(String app_max_temp){ return this.app_max_temp;}
    public String getVis(String vis){ return this.vis;}
    public String getDewpt(String dewpt){ return this.dewpt;}
    public String getSnow(String snow){ return this.snow;}
    public String getUv(String uv){ return this.uv;}
    public String getValid_date(String valid_date){ return this.valid_date;}
    public String getWind_dir(String wind_dir){ return this.wind_dir;}
    public String getMax_dhi(String max_dhi){ return this.max_dhi;}
    public String getClouds_hi(String clouds_hi){ return this.clouds_hi;}
    public String getPrecip(String precip){ return this.precip;}
    public IconWeatherModel getWeather(IconWeatherModel weather){ return this.weather;}
    public String getMax_temp(String max_temp){ return this.max_temp;}
    public String getMoonset_ts(String moonset_ts){ return this.moonset_ts;}
    public String getDatetime(String datetime){ return this.datetime;}
    public String getTemp(String temp){ return this.temp;}
    public String getMin_temp(String min_temp){ return this.min_temp;}
    public String getClouds_mod(String clouds_mod){ return this.clouds_mod;}
    public String getClouds_low(String clouds_low){ return this.clouds_low;}

    @NonNull
    public String toString(){

    //TODO create toString method
    return "True";

    }

}
