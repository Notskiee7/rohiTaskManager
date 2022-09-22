package rao.rohi.rohitaskmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

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

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAndSave();



            }
        });

    }

    private void checkAndSave()
    {
        String email=etMail.getText().toString();
        String pass=etPassword.getText().toString();
        boolean isOk=true;
        if(email.length()==0){
            etMail.setError("Enter your Email");
            isOk=false;
        }
        if(pass.length()==0){
            etPassword.setError("Enter your Password");
            isOk=false;
        }
        if(email.indexOf('@')<=0){
            etMail.setError("Unvalid Email!");
            isOk=false;
        }
        if(pass.length()<7&& pass.length()>0){
            etPassword.setError("Short password!");
            isOk=false;
        }

        //if all the if conditions are true then the inputs will be sent to the firebase
        if(isOk){
            FirebaseAuth auth = FirebaseAuth.getInstance();
            auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(signIn.this, "Successful", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(signIn.this,MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                    else{
                        Toast.makeText(signIn.this, "Wrong password or Email", Toast.LENGTH_SHORT).show();
                    }

                }
            });

        }















    }
}