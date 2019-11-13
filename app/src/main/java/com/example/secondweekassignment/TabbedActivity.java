package com.example.secondweekassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.secondweekassignment.adapter.MyvpAdapter;
import com.example.secondweekassignment.fragments.ExampleFragment;
import com.example.secondweekassignment.fragments.SecondFragment;
import com.google.android.material.tabs.TabLayout;

public class TabbedActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed);

        tabLayout = findViewById(R.id.myTab);
        viewPager = findViewById(R.id.myvPager);

        FragmentManager fm = getSupportFragmentManager();
        MyvpAdapter adapter = new MyvpAdapter(fm);

        adapter.addFragments(new ExampleFragment(), "First");
        adapter.addFragments(new SecondFragment(), "Second");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);



    }
}
