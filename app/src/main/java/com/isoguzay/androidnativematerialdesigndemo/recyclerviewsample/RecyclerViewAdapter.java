package com.isoguzay.androidnativematerialdesigndemo.recyclerviewsample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
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
        private ImageView imageView;

        public CardDesingSender(View view){
            super(view);
             cardView = (CardView) view.findViewById(R.id.cardView);
             textView = (TextView) view.findViewById(R.id.textView_cardView);
             imageView = (ImageView) view.findViewById(R.id.imageView_cardMenu);
        }
    }

    @NonNull
    @Override
    public CardDesingSender onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_design,viewGroup,false);

        return new CardDesingSender(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardDesingSender cardDesingSender, int i) {
        final String city = citiesList.get(i);
        cardDesingSender.textView.setText(city);

        cardDesingSender.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"Clicked city info : "
                        + city, Toast.LENGTH_LONG).show();
            }
        });

        cardDesingSender.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(mContext,cardDesingSender.imageView);

                popupMenu.getMenuInflater().inflate(R.menu.cardview_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.action_edit:
                                Toast.makeText(mContext,"Edit city : " + city, Toast.LENGTH_LONG).show();
                                return true;
                            case R.id.action_delete:
                                Toast.makeText(mContext, "Delete city : " + city, Toast.LENGTH_LONG).show();
                                return true;
                                default:
                                    return false;
                        }
                    }
                });

                popupMenu.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return citiesList.size();
    }

}
