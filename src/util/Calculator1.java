package util;

public class Calculator1 {
	/*usa estatico pois nao pode mudar os valores*/
	public static  final double PI = 3.14159;
	
	public static  double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius/3.0;
	}
}
