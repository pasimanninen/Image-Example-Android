package fi.ptm.imageexample;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

/**
 *
 * @author PTM
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // load image from resources
        // - get resource
        Resources res = getResources();
        // - get image from resources
        Drawable d1 = res.getDrawable(R.drawable.ptm, getTheme());
        // - find ImageView
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        // - draw image to ImageView
        imageView.setImageDrawable(d1);

        // - get image from resource
        Drawable d2 = res.getDrawable(R.drawable.castle, getTheme());
        // - set image to window background
        getWindow().setBackgroundDrawable(d2);

    }


}
