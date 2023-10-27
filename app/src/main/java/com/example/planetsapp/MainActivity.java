package com.example.planetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Planet> planetsArrayList;
    private static myCustomAdaptor adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        planetsArrayList = new ArrayList<>();

        Planet planet1 = new Planet("Earth","1", R.drawable.earth);
        Planet planet2 = new Planet("Jupiter","79", R.drawable.jupiter);
        Planet planet3 = new Planet("mars","2", R.drawable.mars);
        Planet planet4 = new Planet("Mercury","0", R.drawable.mercury);
        Planet planet5 = new Planet("Neptune","14", R.drawable.neptune);
        Planet planet6 = new Planet("Pluto","1", R.drawable.pluto);
        Planet planet7 = new Planet("Saturn","83", R.drawable.saturn);
        Planet planet8 = new Planet("Uranus","27", R.drawable.uranus);
        Planet planet9 = new Planet("Venus","0", R.drawable.venus);

        planetsArrayList.add(planet1);
        planetsArrayList.add(planet2);
        planetsArrayList.add(planet3);
        planetsArrayList.add(planet4);
        planetsArrayList.add(planet5);
        planetsArrayList.add(planet6);
        planetsArrayList.add(planet7);
        planetsArrayList.add(planet8);
        planetsArrayList.add(planet9);


        adaptor = new myCustomAdaptor(planetsArrayList, getApplicationContext());
        listView.setAdapter(adaptor);


        //handling clicks
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(
                        MainActivity.this,
                        "Planet Name: " + adaptor.getItem(position).getPlanetName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}