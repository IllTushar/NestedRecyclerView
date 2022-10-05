package com.example.nestedrecview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ParentAdapter extends RecyclerView.Adapter<ParentAdapter.ViewAdapter>
{
    Context context;
    List<ParentModelClass>parentModelClasses;

    public ParentAdapter(Context context, List<ParentModelClass> parentModelClasses)
    {
        this.context = context;
        this.parentModelClasses = parentModelClasses;
    }



    @NonNull
    @Override
    public ViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.inner_rec_view,parent,false);
       return new ViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewAdapter holder, int position) {
     holder.txtView.setText(parentModelClasses.get(position).title);
     ChildAdapter childAdapter = new ChildAdapter(context,parentModelClasses.get(position).childModelClasses);
     holder.recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
     holder.recyclerView.setAdapter(childAdapter);
    }

    @Override
    public int getItemCount() {
        return parentModelClasses.size();
    }

    public class ViewAdapter extends RecyclerView.ViewHolder
{
    RecyclerView recyclerView;
    TextView txtView;
    public ViewAdapter(@NonNull View itemView)
    {
        super(itemView);
      recyclerView = itemView.findViewById(R.id.inner_rec_view);
      txtView = itemView.findViewById(R.id.text_View);

    }
}
}
