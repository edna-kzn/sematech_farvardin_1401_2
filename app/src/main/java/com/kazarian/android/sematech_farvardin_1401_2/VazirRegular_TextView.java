package com.kazarian.android.sematech_farvardin_1401_2;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

public class VazirRegular_TextView extends AppCompatTextView {

    public VazirRegular_TextView(@NonNull Context context) {
        super(context);
    }

    public VazirRegular_TextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        Typeface vazirRegularTypeFace = Typeface.createFromAsset(getContext().getAssets(), "Vazir-Regular.ttf");
        this.setTypeface(vazirRegularTypeFace);
    }
}
