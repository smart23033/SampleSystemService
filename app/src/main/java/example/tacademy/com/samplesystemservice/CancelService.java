package example.tacademy.com.samplesystemservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Tacademy on 2016-08-17.
 */
public class CancelService extends Service{

    public CancelService() {
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        int count = intent.getIntExtra("count",0);
        Toast.makeText(this,"cancel : " + count, Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }
}
