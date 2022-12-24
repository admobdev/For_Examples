package pl.ozodbek.for_examples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import pl.ozodbek.for_examples.databinding.ActivityMain3Binding;
import pl.ozodbek.for_examples.databinding.ActivityMainBinding;

public class MainActivity3 extends AppCompatActivity {

    private ActivityMain3Binding binding;
    private int[] images = DataBase.images;
    private int[] titles = DataBase.titles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        int receivedImportedDATA = getIntent().getIntExtra("importedDATA",0);
        binding.imageVIEWER.setImageResource(images[receivedImportedDATA]);
        binding.textVIEWER.setText(titles[receivedImportedDATA]);



    }


}