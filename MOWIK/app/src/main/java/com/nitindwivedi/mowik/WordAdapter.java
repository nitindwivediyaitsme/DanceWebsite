package com.nitindwivedi.mowik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public class WordAdapter extends ArrayAdapter<Word>
{
    // Resource id for  the color background for each
    private int mColorResourceId;
    public WordAdapter(Context context, ArrayList<Word> words,int ColorResourceId){
        super(context, 0, words);
        mColorResourceId=ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok text view
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the currentWord object and
        // set this text on the miwok Text view
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default text view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the currentWord object and
        // set this text on the default text view
        defaultTextView.setText(currentWord.getDefaultTranslation());
        // check if there is an image and then show it to specific places

        // Find the TextView in the list_item.xml layout with the ID Image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // set the ImageView to the image resource specified int the word class
        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
        }
        else {
            imageView.setVisibility(View.VISIBLE);
        }
        // theme
        View textContainer = listItemView.findViewById(R.id.text_container);
        // color
                int Color = ContextCompat.getColor(getContext(),mColorResourceId);
                // background
                textContainer.setBackgroundColor(Color);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
