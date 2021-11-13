package org.lineageos.settings.kcal;

import androidx.viewpager.widget.ViewPager;
import android.view.View;

public class FadeOutTransformation implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {
        page.setTranslationX(-position*page.getWidth());
        page.setAlpha(1-Math.abs(position));
    }
}
