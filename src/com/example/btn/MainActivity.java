package com.example.btn;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButtonView viewBt = (ButtonView) findViewById(R.id.view_bt);
		viewBt.setOnListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(MainActivity.this, "on Click !",
						Toast.LENGTH_SHORT).show();
			}
		});
	}

}
