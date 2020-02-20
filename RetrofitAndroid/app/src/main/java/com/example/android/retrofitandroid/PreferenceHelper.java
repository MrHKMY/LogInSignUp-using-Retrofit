package com.example.android.retrofitandroid;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Hakimi on 19/2/2020.
 */
public class PreferenceHelper {

    private final String INTRO = "intro";
    private final String NAME = "name";
    private final String EMAIL = "email";
    private SharedPreferences app_prefs;
    private Context context;

    public PreferenceHelper (Context context) {
        app_prefs = context.getSharedPreferences("shared", Context.MODE_PRIVATE);
        this.context = context;
    }

    public void putIsLogin(boolean loginorout) {
        SharedPreferences.Editor editor = app_prefs.edit();
        editor.putBoolean(INTRO,loginorout);
        editor.commit();
    }

    public boolean getIsLogin() {
        return app_prefs.getBoolean(INTRO,false);
    }

    public void putName(String loginorout) {
        SharedPreferences.Editor edit = app_prefs.edit();
        edit.putString(NAME, loginorout);
        edit.commit();
    }
    public String getName() {
        return app_prefs.getString(NAME, "");
    }

    public void putEmail(String loginorout) {
        SharedPreferences.Editor edit = app_prefs.edit();
        edit.putString(EMAIL, loginorout);
        edit.commit();
    }
    public String getEmail() {
        return app_prefs.getString(EMAIL, "");
    }
}
