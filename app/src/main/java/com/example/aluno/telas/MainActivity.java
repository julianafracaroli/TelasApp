package com.example.aluno.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button sobre;
    private Button tela1;
    private Button tela2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sobre = (Button) findViewById(R.id.buttonsobre);
        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Indo para outra tela!", Toast.LENGTH_SHORT).show();
                //comando para outra tela
                //o new intent precisa de dois parâmetros: a tela atual.this e a tela que será chamada
                startActivity(new Intent(MainActivity.this, SobreActivity.class));

            }
        });
        tela1 = (Button) findViewById(R.id.button1);
        tela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Indo para o LAboratório 1!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Lab1Activity.class));
            }
        });
        tela2 = (Button) findViewById(R.id.button2);
        tela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Indo para o laboratório 2!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Lab2Activity.class));
            }
        });


    }
}
