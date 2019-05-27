package com.apps.recyclertablelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Model_Item> list;
    RecyclerView recyclerView;

    private RecyclerView.Adapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //=====recyclerview=========================
        recyclerView = findViewById(R.id.mRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




//        myAdapter.notifyDataSetChanged();




        list = new ArrayList<>();

        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));
        list.add(new Model_Item("OrgId", "123456", "Org_Name", "Delhi Jal Board"));


        //======adapter===============

        myAdapter = new MyAdapter(list);
        //=======Setting Adapter to recyclerView=======================
        recyclerView.setAdapter(myAdapter);

//        myAdapter.notifyDataSetChanged();






    }
}
