package com.epicodus.madlibs;


import android.content.Intent;
import android.os.Build;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;

import static junit.framework.Assert.assertTrue;
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)

public class MadLibDisplayActivityTest {
    private MadLibDisplayActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MadLibDisplayActivity.class);



    }

//    @Test
//    public void checkReturnHome() {
//        activity.findViewById(R.id.homeButton).performClick();
//        TextView mainTitle = (TextView) MainActivity.findViewById(R.id.mainTitle);
////        Intent expectedIntent = new Intent(activity, MainActivity.class);
////        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
////        Intent actualIntent = shadowActivity.getNextStartedActivity();
//        assertTrue("Mad Libs".equals(mainTitle.getText().toString()));
//    }







}
