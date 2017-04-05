package ck.ewangmaoge.com.videoview;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mVideoView = (VideoView) findViewById(R.id.videoView);

        /**
         * 本地视频播放
         */
//        String path = "";
//        mVideoView.setVideoPath(path);


        /**
         * 网络播放
         */
        String url = "http://192.168.31.94:8080/play.mp4";
        mVideoView.setVideoURI(Uri.parse(url));

        /**
         * MediaController 提供友好的图像控制界面
         */
        MediaController controller = new MediaController(this);

        mVideoView.setMediaController(controller);

        controller.setMediaPlayer(mVideoView);


    }
}
