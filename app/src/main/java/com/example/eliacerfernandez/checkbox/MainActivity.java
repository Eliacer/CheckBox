package com.example.eliacerfernandez.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CheckBox rojo,azul,amarillo;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rojo = (CheckBox)findViewById(R.id.uno);
        azul = (CheckBox)findViewById(R.id.dos);
        amarillo = (CheckBox)findViewById(R.id.tres);

        boton = (Button)findViewById(R.id.boton);

        boton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        StringBuffer result = new StringBuffer();

        result.append("Rojo:").append(rojo.isChecked());
        result.append(" Azul:").append(azul.isChecked());
        result.append(" Amarillo:").append(amarillo.isChecked());

        Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_SHORT).show();


    }
}
