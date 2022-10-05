package com.example.nestedrecview;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ViewAdapter>
{
    Context context;
    List<childModelClass>childModelClassesList;

    public ChildAdapter(Context context, List<childModelClass> childModelClassesList)
    {
        this.context = context;
        this.childModelClassesList = childModelClassesList;
    }

    @NonNull
    @Override
    public ViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.child_rv_layout,parent,false);
       return new ViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewAdapter holder, int position) {
      holder.iv_child_image.setImageResource(childModelClassesList.get(position).image);
    }

    @Override
    public int getItemCount() {
        return childModelClassesList.size();
    }

    public class ViewAdapter extends RecyclerView.ViewHolder
{
   ImageView iv_child_image;
    public ViewAdapter(@NonNull View itemView)
    {
        super(itemView);
        iv_child_image = itemView.findViewById(R.id.img);
       iv_child_image.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(itemView.getContext(), "Fine !!", Toast.LENGTH_SHORT).show();
           }
       });
    }
}
}
