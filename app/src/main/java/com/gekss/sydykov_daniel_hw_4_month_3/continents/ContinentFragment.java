package com.gekss.sydykov_daniel_hw_4_month_3.continents;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainer;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gekss.sydykov_daniel_hw_4_month_3.R;
import com.gekss.sydykov_daniel_hw_4_month_3.coutry.CountryFragment;
import com.gekss.sydykov_daniel_hw_4_month_3.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class ContinentFragment extends Fragment {

    private RecyclerView rvContinent;
    private FragmentContinentBinding binding;
    private ArrayList<ContinentModel> continentList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvContinent = requireActivity().findViewById(R.id.rv_continent);
        loadData();
        ContinentAdapter adapter = new ContinentAdapter(continentList, this::onClick);
        binding.rvContinent.setAdapter(adapter);
    }

    private void loadData() {
        continentList.add(new ContinentModel("Африка","https://ru.wikipedia.org/wiki/%D0%90%D1%84%D1%80%D0%B8%D0%BA%D0%B0"));
        continentList.add(new ContinentModel("Евразия","https://ru.wikipedia.org/wiki/%D0%95%D0%B2%D1%80%D0%B0%D0%B7%D0%B8%D1%8F"));
        continentList.add(new ContinentModel("Южная Амрика","https://ru.wikipedia.org/wiki/%D0%AE%D0%B6%D0%BD%D0%B0%D1%8F_%D0%90%D0%BC%D0%B5%D1%80%D0%B8%D0%BA%D0%B0"));
        continentList.add(new ContinentModel("Северная Америка","https://ru.wikipedia.org/wiki/%D0%A1%D0%B5%D0%B2%D0%B5%D1%80%D0%BD%D0%B0%D1%8F_%D0%90%D0%BC%D0%B5%D1%80%D0%B8%D0%BA%D0%B0"));
        continentList.add(new ContinentModel("Европа","https://ru.wikipedia.org/wiki/%D0%95%D0%B2%D1%80%D0%BE%D0%BF%D0%B0"));
    }

    public void onClick(int position){
        Bundle bundle = new Bundle();
        bundle.putInt("key",position);

        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, countryFragment).addToBackStack(null).commit();
    }
}