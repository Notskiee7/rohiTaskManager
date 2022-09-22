package rao.rohi.rohitaskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchableInfo;
import android.os.Bundle;
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



    }
}