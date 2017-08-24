package com.example.listdemo;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity implements OnItemClickListener {
String[] days={
		"Mon","Tue","Wed","Thr","Fri","Sat","Sun"
};
ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        adapter=new ArrayAdapter<String>(this, R.layout.activity_main, days);
        setListAdapter(adapter);
        ListView lv=getListView();
        lv.setOnItemClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onItemClick(AdapterView<?> parent, View arg1, int position, long arg3) {
		// TODO Auto-generated method stub
		String day=parent.getItemAtPosition(position).toString();
		Toast.makeText(this, day,Toast.LENGTH_LONG).show();
	}
    
}
