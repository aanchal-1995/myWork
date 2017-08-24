package com.example.mediademo;

import java.io.IOException;

import android.R;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
Button btnPlay,btnStop;
MediaPlayer m;
String path=Environment.getExternalStorageDirectory()+"/mysong.mp3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay=(Button)findViewById(R.id.button1);
        btnStop=(Button)findViewById(R.id.button2);
        btnPlay.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        
    }


   

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch( v.getId()){
		case R.id.button1:
			try {
				startMedia();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case R.id.button2:
		KillMedia();
		break;
		}
	}


	private void KillMedia() {
		// TODO Auto-generated method stub
		if(m!=null){m.release();
			
		}
	}


	private void startMedia() throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
		// TODO Auto-generated method stub
		KillMedia();
		m=new MediaPlayer();
		m.setDataSource(path);
		m.prepare();
		m.start();
	}
    
}
