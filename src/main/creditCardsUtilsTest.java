package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class creditCardsUtilsTest extends creditCardsUtils {

	@Test
	void testMask() {
		String ccNumber="1122334455667788";
		String result = creditCardsUtils.mask(ccNumber);
		
		String expected="XXXXXXXXXXXX7788";
		assertEquals(expected,result);
	}

}
