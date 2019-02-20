package org.pursuit.fragmentinterfaceexercise.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class SimpleViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;

    public SimpleViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = (TextView) itemView;
    }
}
