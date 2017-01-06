package fr.jordanlambert.championizer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView text = (TextView) findViewById(R.id.topLabel) ;
        final ImageView image = (ImageView) findViewById(R.id.imageView);

        Button randomization = (Button) findViewById(R.id.button_randomization);
        randomization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Clicked on the randomisation button", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/

                int randomNumber = ChampionRandomizer.randomizeNumber();
                String championName = ChampionRandomizer.getChampionName(randomNumber);

                text.setText(String.valueOf(championName));
                image.setImageResource(R.drawable.ezreal_5);

                System.out.println("ID :" +randomNumber);
                System.out.println("Champion name :" +championName);
            }
        });
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
