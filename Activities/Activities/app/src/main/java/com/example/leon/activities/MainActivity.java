package com.example.leon.activities;

import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Button uri_button;
    private Button activity_button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text_view);
        uri_button = (Button) findViewById(R.id.button);
        uri_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri url = Uri.parse("http://www.google.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
        activity_button = (Button) findViewById(R.id.button2);
        activity_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                startActivity(intent);
            }
        });
        textView.append("onCreate\n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textView.append("onRestart\n");
    }
    @Override
    protected void onStart() {
        super.onStart();
        textView.append("onStart\n");
    }
    @Override
    protected void onResume() {
        super.onResume();
        textView.append("onResume\n");
    }
    @Override
    protected void onPause() {
        textView.append("onPause\n");
        super.onPause();
    }
    @Override
    protected void onStop() {
        textView.append("onStop\n");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        textView.append("onDestroy\n");
        super.onDestroy();
    }
}
