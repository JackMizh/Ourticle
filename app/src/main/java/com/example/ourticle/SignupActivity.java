package com.example.ourticle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Window window = this.getWindow();

        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.blue_primary));

        TextView tvBack = (TextView) findViewById (R.id.tvBack);
        EditText etName = (EditText) findViewById(R.id.etName);
        EditText etEmail = (EditText) findViewById(R.id.etEmail);
        EditText etUserregist = (EditText) findViewById(R.id.etUserregist);
        EditText etPassregist = (EditText) findViewById(R.id.etPassregist);
        EditText etHp = (EditText) findViewById(R.id.etPhone);
        Button bRegist = (Button) findViewById(R.id.bRegist);
        FirebaseAuth mAuth = FirebaseAuth.getInstance();

        String  name = etName.getText().toString();
        String email = etEmail.getText().toString();
        String user = etUserregist.getText().toString();
        String pass = etPassregist.getText().toString();
        String hp = etHp.getText().toString();


        tvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), FavActivity.class));
            }
        });

    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}