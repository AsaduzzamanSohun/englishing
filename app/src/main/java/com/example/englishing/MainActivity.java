package com.example.englishing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView, lottieAnimationView1;
    AppCompatButton startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lottieAnimationView = findViewById(R.id.animationView);
        lottieAnimationView1 = findViewById(R.id.animationView1);
        startBtn = findViewById(R.id.start_btn);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(@NonNull Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(@NonNull Animator animator) {
                        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                        startActivity(intent);

                        finish();
                    }

                    @Override
                    public void onAnimationCancel(@NonNull Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(@NonNull Animator animator) {

                    }
                });

                startBtn.setEnabled(false);

                lottieAnimationView.playAnimation();

            }
        });
    }
}