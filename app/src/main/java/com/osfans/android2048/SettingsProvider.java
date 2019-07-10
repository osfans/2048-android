package com.osfans.android2048;

import android.content.Context;
import android.content.SharedPreferences;

public class SettingsProvider {
    private static final String KEY_PREFERENCES = "preferences";

    public static final String KEY_SENSITIVITY = "settings_sensitivity";
    public static final String KEY_ORDER = "settings_order";
    public static final String KEY_ROWS = "settings_rows";
    public static final String KEY_VARIETY = "settings_variety";
    public static final String KEY_INVERSE_MODE = "settings_inverse_mode";
    public static final String KEY_SYSTEM_FONT = "settings_system_font";
    public static final String KEY_CUSTOM_VARIETY = "settings_custom_variety";

    private static SharedPreferences prefs;

    public static void initPreferences(Context context) {
        prefs = context.getSharedPreferences(KEY_PREFERENCES, Context.MODE_MULTI_PROCESS);
    }

    public static int getInt(String key, int defaultValue) {
        return prefs.getInt(key, defaultValue);
    }

    public static boolean getBoolean(String key, boolean defaultValue) {
        return prefs.getBoolean(key, defaultValue);
    }

    public static String getString(String key, String defaultValue) {
        return prefs.getString(key, defaultValue);
    }

    static void putInt(String key, int value) {
        prefs.edit().putInt(key, value).apply();
    }

    static void putBoolean(String key, boolean value) {
        prefs.edit().putBoolean(key, value).apply();
    }

    static void putString(String key, String value) {
        prefs.edit().putString(key, value).apply();
    }

    /*
    static void remove(String key) {
        prefs.edit().remove(key).apply();
    }
    */

}
