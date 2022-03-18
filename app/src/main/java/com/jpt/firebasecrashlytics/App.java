package com.jpt.firebasecrashlytics;

import android.app.Application;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        try {
            FirebaseApp.initializeApp(getApplicationContext());
            FirebaseAnalytics.getInstance(getApplicationContext());
            FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
            FirebaseCrashlytics crashlytics = FirebaseCrashlytics.getInstance();
            crashlytics.setCustomKey("current_level", 3);
            crashlytics.setCustomKey("last_UI_action", "logged_in");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
