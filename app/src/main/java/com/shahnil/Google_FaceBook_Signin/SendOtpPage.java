package com.shahnil.Google_FaceBook_Signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class SendOtpPage extends AppCompatActivity {

    private Button button ;

    private TextInputLayout editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_otp_page);

        button = findViewById(R.id.getNumberButton);


        editText = findViewById(R.id.edittextphone);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String code = "91";

                String number = editText.getEditText().getText().toString().trim();

                if (number.isEmpty() || number.length() < 10) {
                    editText.setError("Valid number is required");
                    editText.requestFocus();
                    return;
                }

                String phonenumber = "+" + code + number;

                Intent intent = new Intent(SendOtpPage.this, OtpCheck.class);
                intent.putExtra("phonenumber", phonenumber);
                startActivity(intent);

            }
        });










    }
}