package com.example.newsapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, ArrayList<News> arrayList) {
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentListView = convertView;
        if (currentListView == null) {
            currentListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_structure, parent, false);
        }
        News news = getItem(position);
        TextView titleView = currentListView.findViewById(R.id.newsTitle);
        titleView.setText(news.getTitle());
        TextView sectionNameView = currentListView.findViewById(R.id.newsSection);
        sectionNameView.setText(news.getSectionName());
        TextView dateView = currentListView.findViewById(R.id.newsDate);
        dateView.setText(news.getDate());
        TextView timeView = currentListView.findViewById(R.id.newsTime);
        timeView.setText(news.getTime());
        TextView authorView = currentListView.findViewById(R.id.newsAuthor);
        authorView.setText("~" + news.getAuthor());
        return currentListView;
    }
}
