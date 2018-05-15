package com.example.a16022934.leagueinfo;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.util.Log;
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

public class ChampionBaseAdapter extends BaseAdapter implements Filterable {

    private ArrayList<Champions> mOriginalValues; // Original Values
    private ArrayList<Champions> mDisplayedValues;    // Values to be displayed
    LayoutInflater inflater;

    public ChampionBaseAdapter(Context context, ArrayList<Champions> mProductArrayList) {
        this.mOriginalValues = mProductArrayList;
        this.mDisplayedValues = mProductArrayList;
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
        ImageView ivFav;
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
            holder.ivFav = convertView.findViewById(R.id.ivFav);
            holder.ivImage.getLayoutParams().height = 100;
            holder.ivImage.getLayoutParams().width = 100;
            holder.ivImage.requestLayout();
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tvName.setText(mDisplayedValues.get(position).getName());
        holder.ivImage.setImageResource(mDisplayedValues.get(position).getChampionImage());
        if(mDisplayedValues.get(position).isFav()){
            holder.ivFav.setImageResource(R.drawable.starfilled);
        }else{
            holder.ivFav.setImageResource(R.drawable.star);
        }
        holder.llContainer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), ChampionDetails.class);
                Champions selectedChamp = mDisplayedValues.get(position);
                i.putExtra("champion", selectedChamp);
                String clean = selectedChamp.getName().replace(".", "").replace(" ", "").replace("-", "").replace("'", "").toLowerCase();
                int audio = getRawId(v.getContext(), clean + "select");
                if (audio != 0) {
                    MediaPlayer mp = MediaPlayer.create(v.getContext(), audio);
                    mp.start();
                    i.putExtra("champion", selectedChamp);
                    v.getContext().startActivity(i);
                }
            }
        });
        final ViewHolder finalHolder = holder;
        holder.llContainer.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Champions selectedChamp = mDisplayedValues.get(position);
                if(selectedChamp.isFav()){
                    finalHolder.ivFav.setImageResource(R.drawable.star);
                    selectedChamp.setFav(false);
                }else{
                    finalHolder.ivFav.setImageResource(R.drawable.starfilled);
                    selectedChamp.setFav(true);
                }
                return true;
            }
        });

        return convertView;
    }

    public int getRawId(Context context, String name) {
        return context.getResources().getIdentifier(name, "raw", context.getPackageName());
    }

    @Override
    public Filter getFilter() {
        Filter filter = new Filter() {

            @SuppressWarnings("unchecked")
            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

                mDisplayedValues = (ArrayList<Champions>) results.values; // has the filtered values
                notifyDataSetChanged();  // notifies the data with new filtered values
            }

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults results = new FilterResults();        // Holds the results of a filtering operation in values
                ArrayList<Champions> FilteredArrList = new ArrayList<>();

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
                            FilteredArrList.add(new Champions(mOriginalValues.get(i).getName(), mOriginalValues.get(i).getSecondName(), mOriginalValues.get(i).getChampionImage(), mOriginalValues.get(i).getSkills(), mOriginalValues.get(i).getSkillsDescription(), mOriginalValues.get(i).getRole(), mOriginalValues.get(i).isFav()));
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

    public Filter getRoles() {
        Filter filter = new Filter() {

            @SuppressWarnings("unchecked")
            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

                mDisplayedValues = (ArrayList<Champions>) results.values; // has the filtered values
                notifyDataSetChanged();  // notifies the data with new filtered values
            }

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults results = new FilterResults();        // Holds the results of a filtering operation in values
                ArrayList<Champions> FilteredArrList = new ArrayList<>();

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
                        String data = mOriginalValues.get(i).getRole();
                        if (data.toLowerCase().contains(constraint.toString())) {
                            FilteredArrList.add(new Champions(mOriginalValues.get(i).getName(), mOriginalValues.get(i).getSecondName(), mOriginalValues.get(i).getChampionImage(), mOriginalValues.get(i).getSkills(), mOriginalValues.get(i).getSkillsDescription(), mOriginalValues.get(i).getRole(), mOriginalValues.get(i).isFav()));
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
