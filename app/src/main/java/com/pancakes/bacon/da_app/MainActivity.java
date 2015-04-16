package com.pancakes.bacon.da_app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;




public class MainActivity extends ActionBarActivity {

    public static int text_alpha;
    public static int text_red;
    public static int text_green;
    public static int text_blue;

    public int getAlpha() {
        return text_alpha;
    }

    public void setAlpha(int a) {
        this.text_alpha = a;
        Log.v("Alpha: ", Integer.toString(text_alpha)); //outputDebugString
    }

    public void setRed(int r){
        this.text_red = r;
        Log.v("Red: ", Integer.toString(text_red));
    }

    public void setGreen(int g){
        this.text_green = g;
        Log.v("Green: ", Integer.toString(text_green));
    }

    public void setBlue(int b){
        this.text_blue = b;
        Log.v("Blue: ", Integer.toString(text_blue));
    }

    public final static String EXTRA_MESSAGE = "com.pancakes.bacon.da_app.MESSAGE";
    public final static String alphaInteger = "255";
    public final static String redInteger = "255";
    public final static String greenInteger = "255";
    public final static String blueInteger = "255";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //My own functions

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String text = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, text);
        intent.putExtra(alphaInteger, Integer.toString(text_alpha));
        intent.putExtra(redInteger, Integer.toString(text_red));
        intent.putExtra(greenInteger, Integer.toString(text_green));
        intent.putExtra(blueInteger, Integer.toString(text_blue));
        Log.v("A: ", Integer.toString(text_alpha));
        Log.v("R: ", Integer.toString(text_red));
        Log.v("G: ", Integer.toString(text_green));
        Log.v("B: ", Integer.toString(text_blue));
        startActivity(intent);
    }


   public void openSearch(){
       Intent myIntent = new Intent(this, DisplayMessageActivity.class);
       myIntent.putExtra(EXTRA_MESSAGE, "Search");
       startActivity(myIntent);
   }

    public void openSettings(){
        //setContentView(R.layout.nustatymai);
        openOptions lol = new openOptions();
        //lol.doThing();

        Intent intent = new Intent(this, openOptions.class);
        startActivity(intent);
    }
}