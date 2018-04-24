package com.atamin.tictactoe;

/**
 * Created by Aminat on 4/19/2018.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        context=this;

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent intent=new Intent(context, MainActivity.class);
                    startActivity(intent);
                    finish();

                }
            }
        };
        timer.start();
    }
    /**@Override
    protected void onPause(){
    super.onPause();
    finish();
    }**/

}

