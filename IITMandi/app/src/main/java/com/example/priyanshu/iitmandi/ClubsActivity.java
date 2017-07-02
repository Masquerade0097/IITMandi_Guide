package com.example.priyanshu.iitmandi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class ClubsActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Clubs");

        loadBackdrop();

        CardView programming_club = (CardView) findViewById(R.id.programming_club);
        programming_club.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent facultyIntent = new Intent(ClubsActivity.this,ClubDetailActivity.class);
                startActivity(facultyIntent);

//                Toast.makeText(view.getContext(),"Open the Programming Club",Toast.LENGTH_SHORT).show();
            }
        });

        CardView roboticsClub = (CardView) findViewById(R.id.robotics_club);
        roboticsClub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent facultyIntent = new Intent(ClubsActivity.this,ClubDetailActivity.class);
                startActivity(facultyIntent);

//                Toast.makeText(view.getContext(),"Open the Programming Club",Toast.LENGTH_SHORT).show();
            }
        });

        CardView astronomyClub = (CardView) findViewById(R.id.astronomy_club);
        astronomyClub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent facultyIntent = new Intent(ClubsActivity.this,ClubDetailActivity.class);
                startActivity(facultyIntent);

//                Toast.makeText(view.getContext(),"Open the Programming Club",Toast.LENGTH_SHORT).show();
            }
        });

        CardView sntcClub = (CardView) findViewById(R.id.sntc_club);
        sntcClub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent facultyIntent = new Intent(ClubsActivity.this,ClubDetailActivity.class);
                startActivity(facultyIntent);

//                Toast.makeText(view.getContext(),"Open the Programming Club",Toast.LENGTH_SHORT).show();
            }
        });

        CardView hntClub = (CardView) findViewById(R.id.hnt_club);
        hntClub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent facultyIntent = new Intent(ClubsActivity.this,ClubDetailActivity.class);
                startActivity(facultyIntent);

//                Toast.makeText(view.getContext(),"Open the Programming Club",Toast.LENGTH_SHORT).show();
            }
        });

        CardView literarySociety = (CardView) findViewById(R.id.literary_society);
        literarySociety.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent facultyIntent = new Intent(ClubsActivity.this,ClubDetailActivity.class);
                startActivity(facultyIntent);

//                Toast.makeText(view.getContext(),"Open the Programming Club",Toast.LENGTH_SHORT).show();
            }
        });

        CardView designauts = (CardView) findViewById(R.id.designauts);
        designauts.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent facultyIntent = new Intent(ClubsActivity.this,ClubDetailActivity.class);
                startActivity(facultyIntent);

//                Toast.makeText(view.getContext(),"Open the Programming Club",Toast.LENGTH_SHORT).show();
            }
        });

        CardView artgeeks = (CardView) findViewById(R.id.artgeeks);
        artgeeks.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent facultyIntent = new Intent(ClubsActivity.this,ClubDetailActivity.class);
                startActivity(facultyIntent);

//                Toast.makeText(view.getContext(),"Open the Programming Club",Toast.LENGTH_SHORT).show();
            }
        });

        CardView ecell = (CardView) findViewById(R.id.e_cell);
        ecell.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent facultyIntent = new Intent(ClubsActivity.this,ClubDetailActivity.class);
                startActivity(facultyIntent);

//                Toast.makeText(view.getContext(),"Open the Programming Club",Toast.LENGTH_SHORT).show();
            }
        });

        CardView cnpCell = (CardView) findViewById(R.id.cnp_cell);
        cnpCell.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent facultyIntent = new Intent(ClubsActivity.this,ClubDetailActivity.class);
                startActivity(facultyIntent);

//                Toast.makeText(view.getContext(),"Open the Programming Club",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loadBackdrop() {
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        // Glide.with(this).load(Cheeses.getRandomCheeseDrawable()).centerCrop().into(imageView);
        imageView.setImageResource(R.drawable.cheese);
    }

}
