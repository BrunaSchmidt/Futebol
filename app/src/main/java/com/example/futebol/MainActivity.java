package com.example.futebol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoSortear;
    private TextView textoNome;
    private TextView textoIdade;
    private TextView textoTime;

    private String[] nomeArray = {
            "Ana",
            "Carlos",
            "Ubervaldo"
    };

    private String[] idadeArray = {
            "15",
            "18",
            "17"
    };

    private String[] timeArray = {
            "Grêmio",
            "Internacional",
            "São Paulo"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoSortear = (Button) findViewById(R.id.idBotSortear);
        textoNome = (TextView) findViewById(R.id.idTextoNome);
        textoIdade = (TextView) findViewById(R.id.idTextoIdade);
        textoTime = (TextView) findViewById(R.id.idTextoTime);



        botaoSortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(nomeArray.length);
                textoNome.setText(nomeArray[numeroAleatorio]);

                Random randomico2 = new Random();
                int numeroAleatorio2 = randomico2.nextInt(idadeArray.length);
                textoIdade.setText(idadeArray[numeroAleatorio2]);

                Random randomico3 = new Random();
                int numeroAleatorio3 = randomico3.nextInt(timeArray.length);
                textoTime.setText(timeArray[numeroAleatorio3]);


            }
        });

    }


}
