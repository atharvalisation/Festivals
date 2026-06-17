package com.example.festivals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SearchFestival extends AppCompatActivity {
    EditText searchText;
    Button searchButton;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_festival);
        searchText = findViewById(R.id.searchText);
        searchButton = findViewById(R.id.searchButton);
        webView = findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String query = searchText.getText().toString();
                if (!query.isEmpty()) {
                    search(query);
                } else {
                    Toast.makeText(SearchFestival.this, "Please enter a search query", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void search(String query) {
        String searchUrl = "https://www.google.com/search?q=" + query;
        webView.loadUrl(searchUrl);
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