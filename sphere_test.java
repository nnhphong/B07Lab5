import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sphere_test {
    @Test
    void testGetVolume() {
        Sphere s = new Sphere(5);
        assertTrue(Math.abs(s.getVolume() - 523.598) < 0.01);
    }
    
    @Test
    void testGetSurfaceArea() {
        Sphere s = new Sphere(5);
        assertTrue(Math.abs(s.getSurfaceArea() - 314.159) < 0.01);
    }
}
