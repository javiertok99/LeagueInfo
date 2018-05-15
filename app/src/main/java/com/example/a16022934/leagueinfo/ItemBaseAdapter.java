package com.example.a16022934.leagueinfo;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemBaseAdapter extends BaseAdapter implements Filterable {

    private ArrayList<Items> mOriginalValues; // Original Values
    private ArrayList<Items> mDisplayedValues;    // Values to be displayed
    LayoutInflater inflater;

    public ItemBaseAdapter(Context context, ArrayList<Items> mItemArrayList) {
        this.mOriginalValues = mItemArrayList;
        this.mDisplayedValues = mItemArrayList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mDisplayedValues.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder {
        LinearLayout llContainer;
        TextView tvName;
        ImageView ivImage;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        if (convertView == null) {

            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_row, null);
            holder.llContainer = convertView.findViewById(R.id.llContainer);
            holder.tvName = convertView.findViewById(R.id.tvItem);
            holder.ivImage = convertView.findViewById(R.id.ivItem);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tvName.setText(mDisplayedValues.get(position).getName());
        holder.ivImage.setImageResource(mDisplayedValues.get(position).getRes());

        holder.llContainer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), ItemDetails.class);
                Items selectedItem = mDisplayedValues.get(position);
                i.putExtra("item", selectedItem);
                v.getContext().startActivity(i);
            }
        });

        return convertView;
    }

    @Override
    public Filter getFilter() {
        Filter filter = new Filter() {

            @SuppressWarnings("unchecked")
            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

                mDisplayedValues = (ArrayList<Items>) results.values; // has the filtered values
                notifyDataSetChanged();  // notifies the data with new filtered values
            }

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults results = new FilterResults();        // Holds the results of a filtering operation in values
                ArrayList<Items> FilteredArrList = new ArrayList<>();

                if (mOriginalValues == null) {
                    mOriginalValues = new ArrayList<>(mDisplayedValues); // saves the original data in mOriginalValues
                }

                /********
                 *
                 *  If constraint(CharSequence that is received) is null returns the mOriginalValues(Original) values
                 *  else does the Filtering and returns FilteredArrList(Filtered)
                 *
                 ********/
                if (constraint == null || constraint.length() == 0) {

                    // set the Original result to return
                    results.count = mOriginalValues.size();
                    results.values = mOriginalValues;
                } else {
                    constraint = constraint.toString().toLowerCase();
                    for (int i = 0; i < mOriginalValues.size(); i++) {
                        String data = mOriginalValues.get(i).getName();
                        if (data.toLowerCase().startsWith(constraint.toString())) {
                            FilteredArrList.add(new Items(mOriginalValues.get(i).getName(), mOriginalValues.get(i).getCost(),mOriginalValues.get(i).getStats(),mOriginalValues.get(i).getPassiveAndActives(),mOriginalValues.get(i).getRes()));
                        }
                    }
                    // set the Filtered result to return
                    results.count = FilteredArrList.size();
                    results.values = FilteredArrList;
                }
                return results;
            }
        };
        return filter;
    }
}
