package com.nortemobile.exemplomodulo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nortemobile.meumodulo.modulo_activity;

public class MainActivity extends AppCompatActivity
{
    Button botaoAbrirMobulo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoAbrirMobulo = (Button) findViewById(R.id.botaoAbrirModulo);

        botaoAbrirMobulo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent meuModulo = new Intent(getBaseContext(), modulo_activity.class);
                startActivity(meuModulo);
            }
        });


    }
}
