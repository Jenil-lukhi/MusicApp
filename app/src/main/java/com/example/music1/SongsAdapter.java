package com.example.music1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class SongsAdapter extends ArrayAdapter<Song> {


    public SongsAdapter(@NonNull Context context, @NonNull List<Song> objects) {
        super(context, 0, objects);

    }

    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {


        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_song, null);


        TextView tvTitle = convertView.findViewById(R.id.tvTitle);
        TextView tvArtist = convertView.findViewById(R.id.tvArtist);


        Song song = getItem(position);
        tvTitle.setText(song.getTitle());
        tvArtist.setText(song.getArtist());

        return convertView;
    }
}
