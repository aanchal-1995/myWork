package com.example.infodemo;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener, LocationListener {
	EditText edtMob,edtSMS;
	Button btnClick;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtMob=(EditText)findViewById(R.id.editText1);
       
        btnClick=(Button)findViewById(R.id.button1);
        btnClick.setOnClickListener(this);
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		String mob=edtMob.getText().toString();
		
		
		LocationManager lm=(LocationManager)getSystemService(LOCATION_SERVICE);
		lm.requestLocationUpdates(LocationManager. GPS_PROVIDER, 0,0, this);
        String sms=edtSMS.getText().toString();
		SmsManager sm=SmsManager.getDefault();
		sm.sendTextMessage(mob, null, sms, null, null);
		
		
	}
		@Override
	public void onLocationChanged(Location l) {
		// TODO Auto-generated method stub
		if(l!=null){
			Double lng=l.getLongitude();
			Double lat=l.getLatitude();
			String str=lng+","+lat;
		}else{Toast.makeText(this, "No Location", Toast.LENGTH_LONG).show();	
		}
	}


	@Override
	public void onProviderDisabled(String arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onProviderEnabled(String arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
		// TODO Auto-generated method stub
		
	}
    
}
