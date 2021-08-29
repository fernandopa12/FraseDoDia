package com.example.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        String[] frases = {
                "“O Senhor dará força ao seu povo; o Senhor abençoará o seu povo com paz.”\n" +
                        "(Salmos 29:11)",
                "“Porventura não esquadrinhará Deus isso? Pois ele sabe os segredos do coração.”\n" +
                        "(Salmos 44:21)",
                "“Não te deixes vencer do mal, mas vence o mal com o bem.”\n" +
                        "(Romanos 12:21)",
                "“A graça de nosso Senhor Jesus Cristo seja com todos vós. Amém.”\n" +
                        "(Apocalipse 22:21)"
        };
        TextView texto = findViewById(R.id.textoGerado);
        texto.setText(frases[new Random().nextInt(4)]);
    }


}