package com.apps.recyclertablelayout;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Model_Item> list;
    RecyclerView recyclerView;

    private MyAdapter myAdapter;
    CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //=====recyclerview=========================
        recyclerView = findViewById(R.id.mRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        coordinatorLayout = findViewById(R.id.coordinatorLayout);






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

        myAdapter = new MyAdapter(list, MainActivity.this);
        //=======Setting Adapter to recyclerView=======================
        recyclerView.setAdapter(myAdapter);

        enableSwipeToDeleteAndUndo();

//        myAdapter.notifyDataSetChanged();






    }
    private void enableSwipeToDeleteAndUndo() {
        SwipeToDeleteCallback swipeToDeleteCallback = new SwipeToDeleteCallback(this) {
            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i) {


                final int position = viewHolder.getAdapterPosition();
                final Model_Item item = myAdapter.getData().get(position);

                myAdapter.removeItem(position);


                Snackbar snackbar = Snackbar
                        .make(coordinatorLayout, "Item was removed from the list.", Snackbar.LENGTH_LONG);
                snackbar.setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        myAdapter.restoreItem(item, position);
                        recyclerView.scrollToPosition(position);
                    }
                });

                snackbar.setActionTextColor(Color.YELLOW);
                snackbar.show();

            }
        };

        ItemTouchHelper itemTouchhelper = new ItemTouchHelper(swipeToDeleteCallback);
        itemTouchhelper.attachToRecyclerView(recyclerView);
    }
}
