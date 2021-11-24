package com.example.android_task_planner.analytics;

import java.util.Map;

public interface AnalyticsAdapter {

    void report(String name, Map<String, String> data);
}
