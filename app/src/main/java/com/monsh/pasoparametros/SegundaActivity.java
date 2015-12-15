package com.monsh.pasoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    TextView tv_name;
    TextView tv_mail;
    TextView tv_passw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        tv_name = (TextView)findViewById(R.id.tv_name);
        tv_mail = (TextView)findViewById(R.id.tv_mail);
        tv_passw = (TextView)findViewById(R.id.tv_passw);

        Intent i = getIntent();
        Bundle bundle = i.getExtras();

        if (bundle != null){
            String name = (String)bundle.get("Nombre");
            tv_name.setText(name);

            String mail = (String)bundle.get("Correo");
            tv_mail.setText(mail);

            String passw = (String)bundle.get("Password");
            tv_passw.setText(passw);
        }


    }
}
