package com.example.todoapp05;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoViewHolder> {

    ArrayList<String> list= new ArrayList<>();

    public TodoAdapter() {
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public TodoViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_todo, parent, false);
        return new TodoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull TodoAdapter.TodoViewHolder holder, int position) {
        holder.onFill(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class TodoViewHolder extends RecyclerView.ViewHolder {
        TextView itemTask;

        public TodoViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            itemTask = itemView.findViewById(R.id.item_task);
        }
        public void onFill(String s) {
            itemTask.setText(s);
        }
    }
}
