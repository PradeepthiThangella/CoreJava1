import static  org.junit.Assert.*;

import org.junit.Test; 

public class Assertdemo {
	@Test
public void testforassertequal()
{
	int res =1;
	int exp =1;
	assertEquals(res, exp); 
}
	@Test
	void testassertTrue() {
} 
	@Test
	void testnull()
	{
		String n="j";
		assertNull("");
	}
}
