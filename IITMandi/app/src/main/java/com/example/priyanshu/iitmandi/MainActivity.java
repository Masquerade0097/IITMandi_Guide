package com.example.priyanshu.iitmandi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//adding toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        if (navigationView != null) {
            setupDrawerContent(navigationView);
//        }
//        navigationView.setNavigationItemSelectedListener(this);


//        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
//        if (viewPager != null) {
//            setupViewPager(viewPager);
//        }


//here it ends


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
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

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
