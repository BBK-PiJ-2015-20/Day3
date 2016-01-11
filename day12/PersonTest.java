import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PersonTest{

private Person p;

@Before
	public void startupUp(){
		p = new Person();
	}

@Test
	public void testNormalName(){
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals("WWWWWWWWWAAAAAGTHHE", expected, output);
		}


}
