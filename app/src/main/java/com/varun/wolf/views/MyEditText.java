package com.varun.wolf.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by VarunBarve on 14/03/2016.
 */
public class MyEditText extends EditText {

    public MyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (isInEditMode()) {
            return;
        }

        Typeface face = Typeface.createFromAsset(context.getAssets(), "GeosansLight.ttf");
        setTypeface(face);
    }

}


