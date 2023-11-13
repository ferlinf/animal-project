package com.example.projectanimals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private MyFragmentAdapter adapter;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textView = findViewById(R.id.nama);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");
        textView.setText("halo " + message);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.viewPager2);

        tabLayout.addTab(tabLayout.newTab().setText("Hewan Darat"));
        tabLayout.addTab(tabLayout.newTab().setText("Hewan Laut"));

        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new MyFragmentAdapter(fragmentManager, getLifecycle());
        viewPager2.setAdapter(adapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());}

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }
}
