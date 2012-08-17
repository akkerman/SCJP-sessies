package scjp.genericlibrary;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BookLibraryTest.class, CompactDiscLibraryTest.class,
		DueItemsTester.class })
public class AllTests {

}
