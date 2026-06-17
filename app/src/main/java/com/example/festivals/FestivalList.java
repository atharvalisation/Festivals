package com.example.festivals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FestivalList extends AppCompatActivity {

    private ListView festivalListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival_list);

        festivalListView = findViewById(R.id.festivallist);
        String[] festivalNames = {
                "Holi Festival",
                "Diwali Festival",
                "Dussehra Festival",
                "Eid Festival",
                "Christmas Day",
                "Pongal Festival",
                "Ganesh Chaturthi",
                "Durga Puja",
                "Baisakhi Festival",
                "Lohri Festival",
                "Easter Festival",
                "Onam Festival",
                "Buddha Purnima",
                "Raksha Bandhan",
                "Krishna Janmashtami",
                "Chhath Puja",
                "Maha Shivratri",
                "Bihu Festival",
                "Makar Sankranti",
                "Hemis Festival",
                "Losar Festival",
                "Hornbill Festival",
                "Saraswati Puja",
                "Navratri Festival",
                "Teej Festival",
                "Ram Navami",
                "Karva Chauth",
                "Saga Dawa",
                "Dree Festival",
                "Mahavir Jayanti"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, festivalNames);

        festivalListView.setAdapter(adapter);

        // Set item click listener
        festivalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Retrieve the festival name associated with the clicked item
                String selectedFestival = (String) parent.getItemAtPosition(position);

                // Start Festival activity and pass the festival name
                Intent intent = new Intent(FestivalList.this, FestivalAcitivity.class);
                intent.putExtra("festivalName", selectedFestival);
                startActivity(intent);
            }
        });
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