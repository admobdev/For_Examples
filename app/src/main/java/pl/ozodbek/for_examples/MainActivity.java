package pl.ozodbek.for_examples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.View;
import android.view.animation.AnimationUtils;

import pl.ozodbek.for_examples.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{

    private ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.animation2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_right));
        binding.animation3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_left));
        binding.animation1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_bottom));
        binding.mainicon.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_mainicon));




        CountDownTimer timer = new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                startActivity(new Intent(getApplicationContext(), MainActivity2.class));
                finish();
            }
        }.start();
    }


}