package com.example.se_exa2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtname, txtpass;
    private Button btnsrch,btnclear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//             btnsrch.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View view) {
////
//                }
//
//            });
    }



    public void sendbtn(View v){
        txtname =(EditText) findViewById(R.id.txtname);
        txtpass =(EditText) findViewById(R.id.txtpass);
        btnsrch=(Button) findViewById(R.id.btnsrch);
        btnclear=(Button) findViewById(R.id.button2);
        if (!(txtname.getText().toString().isEmpty() || txtpass.getText().toString().isEmpty())){
                    if (txtname.getText().toString().equals("voter") || txtpass.getText().toString().equals("1234")){
                    Toast.makeText(getApplicationContext(),"Hi " + txtname.getText().toString(),Toast.LENGTH_LONG).show();
                        Intent intent=new Intent( MainActivity.this,Search.class);
                        intent.putExtra(txtname.getText().toString(),1);
                        startActivity(intent);

                }else {
                        Toast.makeText(getApplicationContext(),"Access is denied",Toast.LENGTH_LONG).show();
                    }
                    }else {
                        Toast.makeText(getApplicationContext(),"Enter name and password " ,Toast.LENGTH_LONG).show();
                    }
    }


}
