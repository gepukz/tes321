package com.example.user.tes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 9/25/2015.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    ArrayList<footballer> footballer;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView namaTextView;
        public TextView umurTextView;
        public ViewHolder(View v) {
            super(v);
            namaTextView = (TextView) v.findViewById(R.id.nama);
            umurTextView = (TextView) v.findViewById(R.id.umur);
        }
    }

MyAdapter(ArrayList<footballer> footballer)
{

    this.footballer = footballer;
}


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        holder.namaTextView.setText(footballer.get(position).getNama());
        holder.umurTextView.setText(""+footballer.get(position).getUmur());

    }

    @Override
    public int getItemCount() {
        return footballer.size();
    }
}
