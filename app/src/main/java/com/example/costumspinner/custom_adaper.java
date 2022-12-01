package com.example.costumspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class custom_adaper extends BaseAdapter {

    Context context;
    String cityList[];
    String capitalCity[];
    int symbols[];
    LayoutInflater inflater;

    public custom_adaper(Context context, String[] cityList, int[] symbols, String[] capitalCity){
        this.context = context;
        this.cityList = cityList;
        this.symbols = symbols;
        this.capitalCity = capitalCity;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return cityList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public String[] getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String[] capitalCity) {
        this.capitalCity = capitalCity;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.custom_spin, null);
        TextView city = (TextView) view.findViewById(R.id.tvCN);
        TextView capitalList = (TextView) view.findViewById(R.id.tvCC);
        ImageView symbol = (ImageView) view.findViewById(R.id.ivFlag);
        city.setText(cityList[i]);
        symbol.setImageResource(symbols[i]);
        capitalList.setText(capitalCity[i]);
        return view;
    }
}
