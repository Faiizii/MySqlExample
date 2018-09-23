package com.example.faiizii.mysqltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText pas,usr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        usr = (EditText) findViewById( R.id.username);
        pas = (EditText) findViewById(R.id.password);
    }

    public void loginBtn(View view) {
        String user = usr.getText().toString();
        String pass = pas.getText().toString();

        background bg = new background(this);
        bg.execute(user,pass);
    }
}
