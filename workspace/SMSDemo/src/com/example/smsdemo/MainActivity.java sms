package com.example.smsdemo;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
EditText edtSMS,edtMob;
Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtSMS=(EditText)findViewById(R.id.editText1);
        edtMob=(EditText)findViewById(R.id.editText2);
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
	   String sms=edtSMS.getText().toString();
	   String mob=edtMob.getText().toString();
	   SmsManager sm=SmsManager.getDefault();
	   sm.sendTextMessage(mob, null, sms, null, null);
	}
    
}
