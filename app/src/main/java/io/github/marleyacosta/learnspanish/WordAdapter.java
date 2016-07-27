package io.github.marleyacosta.learnspanish;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by maurely on 7/7/16.
 */
public class WordAdapter extends ArrayAdapter<Word>{


    private  int backgroundColor;
    public WordAdapter(Activity context, ArrayList<Word> words, int backgroundColor) {
        super(context,0 ,words);
        this.backgroundColor = backgroundColor;
    }

    @Override
    /**
     * converView is recycled view that needs to be updated
     */
    public View getView(int position, View convertView, ViewGroup parent){


            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }

            // Get the {@link AndroidFlavor} object located at this position in the list
            Word currentWord = getItem(position);

            // Find the TextView in the list_item.xml layout with the ID version_name
            TextView spanishTextView = (TextView) listItemView.findViewById(R.id.spanishList);
            // Get the version name from the current AndroidFlavor object and
            // set this text on the name TextView
            spanishTextView.setText(currentWord.getSpanishWord());

            // Find the TextView in the list_item.xml layout with the ID version_number
            TextView englishTextView = (TextView) listItemView.findViewById(R.id.englishList);
            // Get the version number from the current AndroidFlavor object and
            // set this text on the number TextView
            englishTextView.setText(currentWord.getEnglishWord());

            // Find the ImageView in the list_item.xml layout with the ID list_item_icon
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
            if(currentWord.hasImage()){
            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView
            imageView.setImageResource(currentWord.getImageId());
            imageView.setVisibility(View.VISIBLE);
            }

        else{
                imageView.setVisibility(View.GONE);
            }

            View textContainer = (View) listItemView.findViewById(R.id.text_container);

            int color = ContextCompat.getColor(getContext(),backgroundColor);

            textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
            // so that it can be shown in the ListView
            return listItemView;
        }



}
