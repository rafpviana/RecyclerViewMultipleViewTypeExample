package com.recyclerviewmultipleviewtypeexample;

/**
 * Created by rafaelpinheiro on 05/04/17.
 */

public class MyData {

    private int type;
    private String myData;

    public MyData(int type, String myData) {
        this.type = type;
        this.myData = myData;
    }

    public int getType() {
        return type;
    }

    public String getMyData() {
        return myData;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setMyData(String myData) {
        this.myData = myData;
    }
}
