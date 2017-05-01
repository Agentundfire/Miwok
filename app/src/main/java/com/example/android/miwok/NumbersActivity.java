package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //create list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("lutti","one"));
        words.add(new Word("lutti","two"));
        words.add(new Word("lutti","three"));
        words.add(new Word("lutti","four"));
        words.add(new Word("lutti","five"));
        words.add(new Word("lutti","six"));
        words.add(new Word("lutti","seven"));
        words.add(new Word("lutti","eight"));
        words.add(new Word("lutti","nine"));
        words.add(new Word("lutti","ten"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Word.java. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list.xml layout resource defined in the layout folder.
        // This list item layout contains a single {@link ImageView} and two (@link TextView), which the adapter will set to
        // display the set information.
        WordAdapter wordAdapter = new WordAdapter(this,words);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list_view_numbers);
        listView.setAdapter(wordAdapter);

    }
}
