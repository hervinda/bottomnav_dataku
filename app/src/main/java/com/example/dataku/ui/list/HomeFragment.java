package com.example.dataku.ui.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.dataku.R;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        ListView listview =(ListView) rootView.findViewById(R.id.list);
        final String[] items = new String[] {"Pulau Kalimantan", "Pulau Papua", "Pulau Sumatra","Pulau Jawa","Pulau Sulawesi","Pulau Halmahera","Pulau Sunda","Pulau Timor","Pulau Madura","Pulau Bali","Pulau Biak","Kepulauan Maluku","Kepulauan Riau","Kepulauan Mentawai"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity().getApplicationContext(), items[i], Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
