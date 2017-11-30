package com.example.thandiwe.buttomnavigater;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Thandiwe on 2017/08/16.
 */

public class TourRecyclerView extends RecyclerView.Adapter<TourRecyclerView.ViewHolder>{


    Context context;
    List<Tour> tourList;

    public TourRecyclerView(Context context, List<Tour> tourList) {
        this.context = context;
        this.tourList = tourList;
    }


    @Override
    public TourRecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating the layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.navigation_layout, parent, false);

        //instantiate viewHolder
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TourRecyclerView.ViewHolder holder, int position) {

        final Tour tour = tourList.get(position);

        holder.tvName.setText(tour.getName());
        holder.tvDesc.setText(tour.getDesceiption());

        holder.image1.setImageResource(tour.getImage());

        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(context,SecondActivity.class);
                intent.putExtra("name", tour);
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return tourList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvDesc;
        CardView card;
        ImageView image1;


        public ViewHolder(View itemView) {
            super(itemView);

            tvName =(TextView)itemView.findViewById(R.id.textView);
            tvDesc =(TextView)itemView.findViewById(R.id.textView2);

            card =(CardView)itemView.findViewById(R.id.card_view);

         image1 =(ImageView)itemView.findViewById(R.id.imageView2);
        }
    }
}
