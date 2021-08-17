package com.javaex.mysite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edt_name;
    private EditText edt_password;
    private EditText edt_content;
    private Button btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_name = (EditText) findViewById(R.id.edt_name);
        edt_password = (EditText) findViewById(R.id.edt_password);
        edt_content = (EditText) findViewById(R.id.edt_content);
        btn_save = (Button) findViewById(R.id.btn_save);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("name",""+edt_name.getText());
                Log.d("password",""+edt_password.getText());
                Log.d("content",""+edt_content.getText());

                Toast.makeText(getApplicationContext(),"이름: "+edt_name.getText()+" 패스워드: "+edt_password.getText()+" 내용: "+edt_content.getText(), Toast.LENGTH_LONG).show();

            }
        };

        btn_save.setOnClickListener(listener);

    }
}