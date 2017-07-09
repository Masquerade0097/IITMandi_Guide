package com.example.priyanshu.iitmandi;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;



public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
//    public String mTitle = "II";
//    public String mDrawerTitle = "My Title";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//adding toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        mDrawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                mDrawerLayout,         /* DrawerLayout object */
                R.string.drawer_open,  /* "open drawer" description */
                R.string.drawer_close  /* "close drawer" description */
        ) {

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
//                getSupportActionBar().setTitle(mTitle);
            }

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
//                getSupportActionBar().setTitle(mDrawerTitle);
            }
        };

        // Set the drawer toggle as the DrawerListener
        mDrawerLayout.addDrawerListener(mDrawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        if (navigationView != null) {
            setupDrawerContent(navigationView);
//        }


//setting the grid view
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
            int pos = position;
                if(pos==0){
                    Intent intent = new Intent(MainActivity.this,OverviewActivity.class);
                    startActivity(intent);
                }
                if(pos==1){
                    Intent intent = new Intent(MainActivity.this,DemoActivity.class);
                    startActivity(intent);
                }
                if(pos==2){
                    Intent intent = new Intent(MainActivity.this,ClubsActivity.class);
                    startActivity(intent);
                }
                if(pos==3){
                    Intent intent = new Intent(MainActivity.this,DemoActivity.class);
                    startActivity(intent);
                }
                if(pos==4){
                    Intent intent = new Intent(MainActivity.this,DemoActivity.class);
                    startActivity(intent);
                }
                if(pos==5){
                    Intent intent = new Intent(MainActivity.this,DemoActivity.class);
                    startActivity(intent);
                }
                if(pos==6){
                    Intent intent = new Intent(MainActivity.this,DemoActivity.class);
                    startActivity(intent);
                }
                if(pos==7){
                    Intent intent = new Intent(MainActivity.this,DemoActivity.class);
                    startActivity(intent);
                }
                if(pos==8){
                    Intent intent = new Intent(MainActivity.this,DemoActivity.class);
                    startActivity(intent);
                }
                if(pos==9) {
                    Intent intent = new Intent(MainActivity.this, DemoActivity.class);
                    startActivity(intent);
                }

            }
        });
    }


    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        menuItem.setChecked(true);
                        mDrawerLayout.closeDrawers();
                        return true;
                    }
                });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }


        switch(item.getItemId()){
            case R.id.about_app:
//                MenuItem about_app = (MenuItem) findViewById(R.id.about_app);
//                about_app.setOnMenuItemClickListener(new MenuItem().OnMenuItemClickListener{
//
//                    @Override
//                    public void onClick(View view){
////                Intent facultyIntent = new Intent(DemoActivity.this,FacultyActivity.class);
////                startActivity(facultyIntent);
//
//                        Toast.makeText(view.getContext(),"JUst a tupple",Toast.LENGTH_SHORT).show();
//                    }
//                });
                return true;
            case R.id.rate_us:
                return true;
            case R.id.developer:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
