package com.example.akbtugas;

import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseInstanceIDService extends FirebaseMessagingService {

    private static final String TAG = "MyFirebaseIIDService";

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.e("NEW TOKEN",s);
    }


    private void sendRegistrationToServer(String refreshedToken) {
        // TODO: Implement this method to send token to your app server.
    }
}
