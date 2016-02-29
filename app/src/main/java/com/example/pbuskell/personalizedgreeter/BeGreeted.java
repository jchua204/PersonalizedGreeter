package com.example.pbuskell.personalizedgreeter;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class BeGreeted extends AppCompatActivity {

    String strFirstUsersName = "";
    String strMidName = "";
    String strLastname = "";


    Button btnGreetMe;
    EditText edtxtFirstNameField;
    EditText edtxtMiddleNameField;
    EditText edtxtLastNameField;
    TextView txtvwGreetingSpace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_greeted);

        btnGreetMe = (Button) findViewById(R.id.btnGreetMe);
        edtxtFirstNameField = (EditText) findViewById(R.id.edtxtFirstNameField);
        edtxtMiddleNameField = (EditText) findViewById(R.id.edtxtMiddleNameField);
        edtxtLastNameField = (EditText) findViewById(R.id.edtxtLastNameField);
        txtvwGreetingSpace = (TextView) findViewById(R.id.txtvwGreetingSpace);
    }

    public void greetTheUser(View vw)
    {
        Resources res = getResources();


        strFirstUsersName = edtxtFirstNameField.getText().toString()  ;
        strMidName = edtxtMiddleNameField.getText().toString() ;
        strLastname = edtxtLastNameField.getText().toString() ;

        txtvwGreetingSpace.setText(String.format(res.getString(R.string.strGreeting), strFirstUsersName, strMidName, strLastname
                ));
    }
}
