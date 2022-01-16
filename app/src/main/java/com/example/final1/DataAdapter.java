package com.example.final1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class DataAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<listpizza> listpizzaList;
    Button dh;
    public DataAdapter(Context context, int layout, List<listpizza> listpizzaList) {
        this.context = context;
        this.layout = layout;
        this.listpizzaList = listpizzaList;
    }

    @Override
    public int getCount() {
        return listpizzaList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        TextView txtten = (TextView) view.findViewById(R.id.ten);
        TextView txtmon1 = (TextView) view.findViewById(R.id.textviewmon1);
        TextView txtmon2 = (TextView) view.findViewById(R.id.textviewmon2);
        dh = (Button) view.findViewById(R.id.btndh);
        dh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),donhang.class);
                view.getContext().startActivity(intent);
            }
        });
        ImageView imghinh = (ImageView) view.findViewById(R.id.imghinh);
        ///
        listpizza listpizza = listpizzaList.get(i);
        txtten.setText(listpizza.getTen());
        txtmon1.setText(listpizza.getMon1());
        txtmon2.setText(listpizza.getMon2());
        imghinh.setImageResource(listpizza.getHinh());

        return view;
    }

}
