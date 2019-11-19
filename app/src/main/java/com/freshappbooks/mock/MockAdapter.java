package com.freshappbooks.mock;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.freshappbooks.recyclertest.R;

import java.util.ArrayList;
import java.util.List;

public class MockAdapter extends RecyclerView.Adapter<MockHolder> {

    private final List<Mock> mockList = new ArrayList<>();

    @NonNull
    @Override
    public MockHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext()); // create from xml view
        View view = inflater.inflate(R.layout.li_mock, parent, false);
        return new MockHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MockHolder holder, int position) {
        holder.bind(mockList.get(position));
    }


    @Override
    public int getItemCount() {
        return mockList.size();
    }

    public void addData(List<Mock> mocks) {
        mockList.addAll(mocks);
        notifyDataSetChanged();
    }
}

