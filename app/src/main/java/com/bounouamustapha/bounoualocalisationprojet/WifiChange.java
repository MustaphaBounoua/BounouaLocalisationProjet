package com.bounouamustapha.bounoualocalisationprojet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Created by bounouamustapha on 6/11/18.
 */

public class WifiChange extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetInfo = connectivityManager.getActiveNetworkInfo();

        if (activeNetInfo != null
                && activeNetInfo.getType() == ConnectivityManager.TYPE_WIFI) {
            Toast.makeText(context, "Wifi Connecté!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Wifi Déconnecté!", Toast.LENGTH_SHORT).show();
        }
    }
}

