package com.e.pr15_sqlite_7029;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Spinner sp;
String cars[]={"Aston Martin","Audi Q7","Creta","Altroz","MG Hector","Nexon"};
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp=(Spinner)findViewById(R.id.sp1);
        final ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,cars);
        sp.setAdapter(arrayAdapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(sp.getItemIdAtPosition(position)==0)
                {
                    Toast.makeText(MainActivity.this, "Please Select Any One", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent i=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(i);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
