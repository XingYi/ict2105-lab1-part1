package com.example.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            Log.d("MyActivity", "onCreate() Restoring previous state");
            /* restore state */
        } else {
            Log.d("MyActivity", "onCreate() No saved state available");
            /* initialize app */
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        TextView t = (TextView) findViewById(R.id.txtMessage);
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            t.setText("Welcome to SIT!");
            Log.d("Setting Menu", "Setting Button Pressed");
            return true;
        }
        else if (id == R.id.action_about) {
            t.setText("I am a student from SIT.");
            Log.d("Setting Menu", "About Button Pressed");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
