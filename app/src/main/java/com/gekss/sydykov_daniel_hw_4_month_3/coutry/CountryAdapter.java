package com.gekss.sydykov_daniel_hw_4_month_3.coutry;

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

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {

    private ArrayList<CountryModel> countryList = new ArrayList<>();

    public CountryAdapter(ArrayList<CountryModel> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.onBind(countryList.get(position));
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
}
class CountryViewHolder extends RecyclerView.ViewHolder{
    private TextView tvName;
    private ImageView imgContinent;
    private ItemContinentBinding binding;

    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        this.tvName = tvName;
        this.imgContinent = imgContinent;
        this.binding = binding;
    }

    public void onBind(CountryModel model) {
        tvName.setText(model.getName());
        Glide.with(imgContinent).load(model.getImage()).into(imgContinent);
    }
}
