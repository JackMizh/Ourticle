package com.example.ourticle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        Window window = this.getWindow();

        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.blue_primary));

        View vBack = (View) findViewById(R.id.vBack);
        EditText etUserlogin = (EditText) findViewById(R.id.etUserlogin);
        EditText etPasslogin = (EditText) findViewById(R.id.etPasslogin);
        Button bLogin = (Button) findViewById(R.id.bLogin);
        CheckBox cbRememberme = (CheckBox) findViewById(R.id.cbRememberme);
        TextView tvForgotpass = (TextView) findViewById(R.id.tvForgotpass);

        vBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etUserlogin.getText().toString().equals("")){
                    etUserlogin.setError("Required");
                } else if (etPasslogin.getText().toString().equals("")){
                    etPasslogin.setError("Required");
                } else if (etUserlogin.getText().toString().equals("username") && etPasslogin.getText().toString().equals("password")){
                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
                } else {
                    Toast.makeText(getApplicationContext(), "Username atau Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}