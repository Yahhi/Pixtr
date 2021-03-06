package com.tbg.pixtr.utils.misc;

/**
 * Created by kausthubhadhikari on 25/12/17.
 */

public class AppConstants {
    public static final String BASE_URL = "https://api.unsplash.com";
    public static final String CLIENT_ID = "356aadba611818f7901af19e6a044f414474fc7dd3ea2208f40c083b62e4ece3";
    public static final String CLIENT_ID_KEY = "client_id";
    public static final String PAGE_KEY = "page";
    public static final String RANDOM_COLLECTION_ID_KEY = "collections";
    public static final String RANDOM_HEIGHT_KEY = "h";
    public static final String RANDOM_WIDTH_KEY = "w";
    public static final int HEADER_ITEM_TYPE = 0;
    public static final int ITEM_TYPE = 1;
    public static final int TIMEOUT_TIME = 15000;
    public static final String INTENT_KEY_COLLECTION_ID = "COLLECTION_ID";
    public static final String INTENT_KEY_COLLECTION_DATA = "COLLECTION_DATA";
    public static final String INTENT_DETAILS_DATA = "DETAIL_DATA";
    public static final int REQUEST_DOWNLOAD_PERMISSION = 102;
    public static final int REQUEST_SET_WALLPAPAER_PERMISSION = 101;
    public static final String APP_DOWNLOAD_FOLDER = "Pixtr";
    public static final String UTM_PARAMS = "?utm_source=pixtr&utm_medium=referral&utm_campaign=api-credit";
    public static final String CUSTOM_FONT_FAMILY = "sans-serif";
    public static final String DATA_TYPE = "image/jpg";
    public static final String MIME_TYPE = "mimeType";
    public static final int WALLPAPER_INTENT_REQUEST_CODE = 103;
    public static final String PIXTR_PREF_KEY = "PIXTR_PREFS";
    public static final String SHARED_PREF_AUTO_UPDATE_ID = "AUTO_UPDATE_ID";
    public static final int QUALITY_KEY_RAW = 0;
    public static final int QUALITY_KEY_FULL = 1;
    public static final int QUALITY_KEY_REG = 2;
    public static final int QUALITY_KEY_SMALL = 3;
    public static final int QUALITY_KEY_THUMB = 4;
    public static final String SHARED_PREF_LOAD = "LOAD_QUALITY";
    public static final String SHARED_PREF_WALLPAPER = "WALLPAPER_QUALITY";
    public static final String SHARED_PREF_DOWNLOAD = "DOWNLOAD_QUALITY";
    public static final String SHARED_PREF_TUTORIAL = "TUTORIAL_COLLECTION";
    public static final int SPLASH_SCREEN_TIME = 2900;
    public static final int JOB_FLEX_HOURS = 1;
    public static final int JOB_PERIODIC_HOURS = 24;

    public enum QUALITY_FLAGS {
        WALLPAPER,
        LOAD,
        DOWNLOAD
    }

    ;
}
