package com.example.myapplication;


import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MyViewModel extends ViewModel {
    private ArrayList<String> lsnumber;
    private int position;

    public void setPosition(int i){
        position = i;
    }

    public int getPosition(){
        return position;
    }

    public ArrayList<String> getNumber() {
        if (lsnumber == null) {
            lsnumber = new ArrayList<String>();
        }
        return lsnumber;
    }
    public ArrayList<String> upNumber(){
        lsnumber.add(String.valueOf(lsnumber.size()));
        return lsnumber;
    }
    public ArrayList<String> downNumber(){
        if(lsnumber.size() != 0){
            lsnumber.remove(lsnumber.size()-1);
        }
        return lsnumber;
    }
    public void changeNumber(String value, int position){
        lsnumber.set(position, value);
    }
    public String getValue(int position){
        return lsnumber.get(position);
    }

}
