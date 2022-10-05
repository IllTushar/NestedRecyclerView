package com.example.nestedrecview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
 RecyclerView recyclerView;
 ArrayList<ParentModelClass>parentModelClassArrayList;
 ArrayList<childModelClass>childModelClasses;
 ArrayList<childModelClass>favouiteList;
 ArrayList<childModelClass>watchList;
 ArrayList<childModelClass>reelList;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        recyclerView = findViewById(R.id.parent_rec_view);
        childModelClasses = new ArrayList<>();
        favouiteList = new ArrayList<>();
        watchList = new ArrayList<>();
        reelList = new ArrayList<>();
        parentModelClassArrayList = new ArrayList<>();


        parentModelClassArrayList.add(new ParentModelClass("Favorite List",favouiteList));
        favouiteList.add(new childModelClass(R.drawable.ic_launcher_background));
        favouiteList.add(new childModelClass(R.drawable.ic_launcher_background));
        favouiteList.add(new childModelClass(R.drawable.ic_launcher_background));
        favouiteList.add(new childModelClass(R.drawable.ic_launcher_background));
        favouiteList.add(new childModelClass(R.drawable.ic_launcher_background));
        favouiteList.add(new childModelClass(R.drawable.ic_launcher_background));


        parentModelClassArrayList.add(new ParentModelClass("Watch List",watchList));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));



        parentModelClassArrayList.add(new ParentModelClass("Reel List",reelList));
        reelList.add(new childModelClass(R.drawable.ic_launcher_background));
        reelList.add(new childModelClass(R.drawable.ic_launcher_background));
        reelList.add(new childModelClass(R.drawable.ic_launcher_background));
        reelList.add(new childModelClass(R.drawable.ic_launcher_background));
        reelList.add(new childModelClass(R.drawable.ic_launcher_background));


        parentModelClassArrayList.add(new ParentModelClass("Reel List",reelList));
        reelList.add(new childModelClass(R.drawable.ic_launcher_background));
        reelList.add(new childModelClass(R.drawable.ic_launcher_background));
        reelList.add(new childModelClass(R.drawable.ic_launcher_background));
        reelList.add(new childModelClass(R.drawable.ic_launcher_background));
        reelList.add(new childModelClass(R.drawable.ic_launcher_background));




        parentModelClassArrayList.add(new ParentModelClass("Watch List",watchList));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));




        parentModelClassArrayList.add(new ParentModelClass("Watch List",watchList));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));
        watchList.add(new childModelClass(R.drawable.ic_launcher_background));


        ParentAdapter parentAdapter = new ParentAdapter(MainActivity.this,parentModelClassArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(parentAdapter);

    }
}