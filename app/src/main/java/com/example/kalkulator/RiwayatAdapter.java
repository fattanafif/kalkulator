package com.example.kalkulator;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RiwayatAdapter  extends RecyclerView.Adapter<RiwayatAdapter.MyViewHolder> {
    public ArrayList<String> listRiwayat = new ArrayList<String>();

    @NonNull
    @Override
    public RiwayatAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_riwayat, viewGroup, false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RiwayatAdapter.MyViewHolder myViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView tvRiwayat;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvRiwayat= itemView.findViewById(R.id.tvRiwayat);
        }
    }
}
