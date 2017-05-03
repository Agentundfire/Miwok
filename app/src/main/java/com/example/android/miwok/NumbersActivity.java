package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("lutti","one",R.drawable.number_one));
        words.add(new Word("otiiko","two",R.drawable.number_two));
        words.add(new Word("tolookosu","three",R.drawable.number_three));
        words.add(new Word("oyyisa","four",R.drawable.number_four));
        words.add(new Word("massokka","five",R.drawable.number_five));
        words.add(new Word("temmokka","six",R.drawable.number_six));
        words.add(new Word("kenekaku","seven",R.drawable.number_seven));
        words.add(new Word("kawinta","eight",R.drawable.number_eight));
        words.add(new Word("wo'e","nine",R.drawable.number_nine));
        words.add(new Word("na'aacha","ten",R.drawable.number_ten));

        // Create an {@link ArrayAdapter}, whose data source is a list of Word.java. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list.xml layout resource defined in the layout folder.
        // This list item layout contains a single {@link ImageView} and two (@link TextView), which the adapter will set to
        // display the set information.
        WordAdapter wordAdapter = new WordAdapter(this,words,R.color.category_numbers);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(wordAdapter);

    }
}
