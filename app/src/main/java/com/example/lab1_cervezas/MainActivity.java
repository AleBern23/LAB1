package com.example.lab1_cervezas;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Beers brTipo = new Beers();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void onClickBeer(View view){
        TextView textView = (TextView) findViewById(R.id.textView);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        String beerTypes = String.valueOf(spinner.getSelectedItem());

        List<String> tipoCerveza = brTipo.obtenerCervezas(beerTypes);
        StringBuilder beerTyp = new StringBuilder();
        for (String beer : tipoCerveza)
            beerTyp.append(beer).append('\n');
        textView.setText(beerTyp);
    }
}