package pl.tracz.tymoteusz.onlytech;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

/**
 * Created by tymoteusz.tracz on 20.07.2016.
 */
@SuppressLint("NewApi")
public class splashScreen extends Activity {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Thread t =new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent i =new Intent(splashScreen.this,homePage.class);
                    startActivity(i);
                }
            }
        };
        t.start();
    }
    @Override
    public void onPause(){
        super.onPause();
        finish();
    }

}

