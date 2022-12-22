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


        String str;
        str = getIntent().getStringExtra("name");
        switch (str) {
            case "kotlin":
                int id = getIntent().getIntExtra("id", 0);
                binding.programming.setText(titles[id]);
                binding.imageView.setImageResource(images[id]);
                break;

            case "java":
                int id1 = getIntent().getIntExtra("id", 1);
                binding.programming.setText(titles[id1]);
                binding.imageView.setImageResource(images[id1]);
                break;
            case "javascript":
                int id2 = getIntent().getIntExtra("id", 2);
                binding.programming.setText(titles[id2]);
                binding.imageView.setImageResource(images[id2]);
                break;
            case "rust":
                int id3 = getIntent().getIntExtra("id", 3);
                binding.programming.setText(titles[id3]);
                binding.imageView.setImageResource(images[id3]);
                break;
            case "python":
                int id4 = getIntent().getIntExtra("id", 4);
                binding.programming.setText(titles[id4]);
                binding.imageView.setImageResource(images[id4]);
                break;
            case "csharp":
                int id5 = getIntent().getIntExtra("id", 5);
                binding.programming.setText(titles[id5]);
                binding.imageView.setImageResource(images[id5]);
                break;
            case "php":
                int id6 = getIntent().getIntExtra("id", 6);
                binding.programming.setText(titles[id6]);
                binding.imageView.setImageResource(images[id6]);
                break;
            case "cplus":
                int id7 = getIntent().getIntExtra("id", 7);
                binding.programming.setText(titles[id7]);
                binding.imageView.setImageResource(images[id7]);
                break;
            case "c":
                int id8 = getIntent().getIntExtra("id", 8);
                binding.programming.setText(titles[id8]);
                binding.imageView.setImageResource(images[id8]);
                break;
            case "swift":
                int id9 = getIntent().getIntExtra("id", 9);
                binding.programming.setText(titles[id9]);
                binding.imageView.setImageResource(images[id9]);
                break;
            case "typescript":
                int id10 = getIntent().getIntExtra("id", 10);
                binding.programming.setText(titles[id10]);
                binding.imageView.setImageResource(images[id10]);
                break;
            case "go":
                int id11 = getIntent().getIntExtra("id", 11);
                binding.programming.setText(titles[id11]);
                binding.imageView.setImageResource(images[id11]);
                break;

            case "sql":
                int id12 = getIntent().getIntExtra("id", 12);
                binding.programming.setText(titles[id12]);
                binding.imageView.setImageResource(images[id12]);
                break;

            case "dart":
                int id13 = getIntent().getIntExtra("id", 13);
                binding.programming.setText(titles[id13]);
                binding.imageView.setImageResource(images[id13]);
                break;

        }

    }


}