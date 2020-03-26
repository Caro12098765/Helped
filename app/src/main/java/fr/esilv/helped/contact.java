package fr.esilv.helped;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class contact extends AppCompatActivity {

private contact activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        this.activity = this;

        findViewById(R.id.send_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder PopUpSent = new AlertDialog.Builder(activity);
                PopUpSent.setTitle("Message sent!");
                PopUpSent.setMessage("Your message has been sent successfully.");
                PopUpSent.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Message sent!", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(contact.this, MapsActivity.class));
                    }
                });
                PopUpSent.show();
            }
        });

    }
}
