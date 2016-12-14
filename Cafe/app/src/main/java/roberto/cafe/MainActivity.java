package roberto.cafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private CheckBox crema, chocolate;
    private Button menos, mas, order;
    private TextView cantidad;
    private int cantidadEntero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.nombre);
        crema = (CheckBox) findViewById(R.id.crema);
        chocolate = (CheckBox) findViewById(R.id.chocolate);
        menos = (Button) findViewById(R.id.menos);
        mas = (Button) findViewById(R.id.mas);
        order = (Button) findViewById(R.id.order);
        cantidad = (TextView) findViewById(R.id.cantidad);

        menos.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                String valor1 = cantidad.getText().toString();
                cantidadEntero = Integer.parseInt(valor1);
                cantidadEntero--;
                cantidad.setText(String.valueOf(cantidadEntero));
                comprobarCantidad();
            }
        });

        mas.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                String valor1 = cantidad.getText().toString();
                cantidadEntero = Integer.parseInt(valor1);
                cantidadEntero++;
                cantidad.setText(String.valueOf(cantidadEntero));
                comprobarCantidad();
            }
        });

        order.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                float precioUnidad = 1;
                String nombreUsuario = nombre.getText().toString();

                String valor1 = cantidad.getText().toString();
                cantidadEntero = Integer.parseInt(valor1);

                if (crema.isChecked())
                    precioUnidad += 0.5;
                if (chocolate.isChecked())
                    precioUnidad += 0.5;

                float precioTotal = precioUnidad * cantidadEntero;

                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Nombre: " + nombreUsuario + "\nAñadir Crema: " + crema.isChecked() + "\nAñadir Chocolate: " + chocolate.isChecked() + "\nCantidad: " + cantidadEntero + "\nPrecio Total: " + precioTotal + "€\nGracias!", Toast.LENGTH_SHORT);

                toast1.show();

            }
        });

    }

    private void comprobarCantidad() {
        String valor1 = cantidad.getText().toString();
        cantidadEntero = Integer.parseInt(valor1);
        if (cantidadEntero == 0) {
            menos.setEnabled(false);
        } else {
            menos.setEnabled(true);
        }
    }
}
