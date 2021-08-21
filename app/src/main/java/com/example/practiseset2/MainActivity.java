package com.example.practiseset2;



import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView text1=(TextView)findViewById(R.id.menu_item_1);
        String msg1=text1.getText().toString();
        Log.v("MainActivity", msg1);
        // Find second menu item TextView and print the text to the logs
        TextView text2=(TextView)findViewById(R.id.menu_item_2);
        String msg2=(String)text2.getText();
        Log.v("MainActivity", msg2);
        // Find third menu item TextView and print the text to the logs
        TextView text3=(TextView)findViewById(R.id.menu_item_3);
        String msg3=text3.getText().toString();
        Log.v("MainActivity", msg3);
    }
}