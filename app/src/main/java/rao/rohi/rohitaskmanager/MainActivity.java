package rao.rohi.rohitaskmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchableInfo;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {
    private SearchView SearchView;
    private ListView List;
    private ImageButton imageButtonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SearchView=findViewById(R.id.SearchView);
        List=findViewById(R.id.List);
        imageButtonAdd=findViewById(R.id.imageButtonAdd);

        imageButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,addTaskActivity.class);
                startActivity(i);
            }
        });





    }

    @Override
    //a function that returns true if all things are alright (no bugs)
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);      //to make menu appear in the emulator
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.ItmSettings){
            Intent i = new Intent(MainActivity.this,Settings.class);
            startActivity(i);
        }

        else if(item.getItemId()==R.id.ItmSignOut){
            Intent i = new Intent(MainActivity.this,signIn.class);
            startActivity(i);
        }
        else if (item.getItemId()==R.id.ItmHistory){
            Intent i = new Intent(MainActivity.this,History.class);
            startActivity(i);

        }
        return true;
    }







}