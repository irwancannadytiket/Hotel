package com.example.irwancannady.hotel.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.irwancannady.hotel.R;
import com.example.irwancannady.hotel.model.QuotesEntity;
import com.squareup.picasso.Picasso;


import java.util.List;

/**
 * Created by irwancannady on 5/12/17.
 */

public class AdapterMain extends RecyclerView.Adapter<AdapterMain.ViewHolder> {

    private List<QuotesEntity> mQuotesEntity;
    private Context mContext;

    public AdapterMain( Context mContext, List<QuotesEntity> mQuotesEntity) {
        this.mQuotesEntity = mQuotesEntity;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_activity, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        QuotesEntity a = mQuotesEntity.get(position);
        holder.judul.setText(a.getJudul());
        holder.tentang.setText(a.getTentang());
        holder.isi.setText(a.getIsi());

        Picasso.with(mContext).load(a.getIsi()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mQuotesEntity.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView tentang, judul, isi;
        ImageView imageView;

         ViewHolder(View itemView) {
            super(itemView);

            tentang = (TextView) itemView.findViewById(R.id.tv_tentang);
            judul = (TextView) itemView.findViewById(R.id.tv_judul);
            isi = (TextView) itemView.findViewById(R.id.tv_isi);

        }
    }
}
