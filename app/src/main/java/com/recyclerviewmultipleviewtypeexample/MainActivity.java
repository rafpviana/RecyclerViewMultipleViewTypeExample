package com.recyclerviewmultipleviewtypeexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private MyDataset myDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<MyData> myDataArrayList = new ArrayList<>();

        myDataArrayList.add(new MyData(1, "The Offspring"));
        myDataArrayList.add(new MyData(2, "Evanescence"));
        myDataArrayList.add(new MyData(1, "Daughtry"));
        myDataArrayList.add(new MyData(2, "Red Hot Chili Peppers"));
        myDataArrayList.add(new MyData(1, "System of a Down"));
        myDataArrayList.add(new MyData(2, "Nickelback"));
        myDataArrayList.add(new MyData(1, "Paramore"));
        myDataArrayList.add(new MyData(2, "Foo Fighters"));
        myDataArrayList.add(new MyData(1, "Fall Out Boy"));
        myDataArrayList.add(new MyData(2, "Scorpions"));
        myDataArrayList.add(new MyData(1, "All That Remains"));

        myDataset = new MyDataset(myDataArrayList);

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(myDataset);

        mRecyclerView.setAdapter(mAdapter);
    }
}
