package com.example.costumspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    String [] countries = {"choose country", "Brazil", "Israel", "Serbia", "Spain","France","USA","Swisterland"};
    int [] images = {R.drawable.white, R.drawable.brazil, R.drawable.israel, R.drawable.serbia, R.drawable.spain, R.drawable.france, R.drawable.usa, R.drawable.switzerland};
    String [] capitalCity = {"", "Brazilia","Jerusalem","Belgrade","Madrid","Paris","Washington D.C","Bern"};
    String [] population = {"","214 million","9.364 million","6.844 million","47.33 million","67.5 million","331.9 million","8.698 million"};
    Spinner spin;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);
        spin = (Spinner) findViewById(R.id.sp);

        custom_adaper customAdp = new custom_adaper(getApplicationContext(), countries, images, capitalCity);
        spin.setAdapter(customAdp);
        spin.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long rowid) {
        if (pos != 0){
            tv.setText("country name: "+ countries[pos] +"\n" + "capital city: "+capitalCity[pos] + "\n"+ "population: "+population[pos]);
        }
        else{
            tv.setText("");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}