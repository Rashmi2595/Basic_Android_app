package com.example.nirma.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

import static com.example.nirma.myfirstapp.R.id.newPushButton;
import static com.example.nirma.myfirstapp.R.id.pushItButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /* business logic */
    TextView textView;
    Button push_it_button;
    Button new_push_button;
    Button third_button;
    //ON CREATE
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //following line brings view on top of activity
        //setContentView(R.layout.activity_main);
        // this is related to view means activity becomes a independent application

        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.textView);
        push_it_button = (Button) findViewById(R.id.pushItButton);
        new_push_button=(Button) findViewById(R.id.newPushButton);
        third_button=(Button) findViewById(R.id.third_button);
        push_it_button.setOnClickListener(this);
        new_push_button.setOnClickListener(this);
        third_button.setOnClickListener(this);
    }

    //ON START
    @Override
    protected void onStart() {
        super.onStart();

    }


    // ON RESUME
    @Override
    protected void onResume() {
        super.onResume();

    }


    //ON PAUSE
    @Override
    protected void onPause() {
        super.onPause();
    }


    //ON STOP
    @Override
    protected void onStop() {
        super.onStop();
    }



    //ON DESTROY
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    //better approach
    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.pushItButton:
                textView.setText("you clicked on FIRST button");
                    break;

            case R.id.newPushButton:
                textView.setText("you clicked on SECOND button");
                break;
            case R.id.third_button:
                textView.setText("you clicked THIRD button ");
        }

    }
}
