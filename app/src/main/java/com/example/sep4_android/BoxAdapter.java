package com.example.sep4_android;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sep4_android.entities.Box;
import com.example.sep4_android.rest.ServiceGenerator;
import com.example.sep4_android.rest.interfaces.BoxApi;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BoxAdapter extends RecyclerView.Adapter<BoxAdapter.ViewHolder> {

    private ArrayList<Box> boxes;
    private OnClickListener onClickListener;

    BoxAdapter(ArrayList<Box> boxes) {
        this.boxes = boxes;
    }

    public void setOnClickListener(OnClickListener listener) {
        this.onClickListener = listener;
    }

    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.box_list_item, parent, false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.name.setText(boxes.get(position).getName());
        //viewHolder.icon.setImageResource(boxes.get(position).getDescription());
    }

    public int getItemCount() {
        return boxes.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView icon;

        ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.box_name);
            //icon = itemView.findViewById(R.id.box_icon);
            itemView.setOnClickListener(v -> {
                onClickListener.onClick(boxes.get(getBindingAdapterPosition()));
            });
        }
    }

    public void getBox(String id)
    {
        BoxApi boxApi = ServiceGenerator.getBoxApi();
        Call<List<Box>> call = boxApi.getBox(id);
        call.enqueue(new Callback<List<Box>>() {
            @Override
            public void onResponse(Call<List<Box>> call, Response<List<Box>> response) {
                if(response.isSuccessful())
                {

                }
            }

            @Override
            public void onFailure(Call<List<Box>> call, Throwable t) {
                Log.i("Retrofit", "Something went wrong :(");

            }
        });
    }

    public interface OnClickListener {
        void onClick(Box box);
    }
}