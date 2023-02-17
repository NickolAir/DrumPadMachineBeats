package com.example.drumpadmachinebeats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    private SoundPool spool;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;
    private int sound9;
    private int sound10;
    private int sound11;
    private int sound12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        View overlay = findViewById(R.id.mylayout);
        overlay.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                |View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        spool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        sound1 = spool.load(getApplicationContext(), R.raw.sound1, 1);
        sound2 = spool.load(getApplicationContext(), R.raw.sound1, 1);
        sound3 = spool.load(getApplicationContext(), R.raw.sound1, 1);
        sound4 = spool.load(getApplicationContext(), R.raw.sound1, 1);
        sound5 = spool.load(getApplicationContext(), R.raw.sound1, 1);
        sound6 = spool.load(getApplicationContext(), R.raw.sound1, 1);
        sound7 = spool.load(getApplicationContext(), R.raw.sound1, 1);
        sound8 = spool.load(getApplicationContext(), R.raw.sound1, 1);
        sound9 = spool.load(getApplicationContext(), R.raw.sound1, 1);
        sound10 = spool.load(getApplicationContext(), R.raw.sound1, 1);
        sound11 = spool.load(getApplicationContext(), R.raw.sound1, 1);
        sound12 = spool.load(getApplicationContext(), R.raw.sound1, 1);
    }

    public void playsample1 (View v){
        spool.play(sound, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsample2 (View v){
        spool.play(sound, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsample3 (View v){
        spool.play(sound, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsample4 (View v){
        spool.play(sound, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsample5 (View v){
        spool.play(sound, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsample6 (View v){
        spool.play(sound, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsample7 (View v){
        spool.play(sound, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsample8 (View v){
        spool.play(sound, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsample9 (View v){
        spool.play(sound, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsample10 (View v){
        spool.play(sound, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsample11 (View v){
        spool.play(sound, 1.0f, 1.0f, 0, 0, 10f);
    }
    public void playsample12 (View v){
        spool.play(sound, 1.0f, 1.0f, 0, 0, 10f);
    }
}