package rao.rohi.rohitaskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //start next activity screen automatically after period of time
        Handler h = new Handler();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splashScreen.this,signIn.class);
                startActivity(i);                   //to start the i wich is going from splash activity to signIn
                finish();                          //to close the current activity
            }
        };
        h.postDelayed(r,3000);            //delay the r 3 seconds
    }

}
