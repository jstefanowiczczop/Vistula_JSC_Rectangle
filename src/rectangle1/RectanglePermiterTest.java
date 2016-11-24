package rectangle1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectanglePermiterTest {

	@Test
	public void testPerimeter() {
		Rectangle r = new Rectangle (3,4);
		int expected = r.perimeter();
		assertEquals(expected,r.getA()*2+r.getB()*2);
	}

}
