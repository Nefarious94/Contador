package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private static int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button auto = (Button) findViewById(R.id.auto);
        Button reset = (Button) findViewById(R.id.reset);
        final TextView contador = (TextView) findViewById(R.id.contador);


        auto.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                count++;
                contador.setText(Integer.toString(count));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                count = 0;
                contador.setText("0");
            }
        });

    }
}
