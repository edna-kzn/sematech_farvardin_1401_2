package com.kazarian.android.sematech_farvardin_1401_2;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

public class EdnaButton extends Button {
    public EdnaButton(Context context) {
        super(context);
    }

    public EdnaButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        Typeface ednaButton = Typeface.createFromAsset(getContext().getAssets(), "Vazir-Regular.ttf");
        this.setTypeface(ednaButton);

    }

}
