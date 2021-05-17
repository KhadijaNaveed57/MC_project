package com.khadijanaveed.grocerystore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class home extends AppCompatActivity {

    private int[] mImage = new int[]{
            R.drawable.cokecar,R.drawable.colddrinks, R.drawable.dryfruits, R.drawable.dryfruitsandveg, R.drawable.fruits, R.drawable.groceryitems, R.drawable.watermelon
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        CarouselView carouselView = findViewById(R.id.carousel);
        carouselView.setPageCount(mImage.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImage[position]);

            }
        });
    }
}