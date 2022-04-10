package com.kazarian.android.sematech_farvardin_1401_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button save_btn = findViewById(R.id.btn_save);
        TextView tina_txt = findViewById(R.id.txt_tina);
        TextView htmltxt = findViewById(R.id.txt_second);

        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tina_txt.setText("Hello Edna!");
                Toast.makeText(MainActivity.this, "Saved!", Toast.LENGTH_LONG).show();
            }
        });

        htmltxt.setText(HtmlCompat.fromHtml("<h2> title </h2><br><p> paragraf1 </p>", HtmlCompat.FROM_HTML_MODE_COMPACT));

    }
}