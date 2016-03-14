package com.varun.wolf.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by VarunBarve on 14/03/2016.
 */
public class MyTextView extends TextView {

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (isInEditMode()) {
            return;
        }

        Typeface face = Typeface.createFromAsset(context.getAssets(), "GeosansLight.ttf");
        setTypeface(face);
    }

}

