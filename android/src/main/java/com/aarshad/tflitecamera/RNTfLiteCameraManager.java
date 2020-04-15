package com.aarshad.tflitecamera;

import android.view.View;

import androidx.appcompat.widget.AppCompatCheckBox;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ReactApplicationContext;

public class RNTfLiteCameraManager extends SimpleViewManager<View> {

    public static final String REACT_CLASS = "RNTfLiteCamera";
    ReactApplicationContext mCallerContext;

    public RNTfLiteCameraManager (ReactApplicationContext reactContext) {
        mCallerContext = reactContext;
    }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public View createViewInstance(ThemedReactContext c) {
        // TODO: Implement some actually useful functionality
        AppCompatCheckBox cb = new AppCompatCheckBox(c);
        cb.setChecked(true);
        return cb;
    }
}
