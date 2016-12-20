package swarm_app_3.ehb.com.contour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ss
    }

    public void goToMaps(View view) {
        Intent toMaps = new Intent(this, MapsActivity.class);
        startActivity(toMaps);
        //Testd
    }
}
