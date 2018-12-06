package alex.student.onpu.weather.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import alex.student.onpu.weather.model.DailyWeatherModel;
import alex.student.onpu.weather.model.HourlyWeatherModel;

public interface WeatherApi {

    @GET("/daily")
    Call<List<DailyWeatherModel>> getDailyCityData(@Query("key") String key, @Query("city") String city);

    @GET("/daily")
    Call<List<DailyWeatherModel>> getDailyData(@Query("key") String key);

    @GET("/hourly")
    Call<List<HourlyWeatherModel>> getHourlyCityData(@Query("key") String key, @Query("city") String city);

    @GET("/hourly")
    Call<List<HourlyWeatherModel>> getHourlyData(@Query("key") String key);

}
