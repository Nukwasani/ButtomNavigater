package com.example.thandiwe.buttomnavigater;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    TourRecyclerView tourRecyclerView;
    RecyclerView recyclerView;
    Context context;//will be used to inflate layout
    LayoutInflater inflater;//also be used to inflate layout
    Button btn,btn1;
    TextView tv,tv1, tv2;
    FrameLayout fram;
    ImageView image;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:



                 //   recyclerView =(RecyclerView)findViewById(R.id.recycler);
                   // recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

                    ArrayList<Tour> tours = new ArrayList<Tour>();

                    Tour t = new Tour();

                    t.setName("thandiwe");
                    t.setDesceiption("gumede");
                    t.setImage(R.drawable.bar);

                    tours.add(t);


                    tourRecyclerView = new TourRecyclerView(MainActivity.this, tours);
                   // recyclerView.setAdapter(tourRecyclerView);

                    //inflating layouts
                    inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                    View view =inflater.inflate(R.layout.item_card, null);

                    btn =(Button)view.findViewById(R.id.button);
                    tv=(TextView)view.findViewById(R.id.textView4);
                    tv.setText("thandiwe");

                    fram =(FrameLayout)findViewById(R.id.content);
                    fram.removeAllViews();
                    fram.addView(view);


                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(MainActivity.this,SecondActivity.class);
                            startActivity(i);
                        }
                    });
                    return true;
                case R.id.navigation_dashboard:

                  //  recyclerView =(RecyclerView)findViewById(R.id.recycler);

                  //  recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

                    ArrayList<Tour> tourss = new ArrayList<Tour>();

                    Tour tt = new Tour();

                    tt.setName("jbf");
                    tt.setDesceiption("hijgb");

                    tourss.add(tt);


                    tourRecyclerView = new TourRecyclerView(MainActivity.this, tourss);
                   // recyclerView.setAdapter(tourRecyclerView);

                    //inflating layouts
                    inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                    View view1 =inflater.inflate(R.layout.item_list, null);

                    tv1=(TextView)view1.findViewById(R.id.textView);
                    tv2=(TextView)view1.findViewById(R.id.textView2);

                    tv1.setText("lol");
                    tv2.setText("hhyhbbv");
                    fram =(FrameLayout)findViewById(R.id.content);
                    fram.removeAllViews();
                    fram.addView(view1);

                    return true;

                case R.id.navigation_notifications:

                   // recyclerView =(RecyclerView)findViewById(R.id.recycler);

                   // recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

                    ArrayList<Tour> tourse = new ArrayList<Tour>();

                    Tour ttt = new Tour();

                    ttt.setName("jbf");
                    ttt.setDesceiption("hijgb");

                    tourse.add(ttt);


                    tourRecyclerView = new TourRecyclerView(MainActivity.this, tourse);
                    //recyclerView.setAdapter(tourRecyclerView);

                    //inflating layouts
                    inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                    View view2 =inflater.inflate(R.layout.item_tile, null);

                    btn1 =(Button)view2.findViewById(R.id.button2);
                    image =(ImageView)view2.findViewById(R.id.imageView);
                    fram =(FrameLayout)findViewById(R.id.content);
                    fram.removeAllViews();
                    fram.addView(view2);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         context=this;

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);



}
}
