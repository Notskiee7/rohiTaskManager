package rao.rohi.rohitaskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class signIn extends AppCompatActivity {

    private TextInputEditText etMail;
    private TextInputEditText etPassword;
    private Button btnSignup;
    private Button btnSignin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        etMail=findViewById(R.id.etMail);
        etPassword= findViewById(R.id.etPassword);
        btnSignup=findViewById(R.id.btnSignup);
        btnSignin=findViewById(R.id.btnSignin);



        btnSignup.setOnClickListener(new View.OnClickListener()      //this function linked the button sign up with the activity sign up
        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(signIn.this,SignUp.class);
                startActivity(i);
            }
        });




    }
}