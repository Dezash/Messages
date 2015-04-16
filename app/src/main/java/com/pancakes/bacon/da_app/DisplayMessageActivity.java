package com.pancakes.bacon.da_app;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        int numAlpha = Integer.parseInt(intent.getStringExtra(MainActivity.alphaInteger));
        int numRed = Integer.parseInt(intent.getStringExtra(MainActivity.redInteger));
        int numGreen = Integer.parseInt(intent.getStringExtra(MainActivity.greenInteger));
        int numBlue = Integer.parseInt(intent.getStringExtra(MainActivity.blueInteger));
        Log.v("A: ", Integer.toString(numAlpha));
        Log.v("R: ", Integer.toString(numRed));
        Log.v("G: ", Integer.toString(numGreen));
        Log.v("B: ", Integer.toString(numBlue));
        TextView textView = new TextView(this);
        textView.setTextSize(120);
        textView.setText(message);
        setContentView(textView);
        textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        textView.setTextColor(Color.argb(numAlpha, numRed, numGreen, numBlue));
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
