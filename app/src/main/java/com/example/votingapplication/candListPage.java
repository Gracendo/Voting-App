package com.example.votingapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class candListPage extends AppCompatActivity {
    private ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_list_layout);
        listView = findViewById(R.id.cand_list);
        // Create an ArrayList to hold your data (can be String, custom objects, etc.)
//        ArrayList<String> data = new ArrayList<>();
        ArrayList<Candidate> data = new ArrayList<>();
        data.add(new Candidate(
            "Candidate 1",
            "B1A",
            13,
            "Personal Development",
            "World-renowned life coach and motivational speaker known for his high-energy seminars and life-changing advice.",
            "The Power of Unleashing Your Potential",
            R.drawable.cand1 // Replace with your actual image resource ID
        ));
        data.add(new Candidate(
            "Candidate 2",
            "B1C",
            18,
            "Sustainability",
            "Pioneering primatologist and conservationist dedicated to protecting chimpanzees and their habitats.",
            "Reasons for Hope: A New Generation Tackles Climate Change",
            R.drawable.cand2 // Replace with your actual image resource ID
        ));
        data.add(new Candidate(
            "Candidate 3",
            "L1D",
            20,
            "Innovation",
            "Visionary entrepreneur leading the charge in electric vehicles, space exploration, and sustainable energy.",
            "Disrupting the Future: How Technology Can Solve Our Biggest Challenges",
            R.drawable.cand3 // Replace with your actual image resource ID
        ));
        data.add(new Candidate(
            "Candidate 4",
            "L1A",
            23,
            "Education",
            "Youngest Nobel Prize laureate advocating for girls' education and human rights.",
            "I Am Malala: The Story of a Girl Who Stood Up for Education and Changed the World",
            R.drawable.cand4 // Replace with your actual image resource ID
        ));

        // Create a custom adapter for the ListView
        CandidateListAdapter adapter = new CandidateListAdapter(this, data);
        listView.setAdapter(adapter);
    }
}
