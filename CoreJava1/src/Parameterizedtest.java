import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Parameterizedtest {
  
	@ParameterizedTest
	@ValueSource(strings = {"call","bali","suri"})
	void endswithI(String str)
	{
		assertTrue(str.endsWith("i"));
	}
}
