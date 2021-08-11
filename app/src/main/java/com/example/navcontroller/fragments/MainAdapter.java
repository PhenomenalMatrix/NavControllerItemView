package com.example.navcontroller.fragments;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navcontroller.R;

import java.util.ArrayList;


public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final int TYPE_WITH_IMAGE = 0;
    private final int TYPE_WITHOUT_IMAGE = 1;

    private ArrayList<User> list = new ArrayList<>();

    public void setList(ArrayList<User> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        int i = 0;
        if (list.get(position).getType() == "image"){
            i = TYPE_WITH_IMAGE;
        }else {
            i = TYPE_WITHOUT_IMAGE;
        }
        return i;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TYPE_WITH_IMAGE){
            View imageView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pic,parent,false);
            return new ViewHolderImg(imageView);
        }else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_without_pic,parent,false);
            return new ViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == TYPE_WITH_IMAGE){
            ((ViewHolderImg)holder).onBind(list.get(position));
        }else {
            ((ViewHolder)holder).onBind(list.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name,age,surName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameSecond);
            age = itemView.findViewById(R.id.ageSecond);
            surName = itemView.findViewById(R.id.surNameSecond);
        }

        public void onBind(User user){
            name.setText(user.getName());
            age.setText(String.valueOf(user.getAge()));
            surName.setText(user.getSurName());
        }
    }

    public  class ViewHolderImg extends RecyclerView.ViewHolder{
        private ImageView profileIv;
        private TextView nameFirst, ageFirst, surNameFirst;
        public ViewHolderImg(@NonNull View imageView) {
            super(imageView);
            profileIv = imageView.findViewById(R.id.profileIv);
            nameFirst = imageView.findViewById(R.id.nameFirst);
            ageFirst = imageView.findViewById(R.id.ageFirst);
            surNameFirst = imageView.findViewById(R.id.surNameFirst);
        }

        public  void onBind(User user){
            profileIv.setImageResource(user.getImage());
            nameFirst.setText(user.getName());
            ageFirst.setText(String.valueOf(user.getAge()));
            surNameFirst.setText(user.getSurName());
        }
    }
}
