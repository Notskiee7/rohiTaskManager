package rao.rohi.rohitaskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;

import com.google.android.material.textfield.TextInputEditText;

public class addTaskActivity extends AppCompatActivity {
    private TextInputEditText etTitle;
    private TextInputEditText etSubject;
    private ImageButton imageButton;
    private SeekBar seekBar;
    private Button btnCancel,btnSave;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        etTitle =findViewById(R.id.etTitle);
        etSubject=findViewById(R.id.etSubject);
        imageButton=findViewById(R.id.imageButton);
        seekBar=findViewById(R.id.seekBar);
        btnCancel=findViewById(R.id.btnCancel);
        btnSave=findViewById(R.id.btnSave);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(addTaskActivity.this,MainActivity.class);
                startActivity(i);
            }
        });


























    }
}