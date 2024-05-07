package com.example.b1;


import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class uITest {
  @Rule
    public ActivityScenarioRule<MainActivity>activityActivityScenarioRule=new ActivityScenarioRule<>(MainActivity.class);
  @Test
    public void testCheck(){
      Espresso.onView(ViewMatchers.withId(R.id.ColorInput)).perform(ViewActions.typeText("Red"));
      Espresso.onView(ViewMatchers.withId(R.id.ShapeInput)).perform(ViewActions.typeText("Square"));
      Espresso.onView(ViewMatchers.withId(R.id.btn)).perform(ViewActions.click());
      Espresso.onView(ViewMatchers.withId(R.id.ShowShape)).check(ViewAssertions.matches(ViewMatchers.withText("This is Square and the area is 16.0")));
      Espresso.onView(ViewMatchers.withId(R.id.ShowColor)).check(ViewAssertions.matches(ViewMatchers.withText("The Color is Red")));
  }
}
