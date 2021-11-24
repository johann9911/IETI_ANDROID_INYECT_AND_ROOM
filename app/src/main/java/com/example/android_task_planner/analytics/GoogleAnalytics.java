package com.example.android_task_planner.analytics;

import android.util.Log;

import java.util.Map;

public class GoogleAnalytics implements AnalyticsAdapter{

    @Override
    public void report(String name, Map<String, String> data) {
        Log.d("developer","Report GoogleAnalytics: "+name);
    }
}
