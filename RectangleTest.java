package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void testRectangleX() {
		Rectangle r = new Rectangle(3.0,4.0);
		assertEquals(3.0,r.x);
	}
	
	@Test
	void testRectangleY() {
		Rectangle r = new Rectangle(3.0,4.0);
		assertEquals(4.0,r.y);
	}
	
	@Test
	void testArea() {
		Rectangle r = new Rectangle(3.0,4.0);
		assertEquals(12.0,r.area());
	}
	
	@Test
	void testHashCode() {
		Rectangle r = new Rectangle(3.0,4.0);
		int hx = Double.hashCode(3.0);
    	int hy = Double.hashCode(4.0);
		assertEquals(31*hx+hy, r.hashCode());
	}
	
	@Test
	void testEquals1() {
		Point p = new Point(1.0,2.0);
		Rectangle r = new Rectangle(1.0,2.0);
		assertFalse(r.equals(p));
	}
	
	@Test
	void testEquals2() {
		Rectangle r = new Rectangle(1.0,2.0);
		assertFalse(r.equals(null));
	}
	
	@Test
	void testEquals3() {
		Rectangle r = new Rectangle(1.0,2.0);
		assertTrue(r.equals(r));
	}
	
	@Test
	void testEquals4() {
		Rectangle r1 = new Rectangle(1.0,2.0);
		Rectangle r2 = new Rectangle(1.0,2.0);
		assertTrue(r2.equals(r1));
	}
	
	@Test
	void testEquals5() {
		Rectangle r1 = new Rectangle(2.0,2.0);
		Rectangle r2 = new Rectangle(1.0,2.0);
		assertFalse(r2.equals(r1));
	}
	
	@Test
	void testEquals6() {
		Rectangle r1 = new Rectangle(1.0,1.0);
		Rectangle r2 = new Rectangle(1.0,2.0);
		assertFalse(r2.equals(r1));
	}
	
	@Test
	void testEquals7() {
		Rectangle r1 = new Rectangle(1.0,2.0);
		Rectangle r2 = new Rectangle(3.0,4.0);
		assertFalse(r2.equals(r1));
	}
	
	@Test
	void testEquals8() {
		Rectangle r1 = new Rectangle(1.0,2.0);
		Rectangle r2 = new Rectangle(2.0,1.0);
		assertFalse(r2.equals(r1));
	}
}
