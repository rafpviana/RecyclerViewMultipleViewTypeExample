package com.recyclerviewmultipleviewtypeexample;

import java.util.ArrayList;

/**
 * Created by rafaelpinheiro on 05/04/17.
 */

public class MyDataset {

    private ArrayList<MyData> myDataset;

    public MyDataset(ArrayList<MyData> myDataset) {
        this.myDataset = myDataset;
    }

    public MyDataset(){}

    public ArrayList<MyData> getMyDataset() {
        return myDataset;
    }

    public void setMyDataset(ArrayList<MyData> myDataset) {
        this.myDataset = myDataset;
    }
}
