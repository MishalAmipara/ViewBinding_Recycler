package com.example.viewbinding_recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewbinding_recycler.databinding.ActivityMainBinding;
import com.example.viewbinding_recycler.databinding.CategoryListItemBinding;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CategoryHolder>
{
    MainActivity mainActivity;
    int[] img_arr;
    String[] cat_name_arr;

    public MyAdapter(MainActivity mainActivity, int[] img_arr, String[] cat_name_arr) {
        this.mainActivity = mainActivity;
        this.img_arr = img_arr;
        this.cat_name_arr = cat_name_arr;
    }

    @NonNull
    @Override
    public MyAdapter.CategoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CategoryListItemBinding itemBinding= CategoryListItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        //CategoryHolder holder=new CategoryHolder(itemBinding.getRoot());
        return new CategoryHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.CategoryHolder holder, int position) {
        holder.imageView.setImageResource(img_arr[position]);
        holder.textView.setText(""+cat_name_arr[position]);
    }

    @Override
    public int getItemCount() {
        return cat_name_arr.length;
    }
    public class CategoryHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public CategoryHolder(@NonNull CategoryListItemBinding itemView) {
            super(itemView.getRoot());
            imageView=itemView.categoryItemImg;
            textView=itemView.categoryItemText;

        }
    }
}
