package unidad7;

import java.util.ArrayList;

public class PruebaPublicaciones {

	public static void main(String[] args) {
		ArrayList<Publicación> publicaciones = new ArrayList<>();
		
		publicaciones.add(new Libro(1, "El Quijote", 1605, "Cervantes"));
		publicaciones.add(new Revista(2, "x", 1, 1, 2021, 100));
		
		for (Publicación p: publicaciones)
			System.out.println(p.toString());
	}

}
