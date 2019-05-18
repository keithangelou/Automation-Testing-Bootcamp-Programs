package junitproject.sample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ acitivityJUnit1.class, activityJUnit2.class })

public class AllTests {

}
