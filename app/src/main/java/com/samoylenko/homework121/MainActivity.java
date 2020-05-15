package com.samoylenko.homework121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonOk;
    private Button buttonClear;
    private EditText inputName;
    private EditText inputEmail;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClear = findViewById(R.id.buttonClear);
        buttonOk = findViewById(R.id.buttonOk);

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputEmail.getText().clear();
                inputName.getText().clear();
                textResult.setText("");
            }
        });

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = inputName.getText().toString();
                String email = inputEmail.getText().toString();
                if (username.isEmpty() | email.isEmpty()){
                    textResult.setText(R.string.resultError);
                }else {
                    String text = getString(R.string.resultDone, username, email);
                    textResult.setText(text);
                }
            }
        });

        inputName = findViewById(R.id.editTextName);
        inputEmail = findViewById(R.id.editTextEmail);
        textResult = findViewById(R.id.textResult);
    }
}
