package com.kazarian.android.sematech_farvardin_1401_2;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class VazirTextView extends AppCompatTextView {
    public VazirTextView(@NonNull Context context) {
        super(context);
    }

    public VazirTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        Typeface myTypeFace = Typeface.createFromAsset(getContext().getAssets(), "Vazir.ttf");
        this.setTypeface(myTypeFace);
    }


}
