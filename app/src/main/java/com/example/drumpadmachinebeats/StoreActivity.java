package com.example.drumpadmachinebeats;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class StoreActivity extends AppCompatActivity {

    List<Presset> lstPresset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.store_activity);

        View overlay = findViewById(R.id.store_layout);
        overlay.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        |View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        |View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        lstPresset = new ArrayList<>();
        lstPresset.add(new Presset("Modern Hip Hop", R.drawable.modernpresset));
        lstPresset.add(new Presset("Welcome to 80's", R.drawable.classicrock));
        lstPresset.add(new Presset("Darkness", R.drawable.darkness));
        lstPresset.add(new Presset("Classic Hip Hop", R.drawable.classichiphop));
        lstPresset.add(new Presset("Lo-Fi", R.drawable.lofi));
        lstPresset.add(new Presset("Modern lead", R.drawable.modernlead));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstPresset);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}