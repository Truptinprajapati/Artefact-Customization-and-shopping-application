package com.trupti_prajapati.retailapp.view.activities;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;

import com.trupti_prajapati.retailapp.R;

public class Notifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);




        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.header);


        NotificationCompat.Builder mnotification = (NotificationCompat.Builder) new NotificationCompat.Builder(this).setAutoCancel(true)
                .setContentTitle("Online Shopping")
                .setSmallIcon(R.drawable.ic_vpn_lock_black_24dp).setLargeIcon(bitmap)
                .setContentText("Wellcome to online shopping application");

        NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
        bigPictureStyle.bigPicture(bitmap);
        mnotification.setStyle(bigPictureStyle);


        Intent i=new Intent(this,Notifications.class);

        TaskStackBuilder stackBuilder=TaskStackBuilder.create(this);
        stackBuilder.addParentStack(Notifications.class);
        stackBuilder.addNextIntent(i);
        PendingIntent pi=stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
        mnotification.setContentIntent(pi);
        NotificationManager notificationManager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(100,mnotification.build());


    }
}
