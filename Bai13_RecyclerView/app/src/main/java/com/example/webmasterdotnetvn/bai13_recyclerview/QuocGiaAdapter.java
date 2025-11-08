package com.example.webmasterdotnetvn.bai13_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class QuocGiaAdapter extends RecyclerView.Adapter<QuocGiaAdapter.QuocGiaViewHolder> {

    Context context;
    ArrayList<QuocGia> listQuocGia;
    RecyclerViewInterface recyclerViewInterface; // Biến cho interface

    // Sửa Constructor để nhận Interface (giống video)
    public QuocGiaAdapter(Context context, ArrayList<QuocGia> listQuocGia, RecyclerViewInterface recyclerViewInterface) {
        this.context = context;
        this.listQuocGia = listQuocGia;
        this.recyclerViewInterface = recyclerViewInterface; // Gán interface
    }

    @NonNull
    @Override
    public QuocGiaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_item_quoc_gia, parent, false);
        return new QuocGiaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull QuocGiaViewHolder holder, int position) {
        QuocGia quocGia = listQuocGia.get(position);

        holder.tenQuocGia.setText(quocGia.getTenQuocGia());
        holder.thuDo.setText(quocGia.getThuDo());
        holder.laCo.setImageResource(quocGia.getLaCo());
        holder.danSo.setText(quocGia.getDanSo());

        // Set onClick cho cả item (giống video, họ set cho CardView)
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Gọi hàm của interface (giống video)
                recyclerViewInterface.onItemClick(listQuocGia.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listQuocGia.size();
    }

    // Lớp ViewHolder
    public static class QuocGiaViewHolder extends RecyclerView.ViewHolder {
        ImageView laCo;
        TextView tenQuocGia, thuDo;
        TextView danSo;

        public QuocGiaViewHolder(@NonNull View itemView) {
            super(itemView);
            laCo = itemView.findViewById(R.id.img_flag);
            tenQuocGia = itemView.findViewById(R.id.tv_ten_quoc_gia);
            thuDo = itemView.findViewById(R.id.tv_thu_do);
            danSo = itemView.findViewById(R.id.tv_dan_so);
        }
    }
}
