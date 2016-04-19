package com.epicodus.madlibs;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


public class MainActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.nounEditText)).perform(typeText("cat"))
                .check(matches(withText("cat")));
    }

    @Test
    public void validateNounAdjectiveVerbAreSetCorrectly() {
        String noun = "dog";
        String adjective = "dark";
        String verb = "ran";
        onView(withId(R.id.nounEditText)).perform(typeText(noun));
        onView(withId(R.id.adjectiveEditText2)).perform(typeText(adjective));
        onView(withId(R.id.verbEditText3)).perform(typeText(verb));
        Espresso.closeSoftKeyboard();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.submitButton)).perform(click());
        onView(withId(R.id.displayMadLibsTextView)).check(matches
                (withText("Here is our story. One time a "  + noun + " with " +  adjective + " fur" + "something something something" +  verb)));
    }
}
