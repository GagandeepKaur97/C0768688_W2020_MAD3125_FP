package com.gagan.c0768688_w2020_mad3125_fp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.gagan.c0768688_w2020_mad3125_fp.R;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN = 5000;
    //variables
    Animation topanim,bottomanim;
    ImageView image;
    TextView Name,Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        //animations
        topanim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomanim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        //hooks
        image = findViewById(R.id.imageView2);
        Name = findViewById(R.id.textView2);
        Id = findViewById(R.id.textView3);


        image.setAnimation(topanim);
        Name.setAnimation(bottomanim);
        Id.setAnimation(bottomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, login_screen.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}
