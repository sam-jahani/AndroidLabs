package com.example.jaha0025.androidlabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StartActivity extends Activity {

    protected static final String ACTIVITY_NAME ="StartActivity";

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            Intent i = new Intent(StartActivity.this,ListItemsActivity.class);
            startActivityForResult(i,10 );


            }

        });




    }

//    public void StartActivityForResult(Intent intent,int requestCode){
//
//
//
//
//    }

    public void onActivityResult(int requestCode,int responseCode,Intent data){

        if(requestCode == 10){

            Log.i(ACTIVITY_NAME,"Returened to StartActivity.onActivityResult");

        }

        super.onActivityResult(requestCode, responseCode, data );

    }


    @Override
    protected void onResume(){
        super.onResume();
        Log.i(ACTIVITY_NAME,"In onResume");

    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.i(ACTIVITY_NAME,"In onStart");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(ACTIVITY_NAME,"In onPause");


    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(ACTIVITY_NAME,"In onStop");
    }

//    @Override
//    protected void onDestory(){
//        super.onDestroy();
//        Log.i(ACTIVITY_NAME,"In onDestroy");
//    }

}

