package com.dongnao.ffmpegmusic;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceView;
import android.view.View;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    DavidPlayer davidPlayer;
    SurfaceView surfaceView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        surfaceView = (SurfaceView) findViewById(R.id.surface);
        davidPlayer = new DavidPlayer();
        davidPlayer.setSurfaceView(surfaceView);

    }
    public void player(View view) {
        File file = new File(Environment.getExternalStorageDirectory(), "Warcraft3_End.avi");
        davidPlayer.playJava("rtmp://live.hkstv.hk.lxdns.com/live/hks");
//        davidPlayer.playJava(file.getAbsolutePath());
    }
    public void stop(View view) {
        davidPlayer.release();
    }
}
