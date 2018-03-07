package salatiga.pln.forum.adviceapp.ui;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import salatiga.pln.forum.adviceapp.R;
import salatiga.pln.forum.adviceapp.activity_menu;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), activity_menu.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}
