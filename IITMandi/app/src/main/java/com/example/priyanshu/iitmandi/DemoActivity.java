package com.example.priyanshu.iitmandi;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DemoActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        //Intent intent = getIntent();
        //final String cheeseName = intent.getStringExtra(EXTRA_NAME);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Faculty");

        loadBackdrop();

        CardView directorCard = (CardView) findViewById(R.id.directorCard);
        directorCard.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
//                Intent facultyIntent = new Intent(DemoActivity.this,FacultyActivity.class);
//                startActivity(facultyIntent);

                  Toast.makeText(view.getContext(),"Open the List Of Numbers",Toast.LENGTH_SHORT).show();
            }
        });

        CardView sceeCard = (CardView) findViewById(R.id.sceeCard);
        sceeCard.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
//                Intent facultyIntent = new Intent(DemoActivity.this,FacultyActivity.class);
//                startActivity(facultyIntent);

                Toast.makeText(view.getContext(),"JUst a tupple",Toast.LENGTH_SHORT).show();
            }
        });

        CardView sbsCard = (CardView) findViewById(R.id.sbsCard);
        sbsCard.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
//                Intent facultyIntent = new Intent(DemoActivity.this,FacultyActivity.class);
//                startActivity(facultyIntent);

                Toast.makeText(view.getContext(),"tupple of sbs",Toast.LENGTH_SHORT).show();
            }
        });

        CardView seCard = (CardView) findViewById(R.id.seCard);
        seCard.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
//                Intent facultyIntent = new Intent(DemoActivity.this,FacultyActivity.class);
//                startActivity(facultyIntent);

                Toast.makeText(view.getContext(),"tupple of sbs",Toast.LENGTH_SHORT).show();
            }
        });

        CardView shssCard = (CardView) findViewById(R.id.shssCard);
        shssCard.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
//                Intent facultyIntent = new Intent(DemoActivity.this,FacultyActivity.class);
//                startActivity(facultyIntent);

                Toast.makeText(view.getContext(),"tupple of sbs",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loadBackdrop() {
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
       // Glide.with(this).load(Cheeses.getRandomCheeseDrawable()).centerCrop().into(imageView);
        imageView.setImageResource(R.drawable.cheese);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.sample_actions, menu);
//        return true;
//    }


}