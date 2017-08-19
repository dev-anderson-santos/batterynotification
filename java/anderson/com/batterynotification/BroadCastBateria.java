package anderson.com.batterynotification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.util.Log;

/**
 * Created by anderson.santos on 12/12/2016.
 */

public class BroadCastBateria extends BroadcastReceiver {

    private int level;
    private static NotificationManager mNotificationManager;
    private int notifyID = 357;

    @Override
    public void onReceive(Context context, Intent intent) {

        notification(context, intent, "Battery Notification", "Click to open the app");
    }

    public static NotificationManager getmNotificationManager() {
        return mNotificationManager;
    }

    public void notification(Context context, Intent intent, String msgTitle, String msgContext) {
        level = intent.getIntExtra("level", 0);

        PendingIntent notificIntent = PendingIntent.getActivity(context, 0, new Intent(context, MainActivity.class), 0);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context);

        mBuilder.setContentTitle(msgTitle);
        mBuilder.setContentText(msgContext);
        mBuilder.setPriority(NotificationCompat.PRIORITY_MAX);

        mBuilder.setColor(Color.parseColor("#5D4037"));
        mBuilder.setAutoCancel(false);
        mBuilder.setVisibility(NotificationCompat.VISIBILITY_SECRET);
        mBuilder.setContentIntent(notificIntent);
        mBuilder.setOngoing(true);

        mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        changeIconStats(mBuilder);

    }


    private void changeIconStats(NotificationCompat.Builder mBuilder) {
        switch (level) {
            case 1:
                mBuilder.setSmallIcon(R.drawable.ic_stat_01);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 2:
                mBuilder.setSmallIcon(R.drawable.ic_stat_02);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 3:
                mBuilder.setSmallIcon(R.drawable.ic_stat_03);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 4:
                mBuilder.setSmallIcon(R.drawable.ic_stat_04);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 5:
                mBuilder.setSmallIcon(R.drawable.ic_stat_05);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 6:
                mBuilder.setSmallIcon(R.drawable.ic_stat_06);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 7:
                mBuilder.setSmallIcon(R.drawable.ic_stat_07);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 8:
                mBuilder.setSmallIcon(R.drawable.ic_stat_08);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 9:
                mBuilder.setSmallIcon(R.drawable.ic_stat_09);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 10:
                mBuilder.setSmallIcon(R.drawable.ic_stat_10);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 11:
                mBuilder.setSmallIcon(R.drawable.ic_stat_11);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 12:
                mBuilder.setSmallIcon(R.drawable.ic_stat_12);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 13:
                mBuilder.setSmallIcon(R.drawable.ic_stat_13);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 14:
                mBuilder.setSmallIcon(R.drawable.ic_stat_14);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 15:
                mBuilder.setSmallIcon(R.drawable.ic_stat_15);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 16:
                mBuilder.setSmallIcon(R.drawable.ic_stat_16);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 17:
                mBuilder.setSmallIcon(R.drawable.ic_stat_17);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 18:
                mBuilder.setSmallIcon(R.drawable.ic_stat_18);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 19:
                mBuilder.setSmallIcon(R.drawable.ic_stat_19);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 20:
                mBuilder.setSmallIcon(R.drawable.ic_stat_20);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;

            case 21:
                mBuilder.setSmallIcon(R.drawable.ic_stat_21);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 22:
                mBuilder.setSmallIcon(R.drawable.ic_stat_22);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 23:
                mBuilder.setSmallIcon(R.drawable.ic_stat_23);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 24:
                mBuilder.setSmallIcon(R.drawable.ic_stat_24);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 25:
                mBuilder.setSmallIcon(R.drawable.ic_stat_25);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 26:
                mBuilder.setSmallIcon(R.drawable.ic_stat_26);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 27:
                mBuilder.setSmallIcon(R.drawable.ic_stat_27);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 28:
                mBuilder.setSmallIcon(R.drawable.ic_stat_28);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 29:
                mBuilder.setSmallIcon(R.drawable.ic_stat_29);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 30:
                mBuilder.setSmallIcon(R.drawable.ic_stat_30);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 31:
                mBuilder.setSmallIcon(R.drawable.ic_stat_31);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 32:
                mBuilder.setSmallIcon(R.drawable.ic_stat_32);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 33:
                mBuilder.setSmallIcon(R.drawable.ic_stat_33);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 34:
                mBuilder.setSmallIcon(R.drawable.ic_stat_34);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 35:
                mBuilder.setSmallIcon(R.drawable.ic_stat_35);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 36:
                mBuilder.setSmallIcon(R.drawable.ic_stat_36);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 37:
                mBuilder.setSmallIcon(R.drawable.ic_stat_37);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 38:
                mBuilder.setSmallIcon(R.drawable.ic_stat_38);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 39:
                mBuilder.setSmallIcon(R.drawable.ic_stat_39);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 40:
                mBuilder.setSmallIcon(R.drawable.ic_stat_40);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 41:
                mBuilder.setSmallIcon(R.drawable.ic_stat_41);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 42:
                mBuilder.setSmallIcon(R.drawable.ic_stat_42);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 43:
                mBuilder.setSmallIcon(R.drawable.ic_stat_43);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 44:
                mBuilder.setSmallIcon(R.drawable.ic_stat_44);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 45:
                mBuilder.setSmallIcon(R.drawable.ic_stat_45);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 46:
                mBuilder.setSmallIcon(R.drawable.ic_stat_46);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 47:
                mBuilder.setSmallIcon(R.drawable.ic_stat_47);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 48:
                mBuilder.setSmallIcon(R.drawable.ic_stat_48);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 49:
                mBuilder.setSmallIcon(R.drawable.ic_stat_49);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 50:
                mBuilder.setSmallIcon(R.drawable.ic_stat_50);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 51:
                mBuilder.setSmallIcon(R.drawable.ic_stat_51);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 52:
                mBuilder.setSmallIcon(R.drawable.ic_stat_52);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 53:
                mBuilder.setSmallIcon(R.drawable.ic_stat_53);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 54:
                mBuilder.setSmallIcon(R.drawable.ic_stat_54);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 55:
                mBuilder.setSmallIcon(R.drawable.ic_stat_55);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 56:
                mBuilder.setSmallIcon(R.drawable.ic_stat_56);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 57:
                mBuilder.setSmallIcon(R.drawable.ic_stat_57);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 58:
                mBuilder.setSmallIcon(R.drawable.ic_stat_58);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 59:
                mBuilder.setSmallIcon(R.drawable.ic_stat_59);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 60:
                mBuilder.setSmallIcon(R.drawable.ic_stat_60);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 61:
                mBuilder.setSmallIcon(R.drawable.ic_stat_61);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 62:
                mBuilder.setSmallIcon(R.drawable.ic_stat_62);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 63:
                mBuilder.setSmallIcon(R.drawable.ic_stat_63);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 64:
                mBuilder.setSmallIcon(R.drawable.ic_stat_64);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 65:
                mBuilder.setSmallIcon(R.drawable.ic_stat_65);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 66:
                mBuilder.setSmallIcon(R.drawable.ic_stat_66);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 67:
                mBuilder.setSmallIcon(R.drawable.ic_stat_67);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 68:
                mBuilder.setSmallIcon(R.drawable.ic_stat_68);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 69:
                mBuilder.setSmallIcon(R.drawable.ic_stat_69);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 70:
                mBuilder.setSmallIcon(R.drawable.ic_stat_70);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;

            case 71:
                mBuilder.setSmallIcon(R.drawable.ic_stat_71);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 72:
                mBuilder.setSmallIcon(R.drawable.ic_stat_72);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 73:
                mBuilder.setSmallIcon(R.drawable.ic_stat_73);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 74:
                mBuilder.setSmallIcon(R.drawable.ic_stat_74);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 75:
                mBuilder.setSmallIcon(R.drawable.ic_stat_75);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 76:
                mBuilder.setSmallIcon(R.drawable.ic_stat_76);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 77:
                mBuilder.setSmallIcon(R.drawable.ic_stat_77);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 78:
                mBuilder.setSmallIcon(R.drawable.ic_stat_78);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 79:
                mBuilder.setSmallIcon(R.drawable.ic_stat_79);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 80:
                mBuilder.setSmallIcon(R.drawable.ic_stat_80);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 81:
                mBuilder.setSmallIcon(R.drawable.ic_stat_81);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 82:
                mBuilder.setSmallIcon(R.drawable.ic_stat_82);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 83:
                mBuilder.setSmallIcon(R.drawable.ic_stat_83);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 84:
                mBuilder.setSmallIcon(R.drawable.ic_stat_84);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 85:
                mBuilder.setSmallIcon(R.drawable.ic_stat_85);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 86:
                mBuilder.setSmallIcon(R.drawable.ic_stat_86);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 87:
                mBuilder.setSmallIcon(R.drawable.ic_stat_87);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 88:
                mBuilder.setSmallIcon(R.drawable.ic_stat_88);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 89:
                mBuilder.setSmallIcon(R.drawable.ic_stat_89);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 90:
                mBuilder.setSmallIcon(R.drawable.ic_stat_90);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 91:
                mBuilder.setSmallIcon(R.drawable.ic_stat_91);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 92:
                mBuilder.setSmallIcon(R.drawable.ic_stat_92);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 93:
                mBuilder.setSmallIcon(R.drawable.ic_stat_93);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 94:
                mBuilder.setSmallIcon(R.drawable.ic_stat_94);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 95:
                mBuilder.setSmallIcon(R.drawable.ic_stat_95);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 96:
                mBuilder.setSmallIcon(R.drawable.ic_stat_96);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 97:
                mBuilder.setSmallIcon(R.drawable.ic_stat_97);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 98:
                mBuilder.setSmallIcon(R.drawable.ic_stat_98);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 99:
                mBuilder.setSmallIcon(R.drawable.ic_stat_99);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;
            case 100:
                mBuilder.setSmallIcon(R.drawable.ic_stat_100);
                mNotificationManager.notify(notifyID, mBuilder.build());

                break;

        }
    }
}
