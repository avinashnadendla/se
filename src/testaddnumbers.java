import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddnumbers {

	@Test
	void test() {
		JUnitTesting junit=new JUnitTesting();
		int result=junit.addNumbers(5, 10);
		assertEquals(15,result);
	}

}
