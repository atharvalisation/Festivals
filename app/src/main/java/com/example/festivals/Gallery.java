package com.example.festivals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
    }
    public void openHome(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void opengallery(View view) {
        Intent i = new Intent(this, Gallery.class);
        startActivity(i);
    }

    public void openlist(View view) {
        Intent i = new Intent(this, FestivalList.class);
        startActivity(i);
    }

    public void opensearch(View view) {
        Intent i = new Intent(this, SearchFestival.class);
        startActivity(i);
    }
}