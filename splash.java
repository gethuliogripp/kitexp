package com.kitexp.kitexp;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        Thread background = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                    Intent i=new Intent(getBaseContext(),navigation.class);
                    startActivity(i);
                    finish();
                } catch (Exception e){
                }
            }
        };
        background.start();
    }

    @Override
    protected void onDestroy(){

        super.onDestroy();
    }
}
