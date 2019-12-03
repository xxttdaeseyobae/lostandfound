package com.softwarica.lostandfound;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class signupactivity extends AppCompatActivity {
private Spinner spincountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupactivity);
        spincountry=findViewById(R.id.spincountry);

        String countries [] ={"India","China", "Nepal"};
        ArrayAdapter adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1 ,
                countries
        );
        spincountry.setAdapter(adapter);
    }
}
