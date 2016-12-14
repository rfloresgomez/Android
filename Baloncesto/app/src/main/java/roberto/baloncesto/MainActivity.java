package roberto.baloncesto;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String nombre1, nombre2;
    private Button mas1Local, mas2Local, mas3Local, menos1Local, mas1Vis, mas2Vis, mas3Vis, menos1Vis, cambNomLocal, cambNomVis;
    private TextView local, visitante, puntosLocal, puntosVisitante;
    private EditText nomLocal, nomVisitante;
    private int puntLocal=0;
    private int puntVis=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mas1Local = (Button) findViewById(R.id.mas1Local);
        mas2Local = (Button) findViewById(R.id.mas2Local);
        mas3Local = (Button) findViewById(R.id.mas3Local);
        menos1Local = (Button) findViewById(R.id.menos1Local);
        menos1Local.setEnabled(false);
        mas1Vis = (Button) findViewById(R.id.mas1Visitante);
        mas2Vis = (Button) findViewById(R.id.mas2Visitante);
        mas3Vis = (Button) findViewById(R.id.mas3Visitante);
        menos1Vis = (Button) findViewById(R.id.menos1Visitante);
        menos1Vis.setEnabled(false);

        cambNomLocal = (Button) findViewById(R.id.botonNombreLocal);
        cambNomVis = (Button) findViewById(R.id.botonNombreVisitante);

        local = (TextView) findViewById(R.id.local);
        visitante = (TextView) findViewById(R.id.visitante);
        puntosLocal = (TextView) findViewById(R.id.puntosLocal);
        puntosVisitante = (TextView) findViewById(R.id.puntosVisitante);

        nomLocal = (EditText) findViewById(R.id.nombreLocal);
        nomVisitante = (EditText) findViewById(R.id.nombreVisitante);


        mas1Local.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                String valor1 = puntosLocal.getText().toString();
                puntLocal = Integer.parseInt(valor1);
                puntLocal+=1;
                puntosLocal.setText(String.valueOf(puntLocal));
                comprobarMarcadorLocal();
            }
        });

        mas2Local.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                String valor1 = puntosLocal.getText().toString();
                puntLocal = Integer.parseInt(valor1);
                puntLocal+=2;
                puntosLocal.setText(String.valueOf(puntLocal));
                comprobarMarcadorLocal();
            }
        });

        mas3Local.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                String valor1 = puntosLocal.getText().toString();
                puntLocal = Integer.parseInt(valor1);
                puntLocal+=3;
                puntosLocal.setText(String.valueOf(puntLocal));
                comprobarMarcadorLocal();
            }
        });

        menos1Local.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                String valor1 = puntosLocal.getText().toString();
                puntLocal = Integer.parseInt(valor1);
                puntLocal-=1;
                puntosLocal.setText(String.valueOf(puntLocal));
                comprobarMarcadorLocal();
            }
        });

        mas1Vis.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                String valor1 = puntosVisitante.getText().toString();
                puntVis = Integer.parseInt(valor1);
                puntVis+=1;
                puntosVisitante.setText(String.valueOf(puntVis));
                comprobarMarcadorVis();
            }
        });

        mas2Vis.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                String valor1 = puntosVisitante.getText().toString();
                puntVis = Integer.parseInt(valor1);
                puntVis+=2;
                puntosVisitante.setText(String.valueOf(puntVis));
                comprobarMarcadorVis();
            }
        });

        mas3Vis.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                String valor1 = puntosVisitante.getText().toString();
                puntVis = Integer.parseInt(valor1);
                puntVis+=3;
                puntosVisitante.setText(String.valueOf(puntVis));
                comprobarMarcadorVis();
            }
        });

        menos1Vis.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                String valor1 = puntosVisitante.getText().toString();
                puntVis = Integer.parseInt(valor1);
                puntVis-=1;
                puntosVisitante.setText(String.valueOf(puntVis));
                comprobarMarcadorVis();
            }
        });

        cambNomLocal.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                String valor1 = nomLocal.getText().toString();
                if(!valor1.trim().isEmpty())
                    local.setText(valor1.toUpperCase());
                nomLocal.setText("");
            }
        });

        cambNomVis.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                String valor1 = nomVisitante.getText().toString();
                if(!valor1.trim().isEmpty())
                    visitante.setText(valor1.toUpperCase());
                nomVisitante.setText("");
            }
        });

    }

    private void comprobarMarcadorLocal(){
        if(puntLocal==0) {
            menos1Local.setEnabled(false);
            menos1Local.setBackgroundResource(R.drawable.balon5);
        }else {
            menos1Local.setEnabled(true);
            menos1Local.setBackgroundResource(R.drawable.balon4);
        }
    }

    private void comprobarMarcadorVis(){
        if(puntVis==0) {
            menos1Vis.setEnabled(false);
            menos1Vis.setBackgroundResource(R.drawable.balon5);
        }else {
            menos1Vis.setEnabled(true);
            menos1Vis.setBackgroundResource(R.drawable.balon4);
        }
    }

}
