package org.pursuit.fragmentinterfaceexercise.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.pursuit.fragmentinterfaceexercise.view.SimpleViewHolder;



public class SimpleRVAdapter extends RecyclerView.Adapter<SimpleViewHolder>{
    private String[] dataSource;
    private FragmentInterface fragmentInterface;

    public SimpleRVAdapter(String[] numbers){
        dataSource = numbers;
    }

    @NonNull
    @Override
    public SimpleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = new TextView(viewGroup.getContext());
        SimpleViewHolder viewHolder = new SimpleViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleViewHolder simpleViewHolder, int i) {
        simpleViewHolder.textView.setText(dataSource[i]);
    }

    @Override
    public int getItemCount() {
        return dataSource.length;
    }

    private interface FragmentInterface {
        void toEndingFragment();
    }
}
