package cubex.mahesh.gallerytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Gallery;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gal = findViewById(R.id.gal1);
        gal.setAdapter(new MyAdapter(this));
    }
}
