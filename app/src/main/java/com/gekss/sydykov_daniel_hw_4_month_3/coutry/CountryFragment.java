package com.gekss.sydykov_daniel_hw_4_month_3.coutry;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gekss.sydykov_daniel_hw_4_month_3.R;
import com.gekss.sydykov_daniel_hw_4_month_3.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {

    private ArrayList<CountryModel> countyList = new ArrayList<>();
    private FragmentCountryBinding binding;
    private int position;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("key");
        checPosition(position);
        CountryAdapter adapter = new CountryAdapter(countyList);
        binding.rvCountry.setAdapter(adapter);
    }

    private void checPosition(int position) {
        if (position == 0) {
            loadEurope();
        } else if (position == 1) {
            loadAfrica();
        } else if (position == 2) {
            loadSouthAmerica();
        } else if (position == 3) {
            loadNouthAmerica();
        } else if (position == 4) {
            loadEvrazia();
        }
    }

    private void loadEurope() {
        countyList.add(new CountryModel("Австрия", "https://ru.wikipedia.org/wiki/%D0%A4%D0%BB%D0%B0%D0%B3_%D0%90%D0%B2%D1%81%D1%82%D1%80%D0%B8%D0%B8"));
        countyList.add(new CountryModel("Великобритания", "https://ru.wikipedia.org/wiki/%D0%A4%D0%BB%D0%B0%D0%B3_%D0%92%D0%B5%D0%BB%D0%B8%D0%BA%D0%BE%D0%B1%D1%80%D0%B8%D1%82%D0%B0%D0%BD%D0%B8%D0%B8"));
        countyList.add(new CountryModel("Бельгия", "https://www.osculati.com/ru/11706-m-031246/%D1%84%D0%BB%D0%B0%D0%B3-%D0%B1%D0%B5%D0%BB%D1%8C%D0%B3%D0%B8%D1%8F"));
        countyList.add(new CountryModel("Германия", "https://masterflag.ru/info/world-flags/flag-germanii.php"));
        countyList.add(new CountryModel("Молдавия", "https://www.mk.ru/politics/2023/11/17/zakharova-obvinila-vlasti-moldavii-v-zhelanii-otmenit-neytralnyy-status-strany.html"));
    }

    private void loadAfrica() {
        countyList.add(new CountryModel("Алжир", "https://ru.wikipedia.org/wiki/%D0%A4%D0%BB%D0%B0%D0%B3_%D0%90%D0%BB%D0%B6%D0%B8%D1%80%D0%B0"));
        countyList.add(new CountryModel("Ангола", "https://ru.wikipedia.org/wiki/%D0%A4%D0%BB%D0%B0%D0%B3_%D0%90%D0%BD%D0%B3%D0%BE%D0%BB%D1%8B"));
        countyList.add(new CountryModel("Бенин", "https://ru.wikipedia.org/wiki/%D0%91%D0%B5%D0%BD%D0%B8%D0%BD"));
        countyList.add(new CountryModel("Габон", "https://ru.wikipedia.org/wiki/%D0%A4%D0%BB%D0%B0%D0%B3_%D0%93%D0%B0%D0%B1%D0%BE%D0%BD%D0%B0"));
        countyList.add(new CountryModel("Гамбия", "https://ru.wikipedia.org/wiki/%D0%93%D0%B0%D0%BC%D0%B1%D0%B8%D1%8F"));
    }

    private void loadSouthAmerica() {
        countyList.add(new CountryModel("Аргентина", "https://travelask.ru/articles/flag-argentiny"));
        countyList.add(new CountryModel("Чили", "https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D0%BB%D0%B8"));
        countyList.add(new CountryModel("Калумбия", "https://ru.wikipedia.org/wiki/%D0%A4%D0%BB%D0%B0%D0%B3_%D0%9A%D0%BE%D0%BB%D1%83%D0%BC%D0%B1%D0%B8%D0%B8"));
        countyList.add(new CountryModel("Бразилия", "https://ru.wikipedia.org/wiki/%D0%A4%D0%BB%D0%B0%D0%B3_%D0%91%D1%80%D0%B0%D0%B7%D0%B8%D0%BB%D0%B8%D0%B8"));
        countyList.add(new CountryModel("Эквадор", "https://ru.wikipedia.org/wiki/%D0%A4%D0%BB%D0%B0%D0%B3_%D0%AD%D0%BA%D0%B2%D0%B0%D0%B4%D0%BE%D1%80%D0%B0"));

    }

        private void loadNouthAmerica(){
        countyList.add(new CountryModel("Уругвай", "https://ru.wikipedia.org/wiki/%D0%A4%D0%BB%D0%B0%D0%B3_%D0%A3%D1%80%D1%83%D0%B3%D0%B2%D0%B0%D1%8F"));
        countyList.add(new CountryModel("Перу", "https://ru.wikipedia.org/wiki/%D0%9F%D0%B5%D1%80%D1%83"));
        countyList.add(new CountryModel("Суринам", "https://ru.wikipedia.org/wiki/%D0%A1%D1%83%D1%80%D0%B8%D0%BD%D0%B0%D0%BC"));
        countyList.add(new CountryModel("Боливия", "https://ru.wikipedia.org/wiki/%D0%A4%D0%BB%D0%B0%D0%B3_%D0%91%D0%BE%D0%BB%D0%B8%D0%B2%D0%B8%D0%B8"));
        countyList.add(new CountryModel("Винисуэла", "https://ru.wikipedia.org/wiki/%D0%A4%D0%BB%D0%B0%D0%B3_%D0%92%D0%B5%D0%BD%D0%B5%D1%81%D1%83%D1%8D%D0%BB%D1%8B"));

    }

    private void loadEvrazia(){
        countyList.add(new CountryModel("Россия", "https://ru.wikipedia.org/wiki/%D0%A4%D0%BB%D0%B0%D0%B3_%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D0%B8"));
        countyList.add(new CountryModel("Армения", "https://ru.wikipedia.org/wiki/%D0%A4%D0%BB%D0%B0%D0%B3_%D0%90%D1%80%D0%BC%D0%B5%D0%BD%D0%B8%D0%B8"));
        countyList.add(new CountryModel("Кыргызстан", "https://www.advantour.com/rus/kyrgyzstan/flag.htm"));
        countyList.add(new CountryModel("Узбекистан", "https://ru.wikipedia.org/wiki/%D0%A4%D0%BB%D0%B0%D0%B3_%D0%A3%D0%B7%D0%B1%D0%B5%D0%BA%D0%B8%D1%81%D1%82%D0%B0%D0%BD%D0%B0"));
        countyList.add(new CountryModel("Таджкистан", "https://ru.wikipedia.org/wiki/%D0%A4%D0%BB%D0%B0%D0%B3_%D0%A2%D0%B0%D0%B4%D0%B6%D0%B8%D0%BA%D0%B8%D1%81%D1%82%D0%B0%D0%BD%D0%B0"));

    }
}