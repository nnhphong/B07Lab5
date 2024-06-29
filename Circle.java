package lab4;

import java.lang.Math;

public class Circle 
{
	Point center;
	double radius;
	
	public Circle(Point c, double r)
	{
		center = c;
		radius = r;
	}
	
	public double diameter()
	{
		return 2 * radius;
	}
	
	public double circumference()
	{
		return 2 * radius * Math.PI;			// Formula for circumference of a circle
	}
	
	public double area()
	{
		return radius * radius * Math.PI;		// Formula for area of a circle
	}
	
}
