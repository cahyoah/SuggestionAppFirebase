package salatiga.pln.forum.adviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import salatiga.pln.forum.adviceapp.ui.SuggestionActivity;

public class activity_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        Button button1 = (Button) findViewById(R.id.btn_profileperusahaan);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), activity_profileperusahaan.class);

                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.btn_kotaksaran);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SuggestionActivity.class);

                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.btn_pegawai);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), activity_susunanpegawai.class);

                startActivity(intent);
            }
        });
    }
}
