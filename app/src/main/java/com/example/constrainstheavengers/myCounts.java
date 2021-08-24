package com.example.constrainstheavengers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.w3c.dom.Text;

public class myCounts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_counts);

        FloatingActionButton back = findViewById(R.id.back);
        TextView rentCountTv = findViewById(R.id.rentCountTv);
        TextView buyCountTv = findViewById(R.id.buyCountTv);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(myCounts.this, MainActivity.class);
                startActivity(intent);

            }
        });

        Bundle bundle = getIntent().getExtras();
        int rentCount = bundle.getInt("rent");
        int buyCount = bundle.getInt("buy");

        rentCountTv.setText(String.valueOf("Películas alquiladas " + rentCount));
        buyCountTv.setText(String.valueOf("Películas compradas " + buyCount));







    }
}