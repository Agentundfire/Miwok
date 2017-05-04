package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

//Check NumbersActivity.java for more comments details.
public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("weṭeṭṭi", "red", R.raw.color_red, R.drawable.color_red));
        words.add(new Word("chokokki", "green", R.raw.color_green, R.drawable.color_green));
        words.add(new Word("ṭakaakki", "brown", R.raw.color_brown, R.drawable.color_brown));
        words.add(new Word("ṭopoppi", "gray", R.raw.color_gray, R.drawable.color_gray));
        words.add(new Word("kululli", "black", R.raw.color_black, R.drawable.color_black));
        words.add(new Word("kelelli", "white", R.raw.color_white, R.drawable.color_white));
        words.add(new Word("ṭopiisә", "dusty yellow", R.raw.color_dusty_yellow, R.drawable.color_dusty_yellow));
        words.add(new Word("chiwiiṭә", "mustard yellow", R.raw.color_mustard_yellow, R.drawable.color_mustard_yellow));

        WordAdapter wordAdapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });

    }
}