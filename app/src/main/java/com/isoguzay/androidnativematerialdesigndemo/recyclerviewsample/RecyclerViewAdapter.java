package com.isoguzay.androidnativematerialdesigndemo.recyclerviewsample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.isoguzay.androidnativematerialdesigndemo.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CardDesingSender>{

    private Context mContext;
    private List<String> citiesList;

    public RecyclerViewAdapter(Context mContext, List<String> citiesList) {
        this.mContext = mContext;
        this.citiesList = citiesList;
    }

    public class CardDesingSender extends RecyclerView.ViewHolder{
        private CardView cardView;
        private TextView textView;

        public CardDesingSender(View view){
            super(view);
             cardView = (CardView) view.findViewById(R.id.cardView);
             textView = (TextView) view.findViewById(R.id.textView_cardView);
        }
    }

    @NonNull
    @Override
    public CardDesingSender onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_design,viewGroup,false);

        return new CardDesingSender(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CardDesingSender cardDesingSender, int i) {
        final String city = citiesList.get(i);
        cardDesingSender.textView.setText(city);

        cardDesingSender.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"Clicked city info : "
                        + city, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return citiesList.size();
    }

}
