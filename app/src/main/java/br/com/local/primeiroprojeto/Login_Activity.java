package br.com.local.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }

    public void loginToPrincipal(View view) {
        // mostra uma mensagem para o usuario
        //Toast.makeText(getApplicationContext(), "Carregando", Toast.LENGTH_LONG ).show();

        //abrir janela do main activity

        Intent abrirJanela = new Intent(getApplicationContext(), Cadastro_Usuario_Activity.class);
        startActivity(abrirJanela);
    }
}