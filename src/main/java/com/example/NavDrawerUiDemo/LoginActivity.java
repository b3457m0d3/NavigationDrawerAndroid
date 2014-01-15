package com.example.NavDrawerUiDemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.NavDrawerUiDemo.drawer.MainActivity;

public class LoginActivity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button button = (Button)findViewById(R.id.buttonLogin);
        button.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.buttonLogin) {
            Intent mainActivityIntent = new Intent(this, MainActivity.class);
            mainActivityIntent.putExtra("key", "value");
            this.startActivity(mainActivityIntent);
        }
    }
}
