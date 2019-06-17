package com.example.test01.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.test01.Model.History;
import com.example.test01.R;

public class TotalViewHolder extends RecyclerView.ViewHolder {

    TextView total;

    public TotalViewHolder(@NonNull View itemView) {
        super(itemView);
        total = (TextView) itemView.findViewById(R.id.total);
    }
    public void setvalues(History history)
    {
        total.setText(history.getTotal());
    }
}
