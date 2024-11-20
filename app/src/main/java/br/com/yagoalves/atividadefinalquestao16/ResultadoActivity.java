package br.com.yagoalves.atividadefinalquestao16;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        double numero1 = getIntent().getDoubleExtra("numero1", 0.0);
        double numero2 = getIntent().getDoubleExtra("numero2", 0.0);
        String operacao = getIntent().getStringExtra("operacao");

        double resultado = 0.0;
        switch (operacao) {
            case "Adição":
                resultado = numero1 + numero2;
                break;
            case "Subtração":
                resultado = numero1 - numero2;
                break;
            case "Multiplicação":
                resultado = numero1 * numero2;
                break;
            case "Divisão":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    resultado = Double.NaN;
                }
                break;
        }

        TextView numero1TextView = findViewById(R.id.numero1TextView);
        TextView numero2TextView = findViewById(R.id.numero2TextView);
        TextView operacaoTextView = findViewById(R.id.operacaoTextView);
        TextView resultadoTextView = findViewById(R.id.resultadoTextView);

        numero1TextView.setText("Número 1: " + numero1);
        numero2TextView.setText("Número 2: " + numero2);
        operacaoTextView.setText("Operação: " + operacao);
        resultadoTextView.setText("Resultado: " + resultado);
    }
}