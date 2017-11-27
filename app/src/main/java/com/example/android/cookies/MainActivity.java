package com.example.android.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void changeThePictureAndText(View view){
        TextView tv = (TextView) findViewById(R.id.status_text_view);
        tv.setText("I'm so full");
        ImageView iv = (ImageView)findViewById(R.id.android_cookie_image_view);
        iv.setImageResource(R.drawable.after_cookie);
    }


}
