package com.freshappbooks.mock;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.freshappbooks.recyclertest.R;

public class MockHolder extends RecyclerView.ViewHolder {

    private TextView name;
    private TextView value;

    public MockHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.tv_name);
        value = itemView.findViewById(R.id.tv_value);
    }
}
