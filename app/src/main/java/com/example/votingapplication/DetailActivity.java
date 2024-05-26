package com.example.votingapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
 
    private ImageView candImageView,backButton;
    private Button voteButton;
    private TextView candNameTitle,candNationality,candAge,candTheme,candDescription,candTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_detail);

        // Get references to UI elements
        this.candImageView = findViewById(R.id.cand_image_view);
        this.candNameTitle = findViewById(R.id.cand_name_text_view);
        this.candNationality = findViewById(R.id.cand_nationality);
        this.candAge = findViewById(R.id.cand_age);
        this.candTheme = findViewById(R.id.cand_theme);
        this.candDescription = findViewById(R.id.cand_description);
        this.candTitle = findViewById(R.id.cand_title);
        this.voteButton = findViewById(R.id.rent_button);
        this.backButton = findViewById(R.id.detail_back);
        Intent intent = getIntent();
        String can_NameTitle = null;
        // Get data from the Intent (optional)
        if (intent != null && intent.hasExtra("canNameTitle")) {
            can_NameTitle = intent.getStringExtra("canNameTitle");
            String can_Nationality = intent.getStringExtra("canNationality");
            String can_Age = intent.getStringExtra("canAge");
            String can_Theme = intent.getStringExtra("canTheme");
            String can_Description = intent.getStringExtra("canDescription");
            String can_Title = intent.getStringExtra("canTitle");
            String image = intent.getStringExtra("imageResourceId");
            int imageResourceId = Integer.parseInt(image);

            // Update UI elements with car data (replace with your logic
            candNameTitle.setText(can_NameTitle);
            candNationality.setText(can_Nationality);
            candAge.setText(can_Age);
            candTheme.setText(can_Theme);
            candDescription.setText(can_Description);
            candTitle.setText(can_Title);
            candImageView.setImageResource(imageResourceId); // Example for a specific car image
        }

        // Set click listener for rent button (handle rental logic here)
        String finalCan_NameTitle = can_NameTitle;
        voteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle rent button click (e.g., show rental confirmation or navigate to rental process)
                Toast.makeText(DetailActivity.this, "Rent button clicked!" + finalCan_NameTitle, Toast.LENGTH_SHORT).show();
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to launch the DetailActivity
                Intent intent = new Intent(DetailActivity.this, candListPage.class);
                // Start the DetailActivity
                startActivity(intent);
            }
        });
    }
}


