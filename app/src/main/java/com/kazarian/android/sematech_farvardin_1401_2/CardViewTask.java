package com.kazarian.android.sematech_farvardin_1401_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CardViewTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_task);

        Button showMonth = findViewById(R.id.btn_ShowMonth);
        TextView monthName = findViewById(R.id.second_Quarter_txtv);

        showMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                monthName.setText("Spring Month");
                Toast.makeText(CardViewTask.this, "Spring month!", Toast.LENGTH_LONG).show();
            }
        });
    }
}