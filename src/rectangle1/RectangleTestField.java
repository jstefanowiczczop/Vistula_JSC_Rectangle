package rectangle1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTestField {

	@Test
	public void test() {
	
		Rectangle r = new Rectangle (3,4);
		int expected = r.field();
		assertEquals(expected,12);
		
		
	}

}
