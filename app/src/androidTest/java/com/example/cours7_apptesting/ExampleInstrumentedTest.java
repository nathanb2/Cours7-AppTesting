package com.example.cours7_apptesting;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    /**
     * On declare et instancie l'activity que l'on souhaite tester
     */
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.cours7_apptesting", appContext.getPackageName());
    }

    /**
     * pour acceder a une vue et interagire avec on utilise onview(withId(id de la vue))
     * perform pour realiser une action sur la vue
     * et check(matches(...)) pour checker ceque l'on souhaite, par exemple que la vue est affiche ou qu'elle affiche un text particulier
      */
    @Test
    public void greeterSaysHello() {
        onView(withId(R.id.AM_name_et)).perform(typeText("Steve"));
        onView(withId(R.id.AM_name_et)).perform(closeSoftKeyboard());
        onView(withId(R.id.AM_change_btn)).perform(click());
        onView(withId(R.id.AM_name_tv)).check(matches(withText("Steve")));
    }
}