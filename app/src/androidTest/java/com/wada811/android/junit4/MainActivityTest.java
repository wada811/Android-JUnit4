package com.wada811.android.junit4;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity activity;

    public MainActivityTest(){
        super(MainActivity.class);
    }

    @Before
    public void setUp() throws Exception{
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        activity = getActivity();
    }

    @After
    public void tearDown() throws Exception{
        super.tearDown();
    }

    @Test
    public void checkPrecondition(){
        MatcherAssert.assertThat(activity, Matchers.notNullValue());
        MatcherAssert.assertThat(getInstrumentation(), Matchers.notNullValue());
    }

}
