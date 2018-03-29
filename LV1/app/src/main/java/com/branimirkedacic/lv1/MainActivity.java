package com.branimirkedacic.lv1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import static android.widget.Toast.makeText;


public class MainActivity extends AppCompatActivity {

    private ImageView ElonSlika;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ElonSlika= (ImageView) findViewById(R.id.iv_elon);

       ElonSlika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeText(MainActivity.this, R.string.ElonQuote, Toast.LENGTH_LONG).show();            }
        });
    }
}
