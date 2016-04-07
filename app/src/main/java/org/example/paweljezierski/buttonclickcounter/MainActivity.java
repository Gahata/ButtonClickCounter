package org.example.paweljezierski.buttonclickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button ourButton1;
    private Button ourButton2;
    private Button ourButton3;
    private Button ourButton4;
    private TextView ourMessage1;
    private TextView ourMessage2;
    private int numTimesClicked1 = 0;
    private int numTimesClicked2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ourButton1 = (Button)findViewById(R. id.oneplus);
        ourMessage1 = (TextView) findViewById(R. id.textView1);
        View.OnClickListener ourOnClickListener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numTimesClicked1 = numTimesClicked1 + 1;
                ourMessage1.setText("Player One: " + numTimesClicked1);
            }
        };

        ourButton1.setOnClickListener(ourOnClickListener1);

        ourButton2 = (Button)findViewById(R. id.oneminus);

        View.OnClickListener ourOnClickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numTimesClicked1 = numTimesClicked1 - 1;
                ourMessage1.setText("Player One: " + numTimesClicked1);
            }
        };

        ourButton2.setOnClickListener(ourOnClickListener2);

        ourButton3 = (Button)findViewById(R. id.twoplus);
        ourMessage2 = (TextView) findViewById(R. id.textView2);
        View.OnClickListener ourOnClickListener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numTimesClicked2 = numTimesClicked2 + 1;
                ourMessage2.setText("Player Two: " + numTimesClicked2);
            }
        };

        ourButton3.setOnClickListener(ourOnClickListener3);

        ourButton4 = (Button)findViewById(R. id.twominus);

        View.OnClickListener ourOnClickListener4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numTimesClicked2 = numTimesClicked2 - 1;
                ourMessage2.setText("Player Two: " + numTimesClicked2);
            }
        };

        ourButton4.setOnClickListener(ourOnClickListener4);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast toastMessage = Toast.makeText(this, ourMessage1.getText(), Toast.LENGTH_LONG);
            toastMessage.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
