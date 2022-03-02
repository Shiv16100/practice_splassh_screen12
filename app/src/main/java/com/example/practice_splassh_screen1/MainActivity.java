package com.example.practice_splassh_screen1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Animation name1,name2;
    ImageView img;

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        img=findViewById(R.id.image1);
        text=findViewById(R.id.textView);

        name1= AnimationUtils.loadAnimation(this,R.anim.top);
        name2=AnimationUtils.loadAnimation(this,R.anim.bottom);

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        img.setAnimation(name1);
        img.setAnimation(name2);

    }
}