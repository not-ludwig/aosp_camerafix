package com.ATR.camerafix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.disclaimer_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemd:
                openInfoBox();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void openInfoBox() {
        infoBox disclaimer = new infoBox();
        disclaimer.show(getSupportFragmentManager(), "disclaimer dialog");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button action = findViewById(R.id.buttonAction);

        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ProcessBuilder pb = new ProcessBuilder();
                    pb.command("/sbin/su", "-c","pkill cameraserver");
                    Process p = pb.start();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        });

    }
}