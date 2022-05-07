package com.example.projeto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;
    Button btnRegistrar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        btnLogin.setOnClickListener(this);
        btnRegistrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnLogin){
            Intent telaPrincipal = new Intent(this, MainActivity.class);
            startActivity(telaPrincipal);
        }
        if(v.getId() == R.id.btnRegistrar){
            Intent telaRegistrarUsuario = new Intent(this, Registrar.class);
            startActivity(telaRegistrarUsuario);
        }
    }
}
