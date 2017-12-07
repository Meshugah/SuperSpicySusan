package com.example.vignesh.buttonpress;

import android.content.Intent;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

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
        final DatabaseReference spice1 = database.getReference("Anise");
        final DatabaseReference spice2 = database.getReference("BlackCumin");
        final DatabaseReference spice3 = database.getReference("BlackPepper");
        final DatabaseReference spice4 = database.getReference("CarawaySeed");
        final DatabaseReference spice5 = database.getReference("Cardamom");
        final DatabaseReference spice6 = database.getReference("Cayenne");
        final DatabaseReference spice7 = database.getReference("Chili");
        final DatabaseReference spice8 = database.getReference("Coriander");
        final DatabaseReference spice9 = database.getReference("Fenugreek");
        final DatabaseReference spice10 = database.getReference("Garlic");
        final DatabaseReference spice11 = database.getReference("Licorice");
        final DatabaseReference spice12 = database.getReference("Mace");
        final DatabaseReference spice13 = database.getReference("Mustard");
        final DatabaseReference spice14 = database.getReference("Nutmeg");
        final DatabaseReference spice15 = database.getReference("Paprika");
        final DatabaseReference spice16 = database.getReference("Saffron");
        final DatabaseReference spice17 = database.getReference("Sesame");
        final DatabaseReference spice18 = database.getReference("Turmeric");

        //returned
        final DatabaseReference spiceBeingReturned = database.getReference("SpiceBeingReturned");
        final DatabaseReference spiceReturnedSuccess = database.getReference("SpiceReturnedSuccess");




        //Returns
        Button button1return = (Button) findViewById(R.id.button_return1);
        button1return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v1) {
                spiceBeingReturned.setValue(1);
                spiceReturnedSuccess.setValue(0);
            }
        });
        //Returns
        Button button2return = (Button) findViewById(R.id.button_return2);
        button2return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spiceBeingReturned.setValue(2);
                spiceReturnedSuccess.setValue(0);
            }
        });
        //Returns
        Button button3return = (Button) findViewById(R.id.button_return3);
        button3return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spiceBeingReturned.setValue(3);
                spiceReturnedSuccess.setValue(0);
            }
        });
        //Returns
        Button button4return = (Button) findViewById(R.id.button_return4);
        button4return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spiceBeingReturned.setValue(4);
                spiceReturnedSuccess.setValue(0);
            }
        });
        //Returns
        Button button5return = (Button) findViewById(R.id.button_return5);
        button5return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spiceBeingReturned.setValue(5);
                spiceReturnedSuccess.setValue(0);
            }
        });
        //Returns
        Button button6return = (Button) findViewById(R.id.button_return6);
        button6return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spiceBeingReturned.setValue(6);
                spiceReturnedSuccess.setValue(0);
            }
        });
        //Returns
        Button button7return = (Button) findViewById(R.id.button_return7);
        button7return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spiceBeingReturned.setValue(7);
                spiceReturnedSuccess.setValue(0);
            }
        });
        //Returns
        Button button8return = (Button) findViewById(R.id.button_return8);
        button8return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spiceBeingReturned.setValue(8);
                spiceReturnedSuccess.setValue(0);
            }
        });
        //Returns
        Button button9return = (Button) findViewById(R.id.button_return9);
        button9return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spiceBeingReturned.setValue(9);
                spiceReturnedSuccess.setValue(0);
            }
        });
        //Returns
        Button button10return = (Button) findViewById(R.id.button_return10);
        button10return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spiceBeingReturned.setValue(10);
                spiceReturnedSuccess.setValue(0);
            }
        });
        //Returns
        Button button11return = (Button) findViewById(R.id.button_return11);
        button11return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spiceBeingReturned.setValue(11);
                spiceReturnedSuccess.setValue(0);
            }
        });
        //Returns
        Button button12return = (Button) findViewById(R.id.button_return12);
        button12return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spiceBeingReturned.setValue(12);
                spiceReturnedSuccess.setValue(0);
            }
        });
        //Returns
        Button button13return = (Button) findViewById(R.id.button_return13);
        button13return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spiceBeingReturned.setValue(13);
                spiceReturnedSuccess.setValue(0);
            }
        });
        //Returns
        Button button14return = (Button) findViewById(R.id.button_return14);
        button14return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spiceBeingReturned.setValue(14);
                spiceReturnedSuccess.setValue(0);
            }
        });
        //Returns
        Button button15return = (Button) findViewById(R.id.button_return15);
        button15return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spiceBeingReturned.setValue(15);
                spiceReturnedSuccess.setValue(0);
            }
        });

        //Returns
        Button button16return = (Button) findViewById(R.id.button_return16);
        button16return.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spiceBeingReturned.setValue(16);
                spiceReturnedSuccess.setValue(0);
            }
        });

//
//        //Request
//        Button button1request = (Button) findViewById(R.id.button_request1);
//        button1request.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                spiceBeingRequested.setValue(1);
//                spiceRequestedSuccess.setValue(0);
//            }
//        });






        //textview stuff
        final TextView tv1 = (TextView)findViewById(R.id.spice1value);


        spice1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv1.setText(Integer.toString(value));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv2 = (TextView)findViewById(R.id.spice2value);


        spice2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv2.setText(Integer.toString(value));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv3 = (TextView)findViewById(R.id.spice3value);


        spice3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv3.setText(Integer.toString(value));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv4 = (TextView)findViewById(R.id.spice4value);


        spice4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv4.setText(Integer.toString(value));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv5 = (TextView)findViewById(R.id.spice5value);


        spice5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv5.setText(Integer.toString(value));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv6 = (TextView)findViewById(R.id.spice6value);


        spice6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv6.setText(Integer.toString(value));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv7 = (TextView)findViewById(R.id.spice7value);


        spice7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv7.setText(Integer.toString(value));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv8 = (TextView)findViewById(R.id.spice8value);


        spice8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv8.setText(Integer.toString(value));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv9 = (TextView)findViewById(R.id.spice9value);


        spice9.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv9.setText(Integer.toString(value));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv10 = (TextView)findViewById(R.id.spice10value);


        spice10.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv10.setText(Integer.toString(value));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv11 = (TextView)findViewById(R.id.spice11value);


        spice11.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv11.setText(Integer.toString(value));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv12 = (TextView)findViewById(R.id.spice12value);


        spice12.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv12.setText(Integer.toString(value));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv13 = (TextView)findViewById(R.id.spice13value);


        spice13.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv13.setText(Integer.toString(value));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //textview stuff
        final TextView tv14 = (TextView)findViewById(R.id.spice14value);


        spice14.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv14.setText(Integer.toString(value));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv15 = (TextView)findViewById(R.id.spice15value);


        spice15.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv15.setText(Integer.toString(value));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv16 = (TextView)findViewById(R.id.spice16value);


        spice16.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv16.setText(Integer.toString(value));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //textview stuff
        final TextView tv17 = (TextView)findViewById(R.id.spice17value);


        spice17.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int value = dataSnapshot.getValue(int.class);
                tv17.setText(Integer.toString(value));

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
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_settings) {

        } else if (id == R.id.rate_us) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
