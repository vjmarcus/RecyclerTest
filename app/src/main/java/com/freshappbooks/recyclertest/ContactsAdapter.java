package com.freshappbooks.recyclertest;

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.freshappbooks.mock.MockHolder;

public class ContactsAdapter extends RecyclerView.Adapter<MockHolder> {

    private Cursor cursor;

    @NonNull
    @Override
    public MockHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext()); // create from xml view
        View view = inflater.inflate(R.layout.li_mock, parent, false);
        return new MockHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MockHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return cursor!= null ? cursor.getCount() : 0;
    }

    public void swapCursor(Cursor cursor) {
        if (cursor != null && cursor != this.cursor) {
            if (this.cursor != null) this.cursor.close();
            this.cursor = cursor;
            notifyDataSetChanged();
        }
    }
}
