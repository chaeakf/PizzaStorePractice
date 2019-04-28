package com.tj.pizzastorepractice.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.tj.pizzastorepractice.R;
import com.tj.pizzastorepractice.datas.PizzaStore;

import java.util.List;
public class StoreAdapter extends ArrayAdapter<PizzaStore> {

    Context mContext;
    List<PizzaStore> mList;
    LayoutInflater inf;

    public StoreAdapter(Context context, List<PizzaStore> list){
        super(context, R.layout.store_list_item, list);

        mContext = context;
        inf = LayoutInflater.from(mContext);
        mList = list;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if(row == null) {
            row = inf.inflate(R.layout.store_list_item, null);

        }

        TextView storeNametxt = row.findViewById(R.id.storeNameTxt);
        TextView openTime = row.findViewById(R.id.openTimeTxt);




        return row;
    }
}
