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

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckAndSave();
            }
        });


    }
    //checkAndSave is a function that check if all the conditions of the email and
    private void CheckAndSave() {
        String signUpMail=etMail2.getText().toString();
        String signUpPass=etPassword2.getText().toString();
        String confirmpass=etConfirmpassword.getText().toString();
        boolean isOk=true;

        if(signUpMail.length()==0){
            etMail2.setError("Enter a New Email");
            isOk=false;
        }
        if(signUpPass.length()==0){
            etPassword2.setError("Enter a New Password");
            isOk=false;
        }
        if(signUpMail.indexOf('@')<=0){
            etMail2.setError("Unvalid Email!");
            isOk=false;
        }
        if(signUpPass.length()<7&& signUpPass.length()>0){
            etPassword2.setError("Short password!");
            isOk=false;
        }
        if(signUpPass.equals(confirmpass)==false){
            etConfirmpassword.setError("No Match in password");
            isOk=false;
        }



        if(isOk){
            //used for signing in, signing up and sign out
            FirebaseAuth auth = FirebaseAuth.getInstance();
            //create a new user with email and password
            auth.createUserWithEmailAndPassword(signUpMail,signUpPass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                /**
                 * event handler when the mission is completed (create account)
                 * the task is an information about the event
                 */
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if(task.isSuccessful()){    //check if the mission (built account) is successful
                        /*
                        if the email and password are valid then the email and the pass are saved in the firebase
                        and a text will pop up in the bottom of the screen says "password and email are saved"
                         */
                        Toast.makeText(SignUp.this, "password and email are saved", Toast.LENGTH_SHORT).show();
                        finish(); // when  i press the button save the current screen will close and returns to the previous screen

                    }
                    else{
                        Toast.makeText(SignUp.this, "something wrong in password or Email"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }

                }
            });

        }


    }
}