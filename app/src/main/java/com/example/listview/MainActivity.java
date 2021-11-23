package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * This Activity creates a list of movies using ListView.
 * This is an easy to use class that displays a list by setting different views right below each other.
 *
 * Layout File: activity_main.xml
 *
 * @author Lukas Plenk
 */
public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Movie> movieList;

    /**
     * The method initializes a new ArrayList of movies.
     * An Adapter populates the ListView with the entries from the ArrayList.
     * @param savedInstanceState is a standard parameter.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieList = new ArrayList<>();
        fillMovieList();

        listView = findViewById(R.id.list_view);

        final Adapter adapter = new Adapter(this, movieList);
        listView.setAdapter(adapter);
    }

    private void fillMovieList() {

        movieList.add(new Movie(R.drawable.ic_fastfood, "Pulp Fiction", "1994"));
        movieList.add(new Movie(R.drawable.ic_face, "Scarface", "1983"));
        movieList.add(new Movie(R.drawable.ic_sun, "Dune", "2021"));
        movieList.add(new Movie(R.drawable.ic_school, "High School Musical", "2006"));
        movieList.add(new Movie(R.drawable.ic_money, "The Wolf of Wall Street", "2013"));
        movieList.add(new Movie(R.drawable.ic_mountain, "Free Solo", "2018"));
        movieList.add(new Movie(R.drawable.ic_music, "La La Land", "2016"));
        movieList.add(new Movie(R.drawable.ic_android, "Alien", "1979"));
        movieList.add(new Movie(R.drawable.ic_bike, "Call Me by Your Name", "2017"));
        movieList.add(new Movie(R.drawable.ic_car, "Baby Driver", "2017"));
        movieList.add(new Movie(R.drawable.ic_child, "Children of Men", "2006"));
    }
}