package ryanheitner.butterknifetest;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MyApplication extends Application {
    @Override
    public void onCreate() {
        Log.e("TAG","MyApplication");
        super.onCreate();
    }

}
