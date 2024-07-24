import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Assumptiondemo {
 @Test
 void testassume() {
	 int a=5,s=25;
	 Assumptions.assumeTrue(s==a*a);
	 System.out.println("it will display");
 }
}
