package ek327.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.app.AlertDialog.Builder;

public class createAnEvent extends AppCompatActivity implements View.OnClickListener {

    public EditText event;
    public EditText time;
    public EditText location;
    public EditText description;
    public EditText organizer;
    private Button create_event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_an_event);
        event = (EditText) findViewById(R.id.event_name);
        time = (EditText) findViewById(R.id.time);
        location = (EditText) findViewById(R.id.location);
        description = (EditText) findViewById(R.id.description);
        organizer = (EditText) findViewById(R.id.organizer_name);
        create_event = (Button) findViewById(R.id.create_event);

        create_event.setOnClickListener(this);
    }
    @Override
    public void onClick (View view){
        // Adding a record
        switch(view.getId()){
            case R.id.create_event:
                Intent eventIntent = new Intent(this, Event.class);
                startActivity(eventIntent);
                break;
        }
        clearText();
    }

    public void showMessage(String title, String message) {
        Builder builder = new Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

    public void clearText() {
        event.setText("");
        time.setText("");
        location.setText("");
        description.setText("");
        organizer.setText("");
        event.requestFocus();
    }
}

