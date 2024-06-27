package lab4;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testPerimeter() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        Point c = new Point(2, 4);
        Point d = new Point(0, 4);

        Rectangle r = new Rectangle(a, b, c, d);
        assertEquals(12, r.perimeter());
    }

    @Test
    void testIsSquareFalse() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        Point c = new Point(2, 4);
        Point d = new Point(0, 4);

        Rectangle r = new Rectangle(a, b, c, d);
        assertFalse(r.isSquare());
    }

    @Test
    void testIsSquareTrue() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(1, 1);
        Point d = new Point(0, 1);

        Rectangle r = new Rectangle(a, b, c, d);
        assertTrue(r.isSquare());
    }
}
