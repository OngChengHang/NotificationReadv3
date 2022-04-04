package com.example.notificationreadv3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ComAdapter extends RecyclerView.Adapter<ComAdapter.Viewholder> {

    private Context context;
    private ArrayList<ComModel> courseModelArrayList;

    // Constructor
    public ComAdapter(Context context, ArrayList<ComModel> courseModelArrayList) {
        this.context = context;
        this.courseModelArrayList = courseModelArrayList;
    }

    @NonNull
    @Override
    public ComAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ComAdapter.Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        ComModel model = courseModelArrayList.get(position);
        holder.UserIDTV.setText(model.getUSERID());
        holder.competitionResultTV.setText(model.getCompetitionResult());
        holder.competitionDescriptionTV.setText(model.getCompetitionDescription());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return courseModelArrayList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private TextView UserIDTV, competitionResultTV, competitionDescriptionTV;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            UserIDTV = itemView.findViewById(R.id.idTVUserID);
            competitionResultTV = itemView.findViewById(R.id.idTVCompetitionResult);
            competitionDescriptionTV = itemView.findViewById(R.id.idTVCompetitionDescription);
        }
    }
}