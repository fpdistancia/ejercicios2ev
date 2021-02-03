package unidad6;

import java.util.ArrayList;
import java.util.Scanner;

public class TorneoPokemons {

	private static Scanner in = new Scanner(System.in);
	private ArrayList<Entrenador> entrenadores = new ArrayList<>();
	
	public static void main(String[] args) {
		 
		 
		 while (quieroJugar()) {
			 obtenerEntrenadores();
			 jugar();
		 }
	}
	
	static void obtenerEntrenadores() {
		String linea = in.nextLine();
		while (!linea.equalsIgnoreCase("torneo")) {
			// Ash Charizard fuego 100
			String [] items = linea.split(" ");
			if (items.length != 4)
				System.out.println("Entrada de datos incorrecta, vuelve a introducirlos");
			else {
				String entrenador = items[0];
				String pokemon = items[1]; 
				String elemento = items[2];
				try {
					int salud = Integer.parseInt(items[3]);
					actualizarEntrenador(entrenador, pokemon, elemento, salud);
				} catch (NumberFormatException e) {
					System.out.println("Entrada de datos incorrecta, vuelve a introducirlos");
				}
			}
			linea = in.nextLine();
		}
	}
	
	static void actualizarEntrenador(String nombre, String pokemon, String elemento, int salud) {
		
	}
	
	static void jugar() {
		
	}
	
	static boolean quieroJugar() {
		boolean quieroJugar;
		boolean correcta;
		do {
			System.out.print("¿Jugar un torneo? (s/n): ");
			String respuesta = in.nextLine().toLowerCase();
			correcta = (quieroJugar = respuesta.equals("s")) || respuesta.equals("n");
			if (!correcta)
				System.out.println("Respuesta incorrecta");
		} while (!correcta);
		return quieroJugar;
	}

}
