package com.example.android_task_planner.di;


import com.example.android_task_planner.analytics.AnalyticsAdapter;
import com.example.android_task_planner.analytics.FlurryAnalytics;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn( SingletonComponent.class )
public class DataModule {

    @Provides
    @Singleton
    public AnalyticsAdapter provideAnalyticsAdapter() {
        return new FlurryAnalytics();
    }

}
