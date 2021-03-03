package unidad6.excepciones;

import java.util.Arrays;

public class Ejercicio2 {

	static double [] ecuacionSegundoGrado(double a, double b, double c) {
		if (a == 0)
			throw new IllegalArgumentException();
		double d = b * b - 4 * a * c;
		if (d < 0)
			throw new ArithmeticException();
		double rd = Math.sqrt(d);
		double [] r = new double[2];
		r[0] = (-b + rd) / (2 * a);
		r[1] = (-b - rd) / (2 * a);
		return r;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(ecuacionSegundoGrado(3, 2, 1)));
	}

}
