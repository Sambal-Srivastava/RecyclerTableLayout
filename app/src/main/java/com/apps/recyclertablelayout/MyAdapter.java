package com.apps.recyclertablelayout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private List<Model_Item> list;

    public Context getmContext() {
        return mContext;
    }

    private Context mContext;
    public MyAdapter(List<Model_Item> list, Context context) {
        this.list = list;
        //your code.
        this.mContext = context;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder viewHolder, int i) {

        Model_Item model_item = list.get(i);

        viewHolder.title1.setText(model_item.getTitle1());
        viewHolder.title2.setText(model_item.getTitle2());
        viewHolder.des1.setText(model_item.getDes1());
        viewHolder.des2.setText(model_item.getDes2());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder   {

        public TextView title1, des1, title2, des2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title1 = itemView.findViewById(R.id.TextView01);
            des1 = itemView.findViewById(R.id.TextView02);
            title2 = itemView.findViewById(R.id.TextView03);
            des2 = itemView.findViewById(R.id.TextView04);
        }
    }

    public void removeItem(int position) {
        list.remove(position);
        notifyItemRemoved(position);
    }

    public void restoreItem(Model_Item item, int position) {
        list.add(position, item);
        notifyItemInserted(position);
    }

    public List<Model_Item> getData() {
        return list;
    }
}