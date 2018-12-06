package alex.student.onpu.weather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import java.util.List;

import alex.student.onpu.weather.model.DailyWeatherModel;
import retrofit2.Call;

public class MainActivity extends AppCompatActivity {

    ImageButton btnSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSettings = (ImageButton) findViewById(R.id.Settings);

        Call<List<DailyWeatherModel>> response = RetroFitApiApplication.getApi().getDailyData("9f317c7a7a714a1ab386158e3c789d19");

        Log.i("Asd",response.toString());

        OnClickListener btnSettingsClick = new OnClickListener(){
            @Override
            public void onClick(View v){
                goSettings(v);
            }
        };

        btnSettings.setOnClickListener(btnSettingsClick);

    }

    public void goSettings(View view) {

        Intent intentSettings = new Intent(this, Settings.class);

        startActivity(intentSettings);

    }

}
