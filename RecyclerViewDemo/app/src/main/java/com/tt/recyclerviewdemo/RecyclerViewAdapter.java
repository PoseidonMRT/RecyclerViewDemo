package com.tt.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by tuozhaobing on 15-12-6.
 * Add Some Comment
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private Context mContext;

    public RecyclerViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public RecyclerViewAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_layout,parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ItemViewHolder holder, int position) {
        holder.textView.setText("我是RecyclerView的第"+position+"个子View(TextView)");
    }

    @Override
    public int getItemCount() {
        return 55;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public ItemViewHolder(View itemView) {
            super(itemView);
            textView = (TextView)itemView.findViewById(R.id.textview);
        }
    }
}
