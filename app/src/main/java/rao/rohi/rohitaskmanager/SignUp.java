package rao.rohi.rohitaskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class SignUp extends AppCompatActivity {
    private TextInputEditText etMail2;
    private TextInputEditText etPassword2;
    private TextInputEditText etConfirmpassword;
    private Button btnSave;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etMail2=findViewById(R.id.etMail2);
        etPassword2=findViewById(R.id.etPassword2);
        etConfirmpassword=findViewById(R.id.etConfirmpassword);
        btnSave=findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignUp.this,signIn.class);
                startActivity(i);
            }
        });








    }
}