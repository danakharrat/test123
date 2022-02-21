package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ListAdapter;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity3 extends ListActivity {
    String[] items={"First Item","Second Item","Third Item","Fourth Item",
            "Go to Act1","Go to Act2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        setTitle("You are in Activity 3");



        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_3,R.id.scroll,items));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {

        super.onListItemClick(l, v, position, id);

        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alfaisal.edu")));
                break;
            case 1:
                startActivity(new Intent(Activity3.this, Image.class));;
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://amazon.com")));
                break;
            case 4:
                startActivity(new Intent(Activity3.this,MainActivity.class));
                break;
            case 5:
                startActivity(new Intent(Activity3.this,Activity2.class));
                break;
        }


    }
}