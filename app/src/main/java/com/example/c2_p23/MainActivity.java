package com.example.c2_p23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView txt;
    private final String red = "#FF0000";
    private final String yellow = "#FFFF00";
    private final String green = "#00FF00";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button_name);
        txt = (TextView) findViewById(R.id.traffic_name);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int color = txt.getCurrentTextColor();
                String hexColor = String.format("#%06X", (0xFFFFFF & color));
                switch (hexColor){
                    case (red):
                        txt.setTextColor(getResources().getColor(R.color.green));
                        break;
                    case (green):
                        txt.setTextColor(getResources().getColor(R.color.yellow));
                        break;
                    case (yellow):
                        txt.setTextColor(getResources().getColor(R.color.red));
                        break;
                    default:
                        Log.w("TAG", "onClick: " + hexColor);
                }

            }
        });
    }

}