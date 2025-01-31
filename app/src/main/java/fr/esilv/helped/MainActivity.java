package fr.esilv.helped;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*private EditText password;
    private Button btn;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        //Show or hide password button not working
        /*password = findViewById(R.id.password);
        btn = findViewById(R.id.btn5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, password.getText(), Toast.LENGTH_SHORT).show();
            }
        });*/

        findViewById(R.id.sign_up).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, sign_up.class));
            }
        });

        findViewById(R.id.signIN_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText email_java = (EditText)findViewById(R.id.email);
                Toast.makeText(getApplicationContext(), "Welcome back "+email_java.getText().toString(), Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
            }
        });


    }

}
