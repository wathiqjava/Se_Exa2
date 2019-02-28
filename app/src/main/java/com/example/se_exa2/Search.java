package com.example.se_exa2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Search extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener{
    private EditText txtperid;
    private Button btnsrch;
    private ImageView img1;
    RadioButton rdreg,rdsvl;
    TextView tvinfo;
    RadioGroup rg;
    Spinner spin;
    String selectitm;
    String[] governorate = { "Baghdad", "Kerbala", "Basra"};
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

      spin  = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,governorate);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);


    }
    //SPECIAL
    public void search(View v){
        int selectedId = rg.getCheckedRadioButtonId();
        rdreg=(RadioButton) findViewById(R.id.rdreg);
        rdsvl=(RadioButton) findViewById(R.id.rdsvl);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,governorate);
       if (!(txtperid.getText().toString().isEmpty()||selectedId==-1 || (spin != null && spin.getSelectedItem() !=null))) {
           if (txtperid.getText().toString().equals("12345678") && rdreg.getText().toString().equals("REGULAR") && selectitm.equals("Baghdad")) {
               img1.setImageResource(R.drawable.doctor_icon_1527767526);
               tvinfo.setText(txtperid.getText().toString() + "\n" + "wathiq hani" + selectitm.equals("Baghdad"));
           }
           if (txtperid.getText().toString().equals("22222222") && rdreg.getText().toString().equals("SPECIAL") && selectitm.equals("Basra")) {
               img1.setImageResource(R.drawable.ic_launcher_background);
               tvinfo.setText(txtperid.getText().toString() + "\n" + "Ahmed Qasem" + selectitm.equals("Basra"));
           } else {
               Toast.makeText(Search.this,"voter not found", Toast.LENGTH_SHORT).show();
           }
       }else {
           Toast.makeText(Search.this,"voter not found", Toast.LENGTH_SHORT).show();
       }
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        selectitm=governorate[position];

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
