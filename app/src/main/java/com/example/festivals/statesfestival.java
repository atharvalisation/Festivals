package com.example.festivals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class statesfestival extends AppCompatActivity {
    TextView heading;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statesfestival);

        heading = findViewById(R.id.heading);
        lv = findViewById(R.id.statefestivallist);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("state")) {
            String stateName = intent.getStringExtra("state");

            if(stateName.equals("Maharashtra"))
            {
                heading.setText("Maharashtra");

                String[] festivalNames = {
                        "Nag Panchami",
                        "Gudhi Padwa",
                        "Narali Pournima",
                        " Ganesh Chathurthi",
                        "Krishna Janmashtami",
                        "Makar Sankranti",
                        "Bhau Beej",
                        "Ellora Festival",
                        "Ashadhi Ekadashi",
                        "Mangala Gauri",
                        "Pola",
                        "Shivaji Jayanti",
                        "Kojagiri Purnima",
                        "Banganga Festival",
                        " Vat Pournima"
                };

                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, festivalNames);
                lv.setAdapter(adapter);
            }

            if(stateName.equals("West Bengal"))
            {
                heading.setText("West Bengal");

                String[] festivalNamesWestBengal = {
                        "Durga Puja",
                        "Kali Puja",
                        "Nababarsha (Bengali New Year)",
                        "Rath Yatra",
                        "Buddha Purnima",
                        "Poush Parbon",
                        "Poila Boishakh",
                        "Jamai Sasthi",
                        "Nobanno",
                        "Teesta Tea & Tourism Festival",
                        "Ganga Sagar Mela",
                        "Rash Mela",
                        "Basant Panchami",
                        "Vasant Utsav",
                        "Pohela Falgun",
                        "Rathyatra",
                        "Gajan",
                        "Charak Puja",
                        "Bishnupur Mela",
                        "Baranti Mela"
                };

                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, festivalNamesWestBengal);
                lv.setAdapter(adapter);
            }

            if(stateName.equals("Tamil Nadu"))
            {
                heading.setText("Tamil Nadu");

                String[] festivalNamesTamilNadu = {
                        "Pongal",
                        "Tamil New Year (Puthandu)",
                        "Deepavali",
                        "Navarathri",
                        "Thaipusam",
                        "Karadaiyan Nombu",
                        "Thai Pusam",
                        "Chithirai Festival",
                        "Aadi Perukku",
                        "Aadi Pooram",
                        "Aadi Amavasai",
                        "Aadi Kiruthigai",
                        "Vinayaka Chaturthi",
                        "Puthandu",
                        "Varalakshmi Vratam",
                        "Avani Avittam",
                        "Saraswati Puja",
                        "Ayya Vaikundar Nizhal Thangal",
                        "Maasi Magam",
                        "Karthigai Deepam"
                };


                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, festivalNamesTamilNadu);
                lv.setAdapter(adapter);
            }

            if(stateName.equals("Gujrat"))
            {
                heading.setText("Gujrat");

                String[] festivalNamesGujarat = {
                        "Navratri",
                        "Uttarayan (Makar Sankranti)",
                        "Diwali",
                        "Rath Yatra",
                        "Janmashtami",
                        "Holi",
                        "Sharad Purnima",
                        "Tulsi Vivah",
                        "Kite Festival",
                        "Shivratri",
                        "Rann Utsav",
                        "Bhadra Purnima",
                        "Dussehra",
                        "Vasant Panchami",
                        "Chitra Vichitra Fair",
                        "Modhera Dance Festival",
                        "Rann Mahotsav",
                        "Narmada Mahotsav",
                        "Tarnetar Fair",
                        "Bhavnath Mahadev Fair"
                };

                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, festivalNamesGujarat);
                lv.setAdapter(adapter);
            }

            if(stateName.equals("Punjab"))
            {
                heading.setText("Punjab");

                String[] festivalNamesPunjab = {
                        "Baisakhi",
                        "Lohri",
                        "Gurpurab",
                        "Hola Mohalla",
                        "Teej",
                        "Diwali",
                        "Holla Mohalla",
                        "Maha Shivaratri",
                        "Gugga Naumi",
                        "Karva Chauth",
                        "Basant Panchami",
                        "Guru Nanak Jayanti",
                        "Dussehra",
                        "Holi",
                        "Raksha Bandhan",
                        "Janmashtami",
                        "Durga Puja",
                        "Navratri",
                        "Chhath Puja",
                        "Eid"
                };

                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, festivalNamesPunjab);
                lv.setAdapter(adapter);
            }

            if(stateName.equals("Goa"))
            {
                heading.setText("Goa");

                String[] festivalNamesGoa = {
                        "Carnival",
                        "Christmas",
                        "New Year",
                        "Shigmo",
                        "Diwali",
                        "Ganesh Chaturthi",
                        "Navaratri",
                        "Dussehra",
                        "Sao Joao",
                        "Gudi Padwa",
                        "Gokulashtami",
                        "Sangodd",
                        "Tripurari Poornima",
                        "Bonderam",
                        "Feast of St. Francis Xavier",
                        "Gol Jatra",
                        "Sao Joao",
                        "Gudi Padwa",
                        "Zatra of Shantadurga"
                };

                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, festivalNamesGoa);
                lv.setAdapter(adapter);
            }

            if(stateName.equals("Rajasthan"))
            {
                heading.setText("Rajasthan");

                String[] festivalNamesRajasthan = {
                        "Pushkar Camel Fair",
                        "Desert Festival (Jaisalmer)",
                        "Gangaur Festival",
                        "Teej Festival",
                        "Mewar Festival",
                        "Marwar Festival",
                        "Elephant Festival (Jaipur)",
                        "Teej Festival",
                        "Kite Festival (Jaipur)",
                        "Sheetla Mata Fair",
                        "Summer Festival (Mount Abu)",
                        "Kajli Teej",
                        "Mahavir Jayanti",
                        "Ramdevra Fair",
                        "Gangaur Fair"
                };

                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, festivalNamesRajasthan);
                lv.setAdapter(adapter);
            }

            if(stateName.equals("Kerala"))
            {
                heading.setText("Kerala");

                String[] festivalNamesKerala = {
                        "Onam",
                        "Vishu",
                        "Thrissur Pooram",
                        "Attukal Pongala",
                        "Maha Shivaratri",
                        "Navaratri",
                        "Eid-ul-Fitr",
                        "Christmas",
                        "Easter",
                        "Nehru Trophy Boat Race (Alappuzha)",
                        "Chandanakudam",
                        "Arattupuzha Pooram",
                        "Thaipooya Mahotsavam",
                        "Pulikali (Tiger Dance)",
                        "Aranmula Boat Race",
                        "Kottiyoor Vysakha Mahotsavam",
                        "Makaravilakku at Sabarimala",
                        "Kodungalloor Bharani",
                        "Malabar Mahotsavam",
                        "Neelamperoor Padayani"
                };

                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, festivalNamesKerala);
                lv.setAdapter(adapter);
            }
        }
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