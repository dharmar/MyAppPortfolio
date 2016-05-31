package com.vcs.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.view.Gravity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //called when user clicks the button POPULAR MOVIES
    public void popularMovies(View view) {
        Toast toast;
        toast = Toast.makeText(getApplicationContext(), "This button will launch Popular Movies App", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 5, 5);
        toast.show();
    }

    //called when user clicks the button STOCK HAWK
    public void stockHawk(View view) {
        Toast toast;
        toast = Toast.makeText(getApplicationContext(), "This button will launch Stock Hawk App", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 5, 5);
        toast.show();
    }

    //called when user clicks the button BUILD IT BIGGER
    public void buildItBigger(View view) {
        Toast toast;
        toast = Toast.makeText(getApplicationContext(), "This button will launch Build it Bigger App", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 5, 5);
        toast.show();
    }

    //called when user clicks the button MAKE YOUR APP MATERIAL
    public void makeYourAppMaterial(View view) {
        Toast toast;
        toast = Toast.makeText(getApplicationContext(), "This button will launch Make Your App Material App", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 5, 5);
        toast.show();
    }

    //called when user clicks the button GO UBIQUITOUS
    public void goUbiquitous(View view) {
        Toast toast;
        toast = Toast.makeText(getApplicationContext(), "This button will launch Go Ubiquitous App", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 5, 5);
        toast.show();
    }

    //called when user clicks the button CAPSTONE
    public void capstone(View view) {
        Toast toast;
        toast = Toast.makeText(getApplicationContext(), "This button will launch Capstone App", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 5, 5);
        toast.show();
    }
}
