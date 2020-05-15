package com.samoylenko.homework121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button button_ok;
    private Button button_clear;
    private TextView input_name;
    private TextView input_email;
    private TextView text_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_clear = findViewById(R.id.button_clear);
        button_ok = findViewById(R.id.button_ok);

        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_email.setText("");
                input_name.setText("");
                text_result.setText("");
            }
        });

        button_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = input_name.getText().toString();
                String email = input_email.getText().toString();
                if (username.equals("") | email.equals("")){
                    text_result.setText("Имя пользователя или электронная почта не может быть пустым!");
                }else {
                    text_result.setText("Подписка на рассылку успешно оформлена для пользователя: " + username + " на электронный адрес: "+ email);
                }
            }
        });

        input_name = findViewById(R.id.editText_name);
        input_email = findViewById(R.id.editText_email);
        text_result = findViewById(R.id.text_result);
    }
}
