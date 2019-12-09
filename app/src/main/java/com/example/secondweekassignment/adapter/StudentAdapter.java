package com.example.secondweekassignment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.secondweekassignment.R;
import com.example.secondweekassignment.model.Student;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyHolder> {

    List<Student> studentList;

    public StudentAdapter(List<Student> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.student_list_recyclerview,parent,false);
        MyHolder myHolder =new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        final Student student = studentList.get(position);
        holder.tName.setText(student.getName());
        holder.tEmail.setText(student.getEmail());
        holder.tPhone.setText(student.getPhone());
        holder.imageView.setImageResource(R.drawable.bird);


    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tName, tEmail, tPhone;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            tName = itemView.findViewById(R.id.textName);
            tEmail = itemView.findViewById(R.id.textEmail);
            tPhone = itemView.findViewById(R.id.textPhone);

        }
    }

}
