package net.jstyleconcept.android.progressdialog;

import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button startButton;
	private ProgressDialog progressDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_mainactivity);
		startButton=(Button)findViewById(R.id.button1);
		startButton.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				progressDialog=ProgressDialog.show(MainActivity.this,"Progress Dialog","Please wait ...");
				new Thread() {
					public void run() {
						try {
							sleep(5000);
						}
						catch(Exception e) {

						}
						progressDialog.dismiss();
					}
				}.start();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.layout_mainactivity,menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent=new Intent(MainActivity.this,SourceCodeActivity.class);
		switch(item.getOrder()) {
			case 0:
				startActivity(intent);
				break;
			case 1:
				finish();
				break;
		}
		return super.onOptionsItemSelected(item);
	}
}
