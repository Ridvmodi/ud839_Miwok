package com.example.android.miwok;

import android.content.Context;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.content.ContextCompat;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;
    private MediaPlayer mediaPlayer;
    public WordAdapter(Context context, ArrayList<Word> words, int colorResource) {
        super(context, 0, words);
        mColorResourceId = colorResource;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        final Word local_word = getItem(position);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.img);
        if(local_word.getFlag()) {
            imageView.setImageResource(local_word.getImageResourceId());
        } else {
            imageView.setVisibility(imageView.GONE);
        }
        View textContainer= listItemView.findViewById(R.id.text_container);
        textContainer.setBackgroundColor(ContextCompat.getColor(getContext(), mColorResourceId));
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwokword);
        miwokTextView.setText(local_word.getMiwokTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.engword);
        defaultTextView.setText(local_word.getDefaultTranslation());
        return listItemView;
    }
}
