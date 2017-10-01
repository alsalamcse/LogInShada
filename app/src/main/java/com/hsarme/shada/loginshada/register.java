package com.hsarme.shada.loginshada;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity
{
    private EditText user1;
    private  EditText password1;
    private EditText email;
    private Button save;
    private Button delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        user1= (EditText)findViewById(R.id.user1);
        password1= (EditText)findViewById(R.id.password1);
        email= (EditText)findViewById(R.id.email);
        save= (Button)findViewById(R.id.save);
        delete=(Button)findViewById(R.id.delete);

    }
    public void onClick(View view){
        if (view==save){
            SharedPreferences prefs= getSharedPreferences(  , MODE_PRIVATE)
        }
    }
}
