package pl.ozodbek.for_examples;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import pl.ozodbek.for_examples.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.rates_language, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.first:
                Intent intent1 = new Intent(getApplicationContext(), MainActivitySpectrum.class);
                startActivity(intent1);
                return true;

            case R.id.second:
                Intent intent2 = new Intent(getApplicationContext(), MainActivityJobs.class);
                startActivity(intent2);
                return true;

            case R.id.third:
                Intent intent3 = new Intent(getApplicationContext(), MainActivitytrending.class);
                startActivity(intent3);
                return true;
        }
        return true;
    }

    public void clickView(View view) {
        view.setOnClickListener(v -> {
            Toast.makeText(this, "Please choose under !!", Toast.LENGTH_SHORT).show();
        });
    }

    @SuppressLint("NonConstantResourceId")
    public void Clickable(View view) {

        switch (view.getId()) {
            case R.id.python:
                getDataMethod(0);
                break;
            case R.id.java:
                getDataMethod(1);
                break;
            case R.id.javaScript:
                getDataMethod(2);
                break;
            case R.id.cplus:
                getDataMethod(3);
                break;
            case R.id.csharp:
                getDataMethod(4);
                break;
            case R.id.c:
                getDataMethod(5);
                break;
            case R.id.typescript:
                getDataMethod(6);
                break;
            case R.id.php:
                getDataMethod(7);
                break;
            case R.id.sql:
                getDataMethod(8);
                break;
            case R.id.go:
                getDataMethod(9);
                break;
            case R.id.kotlin:
                getDataMethod(10);
                break;
            case R.id.rust:
                getDataMethod(11);
                break;
            case R.id.dart:
                getDataMethod(12);
                break;
            case R.id.swift:
                getDataMethod(13);
                break;
        }
    }

    public void getDataMethod(int id) {
        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("importedDATA", id);
        startActivity(intent);
    }

}