package com.example.drumpadmachinebeats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Presset> mData;

    public RecyclerViewAdapter(Context mContext, List<Presset> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_presets, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_presset_title.setText(mData.get(position).getTitle());
        //holder.presset_img.setImageResource(mData.get(position).getSound()); !!!!!!!!!!!!!!!!!!!!
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_presset_title;
        ImageView presset_img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_presset_title = (TextView) itemView.findViewById(R.id.presset_title_id);
            presset_img = (ImageView) itemView.findViewById(R.id.presset_image_id);
        }
    }
}