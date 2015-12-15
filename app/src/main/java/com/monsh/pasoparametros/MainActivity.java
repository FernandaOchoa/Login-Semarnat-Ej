package com.monsh.pasoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button boton;
    EditText edt_nombre;
    EditText edt_correo;
    EditText edt_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.btn_enviar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //Pasar parametros
                edt_nombre = (EditText)findViewById(R.id.edt_nombre);
                edt_correo = (EditText)findViewById(R.id.edt_correo);
                edt_pass = (EditText)findViewById(R.id.edt_pass);

                String nombre = edt_nombre.getText().toString();
                String correo = edt_correo.getText().toString();
                String pass = edt_pass.getText().toString();

                intent.putExtra("Nombre",nombre);
                intent.putExtra("Correo",correo);
                intent.putExtra("Password",pass);

                startActivity(intent);
            }
        });
    }
}
