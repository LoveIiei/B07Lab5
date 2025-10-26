package lab5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Circle Test{
	@Test
	void testRadiusStored(){
		Circle c = new Circle(3.0);
		assertEquals(3.0, c.radius);
	}
	@Test
	void testEqualsSameObject() {
		Circle c = new Circle(3.0);
		assertTrue(c.equals(c)); // this == obj
	}

	@Test
	void testEqualNull(){
		Circle c = new Circle(4.0);
		assertFalse(c.euqals(null));
	}

	@Test
	void testEqualsSameRadius(){
		Circle c1 = new Circle(3.0);
		Circle c2 = new Circle(3.0);
		assertTrue(c1.equals(c2));
	}
	
	@Test
	void testEqualsDifferentRadius(){
		Circle c1 = new Circle(2.0);
		Circle c2 = new Circle(3.0);
		assertFalse(c1.equals(c2));
	}

	@Test
	void testArea(){
		Circle c = new Circle(3.0);
		double expectedArea = Math.PI * 3.0 * 3.0;
		assertEquals(expectedArea, c.area());
	}
	

	@Test
	void testHashCode(){
		Circle c = new Circle(3.0);
		int inHashCode = (int) (3.0 * 1000);
		int x = 3 + (5*inHashCode + 7);
		int y = x * inHashCode + 13;
		expectedhashCode = y*inHashcode;
		assertEquals(expectedhashCode, c.hashCode());
	}
