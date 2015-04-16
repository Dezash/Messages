package com.pancakes.bacon.da_app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Gabrielius on 2015-02-18.
 */
public class openOptions extends ActionBarActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nustatymai);
        /*TextView textView = new TextView(this);
        textView.setTextSize(120);
        textView.setText("hello");
        setContentView(textView); */
    }

    public void setOptions(View view) {

        EditText aEdit = (EditText) findViewById(R.id.editAlpha);
        EditText rEdit = (EditText) findViewById(R.id.editRed);
        EditText gEdit = (EditText) findViewById(R.id.editGreen);
        EditText bEdit = (EditText) findViewById(R.id.editBlue);

        int num = Integer.parseInt(aEdit.getText().toString());
        int num2 = Integer.parseInt(rEdit.getText().toString());
        int num3 = Integer.parseInt(gEdit.getText().toString());
        int num4 = Integer.parseInt(bEdit.getText().toString());

        Log.v("Alpha: ", Integer.toString(num));
        Log.v("Red: ", Integer.toString(num2));
        Log.v("Green: ", Integer.toString(num3));
        Log.v("Blue: ", Integer.toString(num4));

        MainActivity lol = new MainActivity();
        lol.setAlpha(num);
        lol.setRed(num2);
        lol.setGreen(num3);
        lol.setBlue(num4);
    }


}
