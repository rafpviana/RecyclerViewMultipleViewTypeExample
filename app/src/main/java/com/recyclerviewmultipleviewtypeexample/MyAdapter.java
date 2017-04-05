package com.recyclerviewmultipleviewtypeexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rafaelpinheiro on 20/02/17.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private MyDataset mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolderType1 extends RecyclerView.ViewHolder {

        public TextView mTextViewType1;

        public ViewHolderType1(View v) {
            super(v);
            mTextViewType1 =  (TextView) v.findViewById(R.id.textviewid_mytext_1);
        }
    }

    public static class ViewHolderType2 extends RecyclerView.ViewHolder {

        public TextView mTextViewType2;

        public ViewHolderType2(View v) {
            super(v);
            mTextViewType2 = (TextView) v.findViewById(R.id.textviewid_mytext_2);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(MyDataset myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // create a new view
        switch (viewType){
            case 1:
                View v1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_recyclerview_layout_1, parent, false);
                ViewHolderType1 vh1 = new ViewHolderType1(v1);
                return vh1;
            case 2:
                View v2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_recyclerview_layout_2, parent, false);
                ViewHolderType2 vh2 = new ViewHolderType2(v2);
                return vh2;
        }

        return null;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        switch (holder.getItemViewType()){
            case 1:
                // - get element from your dataset at this position
                // - replace the contents of the view with that element
                ViewHolderType1 viewHolderType1 = (ViewHolderType1) holder;
                viewHolderType1.mTextViewType1.setText(mDataset.getMyDataset().get(position).getMyData());
                break;
            case 2:
                // - get element from your dataset at this position
                // - replace the contents of the view with that element
                ViewHolderType2 viewHolderType2 = (ViewHolderType2) holder;
                viewHolderType2.mTextViewType2.setText(mDataset.getMyDataset().get(position).getMyData());
                break;
        }

    }

    @Override
    public int getItemViewType(int position) {
        return mDataset.getMyDataset().get(position).getType();
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.getMyDataset().size();
    }
}
