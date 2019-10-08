package br.com.ciclodevidaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(MainActivity.class.toString(), "onCreate");
        Toast.makeText(this, "on create", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(MainActivity.class.toString(), "onStop");
        Toast.makeText(this, "on start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(MainActivity.class.toString(), "onResume");
        Toast.makeText(this, "on resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MainActivity.class.toString(), "onPause");
        Toast.makeText(this, "on pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(MainActivity.class.toString(), "onStop");
        Toast.makeText(this, "on stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(MainActivity.class.toString(), "onDestroy");
        Toast.makeText(this, "on destroy", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(MainActivity.class.toString(), "onRestart");
        Toast.makeText(this, "on Restart", Toast.LENGTH_LONG).show();
    }
}
