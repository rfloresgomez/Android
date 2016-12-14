package roberto.sumar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int entero1;
    private int entero2;
    private Button botonSumar;
    private EditText numero1, numero2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonSumar = (Button) findViewById(R.id.sumar);
        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);
        resultado = (TextView) findViewById(R.id.resultado);

        botonSumar.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                String valor1 = numero1.getText().toString();
                String valor2 = numero2.getText().toString();
                entero1 = Integer.parseInt(valor1);
                entero2 = Integer.parseInt(valor2);
                int resultadoSuma = entero1+entero2;
                resultado.setText(String.valueOf(resultadoSuma));
            }
        });
    }
}
