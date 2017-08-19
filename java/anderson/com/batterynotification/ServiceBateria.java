package anderson.com.batterynotification;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.support.v7.app.NotificationCompat;
import android.widget.Toast;

public class ServiceBateria extends Service {

    private boolean isRunning;
    private Context context;
    private Thread segundoPlanoThread;
    BroadCastBateria broadCastBateria = new BroadCastBateria();

    public ServiceBateria() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        this.context = this;
        this.isRunning = false;
        this.segundoPlanoThread = new Thread(myTask);
    }

    private Runnable myTask = new Runnable() {
        @Override
        public void run() {
            System.out.println("service is running");
            registerReceiver(broadCastBateria, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        }
    };



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        if(!this.isRunning){
            this.isRunning = true;
            this.segundoPlanoThread.start();
        }

        return START_STICKY;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.isRunning = false;
        unregisterReceiver(broadCastBateria);
        broadCastBateria.getmNotificationManager().cancelAll();
        Toast.makeText(this, "Battery notification is OFF", Toast.LENGTH_SHORT).show();
    }
}
