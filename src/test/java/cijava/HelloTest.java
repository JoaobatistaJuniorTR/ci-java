package cijava;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testIsActivated() {
		assertTrue(Hello.isActivated());
	}

}
