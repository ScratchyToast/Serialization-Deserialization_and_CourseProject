package alex.student.onpu.weather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Settings extends AppCompatActivity {

    ImageButton btnBack;
    ImageButton btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        btnBack = (ImageButton) findViewById(R.id.Back);
        btnSave = (ImageButton) findViewById(R.id.Save);


        OnClickListener btnBackClick = new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView viewMainText = (TextView) findViewById(R.id.textView);
                viewMainText.setText("Back");

                finish();
            }
        };

        OnClickListener btnSaveClick = new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView viewMainText = (TextView) findViewById(R.id.textView);

                finish();
            }
        };

        btnBack.setOnClickListener(btnBackClick);
        btnSave.setOnClickListener(btnSaveClick);

    }

    public void goMain(View v) {

    }
}
