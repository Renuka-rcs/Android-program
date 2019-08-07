package com.example.informationofstudent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etname,etroll,etmono,etadd,etemail;
    RadioGroup radioGroupbatch,radioGroupgen;
    CheckBox cbhindi,cbEng,cbMarathi;
    Spinner spnational;
    Button btsubmit;
    StringBuffer stringBuffer;
    ArrayAdapter<String> adapter;
    String [] Nationality ={"India","America","Canada","China","Russia","France"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname=findViewById(R.id.idname);
        etroll=findViewById(R.id.idroll);
        etadd=findViewById(R.id.idaddress);
        etmono=findViewById(R.id.idmobile);
        etemail=findViewById(R.id.idemail);
        btsubmit=findViewById(R.id.btnsubmit);
        spnational=findViewById(R.id.spinnerState);

        radioGroupbatch=findViewById(R.id.idradioGr);
        cbEng=findViewById(R.id.idEnglish);
        cbhindi=findViewById(R.id.idhindi);
        cbMarathi=findViewById(R.id.Marathi);

        adapter=new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                Nationality

        );
        spnational.setAdapter(adapter);

        spnational.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long l) {

                String item=(String)parent.getItemAtPosition(position);
                Toast.makeText(
                        MainActivity.this,
                        "Nationality"+item,
                        Toast.LENGTH_LONG
                ).show();
            }
        });

                 Method();
    }

    private void Method(){
        btsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stringBuffer=new StringBuffer();

                String string= etname.getText().toString();
                etname.setText("");

            }
        });
    }
}
