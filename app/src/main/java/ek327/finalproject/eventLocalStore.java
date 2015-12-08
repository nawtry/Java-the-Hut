package ek327.finalproject;

/**
 * Created by tiffanywu on 12/6/15.
 */

import android.content.SharedPreferences;
import android.content.Context;

public class eventLocalStore {

    public static final String SP_NAME = "eventDetails";

    SharedPreferences eventLocalDatabase;

    public eventLocalStore(Context context) {
        eventLocalDatabase = context.getSharedPreferences(SP_NAME, 0);
    }

    public void storeUserData(Event event) {
        SharedPreferences.Editor userLocalDatabaseEditor = eventLocalDatabase.edit();
        userLocalDatabaseEditor.putString("name", event.event);
        userLocalDatabaseEditor.putString("time", event.time);
        userLocalDatabaseEditor.putString("location", event.location);
        userLocalDatabaseEditor.putString("description", event.description);
        userLocalDatabaseEditor.putString("organizer", event.organizer);
        userLocalDatabaseEditor.commit();
    }

}