package com.example.jaha0025.androidlabs;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;


public class ListItemsActivity extends Activity {
    protected static final String ACTIVITY_NAME ="ListItemsActivity";
    static final int REQUEST_IMAGE_CAPTURE = 1;

    ImageButton photo;
    Switch switch101;
    CheckBox checkBox101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_items);
        Log.i(ACTIVITY_NAME,"In onCreate");

        photo = (ImageButton) findViewById(R.id.photo);
        switch101 =(Switch) findViewById(R.id.switch100);
        checkBox101 =(CheckBox) findViewById(R.id.checkBox);

        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            dispatchTakePictureIntent();

            }
        });


        switch101.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b == true){


                    setOnCheckChangedTrue();
                }
                else{

                    setOnCheckChangedFalse();

                }


            }
        });




    }





    public void setOnCheckChangedTrue(){

        Toast.makeText(this,"Switch is on!!!", Toast.LENGTH_LONG).show();

    }

    public void setOnCheckChangedFalse(){


        Toast.makeText(this,"Switch is OFF!!!", Toast.LENGTH_LONG).show();



    }





    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            photo.setImageBitmap(imageBitmap);
        }
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


    @Override
    protected void onDestroy(){

        super.onDestroy();
        Log.i(ACTIVITY_NAME,"In onDestroy");

    }

}
