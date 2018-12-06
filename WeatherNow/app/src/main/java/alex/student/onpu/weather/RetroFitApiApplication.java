package alex.student.onpu.weather;

import android.app.Application;

import alex.student.onpu.weather.api.WeatherApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitApiApplication extends Application {

    private static WeatherApi weatherApi;
    private Retrofit retrofit;

    @Override
    public void onCreate(){
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.weatherbit.io/v2.0/forecast/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        weatherApi = retrofit.create(WeatherApi.class);

    }

    public static WeatherApi getApi(){
        return weatherApi;
    }

}
