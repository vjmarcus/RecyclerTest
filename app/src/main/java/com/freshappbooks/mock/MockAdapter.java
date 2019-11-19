package com.freshappbooks.mock;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MockAdapter extends RecyclerView.Adapter<MockHolder> {

    private List<Mock> mockList;

    @NonNull
    @Override
    public MockHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MockHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return mockList.size();
    }
}
