package com.learn.dreampad.dreampad.Eyetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.learn.dreampad.dreampad.R;
import com.learn.dreampad.dreampad.screenTestHome.screenTestHome;

import java.util.Random;

public class EyeTest extends AppCompatActivity {
    ImageView closeClick, Image1,Image2,Image3,Image4;
    TextView CountDisplay;
    int count = 0;
    //Styling for double press back button
    private static long back_pressed;
    private int[] textureArrayWin = {
            R.drawable.back,
            R.drawable.email,
            R.drawable.close,
            R.drawable.info,
            R.drawable.password,

    };
    @Override
    public void onBackPressed() {
        if (back_pressed + 2000 > System.currentTimeMillis()) {
            //super.onBackPressed();
            finishAffinity();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
            back_pressed = System.currentTimeMillis();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_test);

        closeClick = (ImageView)findViewById(R.id.close);
        Image1 = (ImageView)findViewById(R.id.image1);
        Image2 = (ImageView)findViewById(R.id.image2);
        Image3 = (ImageView)findViewById(R.id.image3);
        Image4 = (ImageView)findViewById(R.id.image4);
        CountDisplay = (TextView)findViewById(R.id.ImageClickcount);

        // close button press
        closeClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EyeTest.this,EyeTestSelection.class);
                startActivity(intent);
                finish();



            }
        });
        // image1  button press
        Image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count+1;
                String countDisp = "Count : "+count;
                CountDisplay.setText(countDisp);
                Image1.setImageResource(getRandom(textureArrayWin));
                Image2.setImageResource(getRandom(textureArrayWin));
                Image3.setImageResource(getRandom(textureArrayWin));
                Image4.setImageResource(getRandom(textureArrayWin));


            }
        });
        // image2  button press
        Image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count+1;
                String countDisp = "Count : "+count;
                CountDisplay.setText(countDisp);
                Image1.setImageResource(getRandom(textureArrayWin));
                Image2.setImageResource(getRandom(textureArrayWin));
                Image3.setImageResource(getRandom(textureArrayWin));
                Image4.setImageResource(getRandom(textureArrayWin));

            }
        });
        // image3  button press
        Image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count+1;
                String countDisp = "Count : "+count;
                CountDisplay.setText(countDisp);
                Image1.setImageResource(getRandom(textureArrayWin));
                Image2.setImageResource(getRandom(textureArrayWin));
                Image3.setImageResource(getRandom(textureArrayWin));
                Image4.setImageResource(getRandom(textureArrayWin));

            }
        });
        // image4  button press
        Image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count+1;
                String countDisp = "Count : "+count;
                CountDisplay.setText(countDisp);
                Image1.setImageResource(getRandom(textureArrayWin));
                Image2.setImageResource(getRandom(textureArrayWin));
                Image3.setImageResource(getRandom(textureArrayWin));
                Image4.setImageResource(getRandom(textureArrayWin));

            }
        });
    }
    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
