package com.example.navcontroller.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navcontroller.R;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private MainAdapter adapter;
    private ArrayList<User> list;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        init(view);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new User("jojo",12,"ojojo",R.drawable.ic_launcher_background,"image"));
        list.add(new User("jojo",12,"ojojo",R.drawable.ic_launcher_background,"image"));
        list.add(new User("jojo",12,"ojojo","nonImage"));
        list.add(new User("jojo",12,"ojojo",R.drawable.ic_launcher_background,"image"));
        list.add(new User("jojo",12,"ojojo","nonImage"));
        list.add(new User("jojo",12,"ojojo",R.drawable.ic_launcher_background,"image"));
    }

    private void init(View view) {
        recyclerView = view.findViewById(R.id.mainRv);
        adapter = new MainAdapter();
        adapter.setList(list);
        recyclerView.setAdapter(adapter);
    }
}