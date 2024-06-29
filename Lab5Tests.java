package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab5Tests {

	@Test
	void testCircle() {
		Point testPoint = new Point(3.0 , 4.0); 
		double testRadius = 5.0; 
		Circle testCircle = new Circle(testPoint, testRadius); 
		assertNotNull(testCircle, "The circle has not been created."); 
	}
	
	@Test
	void testDiameter() {
		Point testPoint = new Point(3.0 , 4.0); 
		double testRadius = 5.0; 
		Circle testCircle = new Circle(testPoint, testRadius); 
		assertEquals(10.0, testCircle.diameter(), "The expected and actual diameter are not equal.");
	}
	
	@Test
	void testCircumference() {
		Point testPoint = new Point(3.0 , 4.0); 
		double testRadius = 5.0; 
		Circle testCircle = new Circle(testPoint, testRadius); 
		assertEquals(31.41592653589793, testCircle.circumference(), "The expected and actual circumference are not equal.");
	}
	
	@Test
	void testArea() {
		Point testPoint = new Point(3.0 , 4.0); 
		double testRadius = 5.0; 
		Circle testCircle = new Circle(testPoint, testRadius); 
		assertEquals(78.53981633974483, testCircle.area(), "The expected and actual area are not equal.");
	}
	

}
