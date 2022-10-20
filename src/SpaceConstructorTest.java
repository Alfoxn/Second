import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SpaceConstructorTest {

	@Test
	void test() {
		SpaceCounter counter = new SpaceCounter();
		assertEquals(7, counter.sum("   всем привет   ") );
		assertEquals(1, counter.sum("всем привет") );
		assertEquals(0, counter.sum("всемпривет") );
		assertEquals(2, counter.sum(" всемпривет ") );
		assertEquals(4, counter.sum("    ") );
	}


}

