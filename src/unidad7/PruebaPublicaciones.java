package unidad7;

import java.util.ArrayList;

public class PruebaPublicaciones {

	public static void main(String[] args) {
		ArrayList<Publicación> publicaciones = new ArrayList<>();
		
		procesarPublicación(new Libro(1, "El Quijote", 1605, "Cervantes"));
		procesarPublicación(new Revista(2, "x", 1, 1, 2021, 100));
		
		
	}
	
	static void procesarPublicación(Publicación p) {
		System.out.println(p.toString());
	}

}
