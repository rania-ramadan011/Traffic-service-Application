package com.example.lenovo.trafficservices;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Messages extends AppCompatActivity {

    // Array of strings...
    String[] data = {"there is Accident", "there is traffic"};
    ListView l;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        l = (ListView) findViewById(R.id.list_view);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        l.setAdapter(adapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                     @Override
                                     public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                         Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + "is selected", Toast.LENGTH_LONG).show();
                                     }
                                 }

        );
    }
}
