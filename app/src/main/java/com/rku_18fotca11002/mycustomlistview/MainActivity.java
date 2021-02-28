package com.rku_18fotca11002.mycustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lstData;
    ArrayAdapter<String> adapter;
    ArrayList<Item> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstData = findViewById(R.id.lstData);
        list = generateData();
        MyAdapter myAdapter = new MyAdapter(this, list);
        lstData.setAdapter(myAdapter);
    }

    private ArrayList<Item> generateData() {
        ArrayList<Item> list = new ArrayList<Item>();

        list.add(new Item("Fenil Babariya","18/02/2021","9834983498","12:34",R.drawable.call_incoming));
        list.add(new Item("Devang Amrutiya","8/02/2021","9834983498","12:34",R.drawable.call_incoming));
        list.add(new Item("Parth Shingala","23/02/2021","9834983498","12:34",R.drawable.call_missed));
        list.add(new Item("Deep Gondaliya","10/02/2021","9834983498","12:34",R.drawable.call_outgoing));
        list.add(new Item("Gautam Morvadiya","28/02/2021","9834983498","12:34",R.drawable.call_missed));
        list.add(new Item("Harsh Domadiya","30/03/2021","9834983498","12:34",R.drawable.call_outgoing));

        return list;
    }
}