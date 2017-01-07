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
import java.util.Random;

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

                /*
                 * Random champion selection
                 * Only the SplashArt is displayed, selected from
                 * R.drawable.c%CHAMPION_ID% where %CHAMPION_ID% is an integer
                 * randomized from the range of champion in LOL (133 ATM so from 1 to 134)
                 */
                int randomNumberChampion = ChampionRandomizer.randomizeNumber(1, 133);
                String championSplashArt = "c"+randomNumberChampion;
                int idImage = getResources().getIdentifier("drawable/"+championSplashArt, null, getPackageName());
                /*
                 * Random string selection from strings.xml
                 * Selected on an string-array
                 */
                String[] array = getResources().getStringArray(R.array.lore);
                String randomStr = array[new Random().nextInt(array.length)];


                text.setText(randomStr);
                image.setImageResource(idImage);
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


