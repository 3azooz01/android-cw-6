package com.example.newclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movies m1 = new Movies("Fast and Furious 6", "Vin Diesel", "Action", 7.1, 13);
        Movies m2 = new Movies("Spider-Man: Far From Home", "Tom Holland", "Action/Adventure", 7.5, 13);
        Movies m3 = new Movies("Dragon Ball Super: Broly", "Goku(Masoko Nozawa", "Animation/Action", 8.2,13);


    }

}
