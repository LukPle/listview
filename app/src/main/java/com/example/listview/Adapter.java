package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

/**
 * The Adapter fits right between the ListView and the ArrayList.
 * It gets data from an Array and converts it to views which can be later placed in the ListView.
 *
 * Layout File for one view: list_movie.xml
 */
public class Adapter extends ArrayAdapter<Movie> {

    public Adapter(Context context, ArrayList<Movie> movieList) {

        super(context, 0, movieList);
    }

    /**
     * This method transforms the data from a movie to a view that becomes part of the ListView.
     * @param position is the position of the item in the Array.
     * @param convertView is a row from the list.
     * @param parent is a view that inhabits other views and gets used for creating the list.
     * @return convertView which is one completed view with information from the Array.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Movie movie = getItem(position);

        // Check if there is an existing view and if not, create a new one
        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_movie, parent, false);
        }

        ImageView image = convertView.findViewById(R.id.image);
        TextView name = convertView.findViewById(R.id.name);
        TextView release = convertView.findViewById(R.id.release);

        // The data from the ArrayList item gets converted into the view
        image.setImageResource(movie.getImage());
        name.setText(movie.getName());
        release.setText(movie.getRelease());

        return convertView;
    }
}
