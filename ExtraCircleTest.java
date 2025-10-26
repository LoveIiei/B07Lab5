package lab5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExtraCircleTest{
    @Test
    void testzeroRadius(){
        Circle circle = new Circle(0.0);
        assertEquals(0.0, circle.radius);
    }

    @Test
    void testRadius1(){
        Circle circle = new Circle(5.0);
        assertEquals(5.0, circle.radius);
    }

    @Test
    void testRadius2(){
        Circle circle = new Circle(10.9);
        assertEquals(10.9, circle.radius);
    }

    @Test
    void testareacompute(){
        Circle circle = new Circle(0.0);
        double expectedArea = Math.PI * 0.0 * 0.0;
        assertEquals(expectedArea, circle.areaCompute());
    }

    @Test
    void testareacompute1(){
        Circle circle = new Circle(5.0);
        double expectedArea = Math.PI * 5.0 * 5.0;
        assertEquals(expectedArea, circle.areaCompute());
    }

    @Test
    void testareacompute2(){
        Circle circle = new Circle(10.9);
        double expectedArea = Math.PI * 10.9 * 10.9;
        assertEquals(expectedArea, circle.areaCompute());
    }

    @Test
    void testequalradius(){
        Circle circle1 = new Circle(7.5);
        Circle circle2 = new Circle(7.5);
        assertTrue(circle1.equalRadius(circle2));
    }

    @Test
    void testsamearea(){
        Circle circle1 = new Circle(7.5);
        Circle circle2 = new Circle(7.5);
        assertTrue(circle1.sameArea(circle2));
    }

    @Test
    void testnotequalradius(){
        Circle circle1 = new Circle(7.5);
        Circle circle2 = new Circle(5.0);
        assertFalse(circle1.equalRadius(circle2));
    }

    @Test
    void testnotsamearea(){
        Circle circle1 = new Circle(7.5);
        Circle circle2 = new Circle(5.0);
        assertFalse(circle1.sameArea(circle2));
    }

    @Test
    void testHashCode(){
        Circle circle1 = new Circle(7.5);
        Circle circle2 = new Circle(7.5);
        assertEquals(circle1.hashCode(), circle2.hashCode());
    }
}