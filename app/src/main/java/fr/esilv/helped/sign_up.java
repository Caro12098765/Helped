package fr.esilv.helped;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        findViewById(R.id.sign_in).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sign_up.this, MainActivity.class));
            }
        });

        findViewById(R.id.signUP_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText UserName_Java = (EditText)findViewById(R.id.user_name);
                Toast.makeText(getApplicationContext(), "Welcome to HELPED "+UserName_Java.getText().toString(), Toast.LENGTH_LONG).show();
                startActivity(new Intent(sign_up.this, start.class));
            }
        });

    }
}

