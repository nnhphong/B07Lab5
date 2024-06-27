public class Sphere {
	
	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	public double getVolume() {
		return (4 / 3) * Math.PI * Math.pow(this.radius, 3); // formula for the volume of spheres
	}
	
	public double getSurfaceArea() {
		return 4 * Math.PI * Math.pow(this.radius, 2); // formula for the surface area of sphere
	}
}