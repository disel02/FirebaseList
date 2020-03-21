package com.studio1hub.app.firebasedatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext ;
    private List<Member> mData ;

    // Constructor
    public RecyclerViewAdapter(Context mContext, List<Member> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.row_item,parent,false) ;

        // Click on list item
        final MyViewHolder viewHolder = new MyViewHolder(view) ;
      /*  viewHolder.view_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(mContext, ViewItemActivity.class);    // To ViewItemActivity
                i.putExtra("anime_name",mData.get(viewHolder.getAdapterPosition()).getName());
                i.putExtra("anime_description",mData.get(viewHolder.getAdapterPosition()).getDescription());
                i.putExtra("anime_studio",mData.get(viewHolder.getAdapterPosition()).getStudio());
                i.putExtra("anime_category",mData.get(viewHolder.getAdapterPosition()).getCategorie());
                i.putExtra("anime_nb_episode",mData.get(viewHolder.getAdapterPosition()).getNb_episode());
                i.putExtra("anime_rating",mData.get(viewHolder.getAdapterPosition()).getRating());
                i.putExtra("anime_img",mData.get(viewHolder.getAdapterPosition()).getImage_url());
                mContext.startActivity(i);
            }
        });
      */  return viewHolder;


    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        // set data to list item
        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_city.setText(mData.get(position).getCity());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        // Define
        TextView tv_name ;
        TextView tv_city;

        LinearLayout view_container;

        public MyViewHolder(View itemView) {
            super(itemView);

            // ViewHolder
            view_container = itemView.findViewById(R.id.container);
            tv_name = itemView.findViewById(R.id.tvname);
            tv_city = itemView.findViewById(R.id.tvcity);
        }
    }
}
