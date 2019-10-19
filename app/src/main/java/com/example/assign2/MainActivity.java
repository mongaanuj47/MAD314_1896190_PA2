package com.example.assign2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText id = findViewById(R.id.Enter_id);
        final EditText password = findViewById(R.id.Enter_password);

        Button submit = findViewById(R.id.button);

        final Intent intent = new Intent(MainActivity.this,SecondActivity.class);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((Integer.parseInt(id.getText().toString())==12345) &&  (Integer.parseInt(password.getText().toString()))==12345)
                    startActivity(intent);

                else
                    Toast.makeText(MainActivity.this,"userID or password is wrong",Toast.LENGTH_LONG).show();
            }
        });
    }
}
