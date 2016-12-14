package roberto.merienda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView foto;
    private TextView texto;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foto = (ImageView) findViewById(R.id.fondo);
        texto = (TextView) findViewById(R.id.texto);
        boton = (Button) findViewById(R.id.boton);

        boton.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                texto.setText(R.string.after);
                foto.setImageResource(R.drawable.after_cookie);
            }
        });
    }
}
