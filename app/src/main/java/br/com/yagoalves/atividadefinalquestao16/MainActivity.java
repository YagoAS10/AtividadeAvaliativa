package br.com.yagoalves.atividadefinalquestao16;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText numero1EditText = findViewById(R.id.numero1EditText);
        EditText numero2EditText = findViewById(R.id.numero2EditText);
        Spinner operacaoSpinner = findViewById(R.id.operacaoSpinner);
        Button calcularButton = findViewById(R.id.calcularButton);

        calcularButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1 = Double.parseDouble(numero1EditText.getText().toString());
                double numero2 = Double.parseDouble(numero2EditText.getText().toString());
                String operacao = operacaoSpinner.getSelectedItem().toString();

                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
                intent.putExtra("numero1", numero1);
                intent.putExtra("numero2", numero2);
                intent.putExtra("operacao", operacao);

                startActivity(intent);
            }
        });
    }
}