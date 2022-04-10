package com.kazarian.android.sematech_farvardin_1401_2;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class VazirBoldTextView extends AppCompatTextView {
    public VazirBoldTextView(@NonNull Context context) {
        super(context);
    }

    public VazirBoldTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        Typeface myVazirBold = Typeface.createFromAsset(getContext().getAssets(), "Vazir-SemiBold.ttf");

        this.setTypeface(myVazirBold);
    }
}
