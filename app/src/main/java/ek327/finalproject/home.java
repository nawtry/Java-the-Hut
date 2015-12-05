package ek327.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class home extends Activity
{
    private Button buttonMap;
    private Button buttonList;
    private Button buttonEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        buttonMap = (Button) findViewById(R.id.maps);
        buttonList = (Button) findViewById(R.id.list);
        buttonEvent = (Button) findViewById(R.id.events);

    }

    public void MapsActivity(View view)
    {
        Intent resultActivity = new Intent(home.this, MapsActivity.class);
        startActivity(resultActivity);
    }

    public void List(View view)
    {
        Intent resultActivity = new Intent(home.this, List.class);
        startActivity(resultActivity);
    }

    public void createAnEvent(View view)
    {
        Intent resultActivity = new Intent(home.this, createAnEvent.class);
        startActivity(resultActivity);
    }

}
