package mx.edu.tesoem.isc.JAGG.a7s21prac3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

   String[] strestados;
   List listEstado;
   ArrayAdapter<String> adaptador;

   Spinner  spestados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spestados = findViewById(R.id.sp_estados_D);
        strestados = new  String[] {"CDMX", "Jalisco", "Nuevo Leon", "Durango", "Puebla", "Tabasco"};
        listEstado = new ArrayList<String>();
        Collections.addAll(listEstado,strestados);
        adaptador = new ArrayAdapter<String>( this, android.R.layout.simple_spinner_dropdown_item,listEstado);
        spestados.setAdapter(adaptador);
        spestados.setOnItemSelectedListener(this);



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
String valor = spestados.getSelectedItem().toString();
        Toast.makeText(this, "usted seleciono " + valor, Toast.LENGTH_LONG);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}