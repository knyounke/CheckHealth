package com.example.knyou.checkhealth;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;

public class Notification{
    private static final int NOTIFICATION_TO_OPEN_ACTIVITY = 9;

    public static void openActivityNotification(Context context)
    {


        NotificationCompat.Builder nc = new NotificationCompat.Builder(context);
        NotificationManager nm = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
       /*
       need to connect this code
       Intent notifyIntent = new Intent(context.HomeScreen.class);
       notifyIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
       PendingIntent pendingIntent = PendingIntent.getActivity(context,0,notifyIntent,PendingIntent.FLAG_UPDATE_CURRENT); */
        nc.setSmallIcon(R.mipmap.ic_launcher);
        nc.setAutoCancel(true);
        nc.setContentTitle("Appointment Notification");
        nc.setContentText("Click for more information and to see dates for scheduling.");
        nm.notify(NOTIFICATION_TO_OPEN_ACTIVITY, nc.build());
    }

}
//
//to generate a notification, write:
/* Notification.openActivityNotification(getApplicationContext()); */
/* Things that need to be done: set a default small icon */