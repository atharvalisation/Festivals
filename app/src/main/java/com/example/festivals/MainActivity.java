package com.example.festivals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private HorizontalScrollView horizontalScrollView;
    private LinearLayout bannerLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horizontalScrollView = findViewById(R.id.banners);
        bannerLinearLayout = findViewById(R.id.bannerLinearLayout);

        AutoScrollService.setViews(horizontalScrollView, bannerLinearLayout);

        Intent serviceIntent = new Intent(this, AutoScrollService.class);
        startService(serviceIntent);
    }


    public void maharashtra(View view) {
        Intent intent = new Intent(MainActivity.this, statesfestival.class);
        intent.putExtra("state", "Maharashtra");
        startActivity(intent);
    }

    public void westbengal(View view) {
        Intent intent = new Intent(MainActivity.this, statesfestival.class);
        intent.putExtra("state", "West Bengal");
        startActivity(intent);
    }

    public void tamilnadu(View view) {
        Intent intent = new Intent(MainActivity.this, statesfestival.class);
        intent.putExtra("state", "Tamil Nadu");
        startActivity(intent);
    }

    public void gujrat(View view) {
        Intent intent = new Intent(MainActivity.this, statesfestival.class);
        intent.putExtra("state", "Gujrat");
        startActivity(intent);
    }

    public void punjab(View view) {
        Intent intent = new Intent(MainActivity.this, statesfestival.class);
        intent.putExtra("state", "Punjab");
        startActivity(intent);
    }

    public void goa(View view) {
        Intent intent = new Intent(MainActivity.this, statesfestival.class);
        intent.putExtra("state", "Goa");
        startActivity(intent);
    }

    public void rajasthan(View view) {
        Intent intent = new Intent(MainActivity.this, statesfestival.class);
        intent.putExtra("state", "Rajasthan");
        startActivity(intent);
    }

    public void kerala(View view) {
        Intent intent = new Intent(MainActivity.this, statesfestival.class);
        intent.putExtra("state", "Kerala");
        startActivity(intent);
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