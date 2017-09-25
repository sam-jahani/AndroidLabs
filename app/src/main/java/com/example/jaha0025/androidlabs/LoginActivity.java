package com.example.jaha0025.androidlabs;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class LoginActivity extends Activity {

    EditText userNameInput;
    EditText passwordInput;
//    TextView display;
    protected static final String ACTIVITY_NAME ="LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        userNameInput = findViewById(R.id.userNameInput);
        passwordInput = findViewById(R.id.passwordInput);
//        display = (TextView) findViewById(R.id.display);


        displayData();








    }//onCreate()

        //save info to shared preferences

        public void saveInfo(View view){

        SharedPreferences sharedpref = getSharedPreferences("LoginInfo1",Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedpref.edit();
            editor.putString("userName",userNameInput.getText().toString());
            editor.putString("password",passwordInput.getText().toString());
            editor.apply();

            Toast.makeText(this, "Saved!!",Toast.LENGTH_LONG).show();


            Intent intent = new Intent(LoginActivity.this, StartActivity.class);
            startActivity(intent);


        }


        //Print off saved data
        public void displayData(){

            SharedPreferences sharedpref = getSharedPreferences("LoginInfo1",Context.MODE_PRIVATE);

            String showUser1;
            String showUser2;
            showUser1 = sharedpref.getString("userName", "");
            showUser2 = sharedpref.getString("password","");

//            display.setText(showUser1 + "  " + showUser2);
            userNameInput.setText(showUser1);
            passwordInput.setText(showUser2);

        }












    @Override
    protected void onResume(){
        super.onResume();
        Log.i(ACTIVITY_NAME ," In onResume");

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(ACTIVITY_NAME,"In onStart");
    }



    @Override
    protected void onPause(){
        super.onPause();
        Log.i(ACTIVITY_NAME,"in onPause");

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(ACTIVITY_NAME,"in onStop");


    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(ACTIVITY_NAME,"onDestroy");

    }

}
