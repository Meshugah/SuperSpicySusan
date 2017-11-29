package com.example.vignesh.buttonpress;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference spice1 = database.getReference("Spice1");
        final DatabaseReference spice2 = database.getReference("Spice2");
        final DatabaseReference spice3 = database.getReference("Spice3");
        final DatabaseReference spice4 = database.getReference("Spice4");
        final DatabaseReference spice5 = database.getReference("Spice5");
        final DatabaseReference spice6 = database.getReference("Spice6");
        final DatabaseReference spice7 = database.getReference("Spice7");
        final DatabaseReference spice8 = database.getReference("Spice8");
        final DatabaseReference spice9 = database.getReference("Spice9");
        final DatabaseReference spice10 = database.getReference("Spice10");
        final DatabaseReference spice11 = database.getReference("Spice11");
        final DatabaseReference spice12 = database.getReference("Spice12");
        final DatabaseReference spice13 = database.getReference("Spice13");
        final DatabaseReference spice14 = database.getReference("Spice14");
        final DatabaseReference spice15 = database.getReference("Spice15");
        final DatabaseReference spice16 = database.getReference("Spice16");
        final DatabaseReference spice17 = database.getReference("Spice17");
        final DatabaseReference spice18 = database.getReference("Spice18");




        //textview stuff
        final TextView tv1 = (TextView)findViewById(R.id.spice1);


        spice1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv1.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv2 = (TextView)findViewById(R.id.spice2);


        spice2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv2.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv3 = (TextView)findViewById(R.id.spice3);


        spice3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv3.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv4 = (TextView)findViewById(R.id.spice4);


        spice4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv4.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv5 = (TextView)findViewById(R.id.spice5);


        spice5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv5.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv6 = (TextView)findViewById(R.id.spice6);


        spice6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv6.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv7 = (TextView)findViewById(R.id.spice7);


        spice7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv7.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv8 = (TextView)findViewById(R.id.spice8);


        spice8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv8.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv9 = (TextView)findViewById(R.id.spice9);


        spice9.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv9.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv10 = (TextView)findViewById(R.id.spice10);


        spice10.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv10.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv11 = (TextView)findViewById(R.id.spice11);


        spice11.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv11.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv12 = (TextView)findViewById(R.id.spice12);


        spice12.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv12.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv13 = (TextView)findViewById(R.id.spice13);


        spice13.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv13.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //textview stuff
        final TextView tv14 = (TextView)findViewById(R.id.spice14);


        spice14.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv14.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv15 = (TextView)findViewById(R.id.spice15);


        spice15.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv15.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv16 = (TextView)findViewById(R.id.spice16);


        spice16.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv16.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv17 = (TextView)findViewById(R.id.spice17);


        spice17.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv17.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv18 = (TextView)findViewById(R.id.spice18);


        spice18.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tv18.setText(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //FAB
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        final boolean[] flag = {true};
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag[0]) {
                    Snackbar.make(view, "Updated Firebase", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                  //  spice1.setValue(1);
                    flag[0] = false;
                }
                else if(!flag[0]){
                    Snackbar.make(view, "Updated Firebase", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                   // spice1.setValue(0);
                    flag[0] = true;
                }
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_inventory) {
            // Handle the camera action
        }  else if (id == R.id.nav_notifications) {

        } else if (id == R.id.nav_logout) {

        } else if (id == R.id.nav_settings) {

        } else if (id == R.id.rate_us) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
