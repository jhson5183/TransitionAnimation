package com.example.int_jhson5183.transition;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class ActivityB extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        View view = findViewById(R.id.fab_b);
        view.setTransitionName(MainActivity.SHARE_VIEW_NAME);
    }
}
