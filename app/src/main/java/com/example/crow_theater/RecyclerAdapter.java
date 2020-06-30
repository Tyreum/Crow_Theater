package com.example.crow_theater;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    ArrayList<MovieDescription> arrayList = new ArrayList<>();

    public RecyclerAdapter(ArrayList<MovieDescription> arrayList) {

        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.Name.setText((CharSequence) arrayList.get(position).getTxtNameReg());
        holder.Description.setText((CharSequence) arrayList.get(position).getTxtDescriptionReg());
        holder.Grade.setText((CharSequence) arrayList.get(position).getTxtGradeReg());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView Name, Description, Grade;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Name = itemView.findViewById(R.id.txtNameReg);
            Description = itemView.findViewById(R.id.txtDescriptionReg);
            Grade = itemView.findViewById(R.id.txtGradeReg);
        }
    }
}
