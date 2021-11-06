package com.example.lec09_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= findViewById(R.id.button);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CallingIntent();
//            }
//        });
//

    }
    public void CallingIntent() {

        Uri uri = Uri.parse("tel:+923001234567");

        Intent intent = new Intent(Intent.ACTION_DIAL, uri);

        startActivity(intent);

    }
    public void onClick(View view){
        Intent intent;

            switch (view.getId()) {

                case
                        R.id.button:

                    intent = new
                            Intent(MainActivity.this,
                            MainActivity2.class);

                    startActivity(intent);

                    break;

                case R.id.button2:

                    Uri uri =
                            Uri.parse("tel:+923001234567");

                    intent = new
                            Intent(Intent.ACTION_DIAL, uri);

                    startActivity(intent);

                    break;


            }

    }
}