package salatiga.pln.forum.adviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_profileperusahaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profileperusahaan);


        Button button4 = (Button) findViewById(R.id.btn_gambaranumum);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), activity_gambaranumum.class);

                startActivity(intent);
            }
        });

        Button button5 = (Button) findViewById(R.id.btn_sejarahsikt);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), activity_sejarahsingkat.class);

                startActivity(intent);
            }
        });

        Button button6 = (Button) findViewById(R.id.btn_visimisi);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), activity_visimisi.class);

                startActivity(intent);
            }
        });
    }
}
