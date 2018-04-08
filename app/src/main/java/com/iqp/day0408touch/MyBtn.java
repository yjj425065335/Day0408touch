package com.iqp.day0408touch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class MyBtn extends android.support.v7.widget.AppCompatButton {
    public MyBtn(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    protected boolean dispatchGenericFocusedEvent(MotionEvent event) {
        return super.dispatchGenericFocusedEvent(event);
    }
}
