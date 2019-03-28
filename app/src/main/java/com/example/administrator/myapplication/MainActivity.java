package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("TGA","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TGA","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TGA","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TGA","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TGA","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TGA","Destroy");
    }
}
