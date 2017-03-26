package com.example.parktaejun.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText edit;
    Button button;
    ListView listview;
    ListAdapter listAdapter;
    List<Data> items = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = (EditText)findViewById(R.id.edit);
        button = (Button)findViewById(R.id.button);
        listview = (ListView)findViewById(R.id.listview);

        listAdapter = new ListAdapter(this, items);
        listview.setAdapter(listAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                items.add(new Data(edit.getText().toString()));
            }
        });
    }
}
