package com.gekss.sydykov_daniel_hw_4_month_3.continents;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.gekss.sydykov_daniel_hw_4_month_3.R;
import com.gekss.sydykov_daniel_hw_4_month_3.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {
    private ArrayList<ContinentModel> continentList = new ArrayList<>();
    private OnClick onClick;

    public ContinentAdapter(ArrayList<ContinentModel> continentList, OnClick onClick) {
        this.continentList = continentList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.onBind(continentList.get(position));
        holder.itemView.setOnClickListener(view -> {
            onClick.onClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }
}

class ContinentViewHolder extends RecyclerView.ViewHolder {
    private TextView tvName;
    private ImageView imgContinent;
    private ItemContinentBinding binding;

    public ContinentViewHolder(@NonNull View itemView) {
        super(itemView);
        this.tvName = tvName;
        this.imgContinent = imgContinent;
        this.binding = binding;
    }

    public void onBind(ContinentModel model) {
        tvName.setText(model.getName());
        Glide.with(imgContinent).load(model.getImage()).into(imgContinent);
    }
}
