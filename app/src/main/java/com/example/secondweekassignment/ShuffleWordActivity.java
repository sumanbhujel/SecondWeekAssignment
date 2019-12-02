package com.example.secondweekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleWordActivity extends AppCompatActivity {

    String[] words = {"apple", "orange", "grapes"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shuffle_word);

        listView = findViewById(R.id.wordList);
        int i = 0;
        Character[] word = shuffleWord(words[i]);
        ArrayAdapter<Character> adapter = new ArrayAdapter<Character>(ShuffleWordActivity.this,
                R.layout.spinner_values,word);
        listView.setAdapter(adapter);

        //Toast.makeText(this, shuffleWord(), Toast.LENGTH_SHORT).show();

    }

    private Character[] shuffleWord(String word) {
        ArrayList<Character> chars = new ArrayList<>(word.length());
        for (char c : word.toCharArray()) {
            chars.add(c);

        }
        Collections.shuffle(chars);
        Character[] shuffeled = new Character[chars.size()];
        for (int i = 0; i < shuffeled.length; i++) {
            shuffeled[i] = chars.get(i);
        }

        //char[] shuffeledword = new char[0];
        return shuffeled;

    }
}
