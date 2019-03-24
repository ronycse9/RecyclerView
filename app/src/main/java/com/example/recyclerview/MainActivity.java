package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "OnCreate : started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps:preparing bitmaps.");

        mImageUrls.add("https://pbs.twimg.com/profile_images/839534574753337344/iglBg-Zc.jpg");
        mNames.add("Engr. Rony Debnath");

        mImageUrls.add("https://avatars1.githubusercontent.com/u/20667723?s=400&v=4");
        mNames.add("Jayanta Biswas");

        mImageUrls.add("https://pbs.twimg.com/profile_images/1044259131576578049/HzZbfdnq_400x400.jpg");
        mNames.add("Araf Karim");

        mImageUrls.add("https://maxsop.com/images/team/amor.jpg");
        mNames.add("Amor Chandra Das");

        mImageUrls.add("https://maxsop.com/images/team/sir.jpg");
        mNames.add("Rayms Raymon");

        mImageUrls.add("https://maxsop.com/images/team/akhtar.jpg");
        mNames.add("Md. Akhteruzzaman");

        mImageUrls.add("https://maxsop.com/images/team/rasel.jpg");
        mNames.add("Md Ashraful Islam");
        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG,"initRecyclerView: init recyclerview");
        RecyclerView recyclerview = findViewById(R.id.recyclerviewID);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames,mImageUrls,this);
        recyclerview.setAdapter(adapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
    }
}
