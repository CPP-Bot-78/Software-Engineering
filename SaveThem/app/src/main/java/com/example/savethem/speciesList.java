package com.example.savethem;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.*;

public class speciesList extends ArrayAdapter<species> {
    private List<species> listOfSpecies;
    public speciesList(Context context, List<species> listOfSpecies) {
        super(context, 0, listOfSpecies);
        this.listOfSpecies = listOfSpecies;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_encuclopedia_items, parent, false);
        }

        species Species = listOfSpecies.get(position);

        // Bind the data to the views in the item layout
        // For example, TextView textView = convertView.findViewById(R.id.textView);
        // textView.setText(myClass.getName());

        return convertView;
    }
    public void addListEntities(species x)
    {
        listOfSpecies.add(x);
    }
    public void searchCheck()
    {

    }
    public void filterCheck()
    {

    }
    public void filterList()
    {

    }
    public void removeFilter()
    {

    }
    public void searchedList()
    {

    }
    public void addEntry()
    {

    }
    public void addEntryDetails()
    {

    }
    public void show()
    {

    }
}

