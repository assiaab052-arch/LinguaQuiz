package com.example.linguaquiz;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    private List<Course> courseList;
    private OnCourseClickListener listener;

    public interface OnCourseClickListener {
        void onCourseClick(Course course);
    }

    public CourseAdapter(List<Course> courseList, OnCourseClickListener listener) {
        this.courseList = courseList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_course, parent, false);
        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
        Course course = courseList.get(position);
        holder.tvTitle.setText(course.getTitle());
        holder.tvDesc.setText(course.getDescription());
        holder.tvStatusText.setText(course.isCompleted() ? "100%" : course.getProgress() + "%");
        
        if (course.isUnlocked()) {
            holder.ivStatus.setImageResource(R.drawable.baseline_person_28); // Replace with a "play" or "lesson" icon if available
            holder.ivStatus.setColorFilter(Color.parseColor("#3F51B5"));
            holder.layoutItem.setAlpha(1.0f);
            holder.itemView.setOnClickListener(v -> listener.onCourseClick(course));
            holder.pbCourse.setVisibility(View.VISIBLE);
            holder.pbCourse.setProgress(course.isCompleted() ? 100 : course.getProgress());
        } else {
            holder.ivStatus.setImageResource(R.drawable.baseline_lock_28);
            holder.ivStatus.setColorFilter(Color.parseColor("#BDBDBD"));
            holder.layoutItem.setAlpha(0.5f);
            holder.itemView.setOnClickListener(null);
            holder.pbCourse.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    static class CourseViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvDesc, tvStatusText;
        ImageView ivStatus;
        LinearLayout layoutItem;
        ProgressBar pbCourse;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvCourseTitle);
            tvDesc = itemView.findViewById(R.id.tvCourseDesc);
            tvStatusText = itemView.findViewById(R.id.tvStatusText);
            ivStatus = itemView.findViewById(R.id.ivStatus);
            layoutItem = itemView.findViewById(R.id.layoutItem);
            pbCourse = itemView.findViewById(R.id.pbCourse);
        }
    }
}
