package com.example.harikedua;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

public class MultimediaActivity extends AppCompatActivity {

    VideoView videoObject;
    MediaController mediaControllerVideo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia);
        //inisialisasi

        videoObject = (VideoView) findViewById(R.id.video_view);

        //set videoView dimana di simpan
        videoObject.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video));
        mediaControllerVideo = new MediaController(this);
        mediaControllerVideo.setAnchorView(videoObject);
        videoObject.setMediaController(mediaControllerVideo);
        videoObject.start();

        //fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }
}
