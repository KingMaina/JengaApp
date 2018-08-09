package com.example.user.jengaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Drawer extends AppCompatActivity {
    List<Here> listhere;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
        listhere = new ArrayList<>();
        listhere.add(new Here(R.drawable.logo,"Benson","write here"));
        listhere.add(new Here(R.drawable.logo,"Benson","write here"));
        listhere.add(new Here(R.drawable.logo,"Benson","write here"));
        listhere.add(new Here(R.drawable.logo,"Benson","write here"));
        listhere.add(new Here(R.drawable.logo,"Benson","write here"));
        listView = (ListView)findViewById(R.id.listview);
        ContractorAdapter adapter = new ContractorAdapter
                (this,R.layout.contractor,listhere);
        listView.setAdapter(adapter);
    }
}
