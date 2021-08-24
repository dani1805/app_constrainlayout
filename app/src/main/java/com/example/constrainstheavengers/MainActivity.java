package com.example.constrainstheavengers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    int rentCount = 0;
    int buyCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton share = findViewById(R.id.share);
        FloatingActionButton next = findViewById(R.id.next);
        FloatingActionButton play = findViewById(R.id.play);
        Button rent = findViewById(R.id.rent);
        Button buy = findViewById(R.id.buy);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Uri uri = Uri.parse("https://twitter.com/avengers?lang=es");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                } catch (Exception e) {
                    Uri uri = Uri.parse("https://twitter.com/theavengers");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, myCounts.class);
                intent.putExtra("rent",rentCount);
                intent.putExtra("buy", buyCount);
                startActivity(intent);

            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, webView.class);
                startActivity(intent);
            }
        });

        rent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rentCount +=1;
                Toast toast = Toast.makeText(MainActivity.this, "Se ha producido el alquiler de la película", Toast.LENGTH_SHORT);
                toast.show();

            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyCount +=1;
                Toast toast = Toast.makeText(MainActivity.this, "Se ha producido la compra de la película", Toast.LENGTH_SHORT);
                toast.show();

            }
        });


        








    }
}