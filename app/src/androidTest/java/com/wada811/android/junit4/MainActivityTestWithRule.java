package com.wada811.android.junit4;

import android.support.test.runner.AndroidJUnit4;
import com.jakewharton.test.ActivityRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.*;

@RunWith(AndroidJUnit4.class)
public class MainActivityTestWithRule {

    @Rule
    public final ActivityRule<MainActivity> activityRule = new ActivityRule<>(MainActivity.class);

    @Test
    public void checkPrecondition(){
        // MatcherAssert.assertThat(activityRule.instrumentation(), Matchers.notNullValue());
        assertThat(activityRule.instrumentation(), notNullValue());
    }

    @Test
    public void showHelloWorld(){
        // Espresso.onView(ViewMatchers.withId(R.id.textView)).check(ViewAssertions.matches(ViewMatchers.withText(R.string.hello_world)));
        onView(withId(R.id.textView)).check(matches(withText(R.string.hello_world)));
    }

}
