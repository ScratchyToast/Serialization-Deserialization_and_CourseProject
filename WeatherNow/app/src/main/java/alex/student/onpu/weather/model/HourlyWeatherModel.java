package alex.student.onpu.weather.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HourlyWeatherModel {

    @SerializedName("data")
    @Expose
    List<HourlyWeatherDataModel> data;

}
