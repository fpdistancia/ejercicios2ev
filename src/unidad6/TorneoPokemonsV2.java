package unidad6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TorneoPokemonsV2 {

	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static ArrayList<Entrenador> entrenadores = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		while (quieroJugar()) {
			 obtenerEntrenadores();
			 if (entrenadores.size() > 0)
				 jugar();
			 else
				 System.out.println("No hay entrenadores para jugar el torneo");
		 }
	}
	
	
	static void obtenerEntrenadores() throws IOException {
		String linea = in.readLine();
		while (!linea.equalsIgnoreCase("torneo")) {
			Scanner scanner = new Scanner(linea);
			try {
				String entrenador = scanner.next("\\p{L}+");
				String pokemon = scanner.next("\\p{L}+"); 
				String elemento = scanner.next("\\p{L}+");
				int salud = scanner.nextInt();
				if (scanner.hasNext())
					System.out.println("Demasiados datos en esta línea, introdúcelos de nuevo");
				else
					actualizarEntrenador(entrenador, pokemon, elemento, salud);
			} catch (InputMismatchException e) {
				señalarError(scanner);
			} catch (NoSuchElementException e) {
				System.out.println("Datos insuficientes, introdúcelos de nuevo");
			}
			scanner.close();
			linea = in.readLine();
		}
	}
	
	static void señalarError(Scanner scanner) {
		String error = scanner.next();
		int i = scanner.match().start();
		String formato = String.format("%%%ds\n'" + error + "' no es correcto, introduce los datos de nuevo\n", i + 1);
		System.out.printf(formato, "^");
	}
	
	static void actualizarEntrenador(String nombre, String pokemon, String elemento, int salud) {
		Entrenador entrenador = null;
		for (Entrenador e: entrenadores)
			if (e.getNombre().equals(nombre)) {
				entrenador = e;
				break;
			}
		if (entrenador == null) {
			entrenador = new Entrenador(nombre);
			entrenadores.add(entrenador);
		}
		entrenador.addPokemon(new Pokemon(pokemon, elemento, salud));
	}
	
	static void jugar() throws IOException {
		String linea = in.readLine();
		while (!linea.equalsIgnoreCase("fin")) {
			for (Entrenador e: entrenadores)
				e.jugar(linea);
			linea = in.readLine();
		}
		entrenadores.forEach(p -> System.out.println(p));
	}
	
	static boolean quieroJugar() throws IOException {
		boolean quieroJugar;
		boolean correcta;
		do {
			System.out.print("¿Jugar un torneo? (s/n): ");
			String respuesta = in.readLine().toLowerCase();
			correcta = (quieroJugar = respuesta.equals("s")) || respuesta.equals("n");
			if (!correcta)
				System.out.println("Respuesta incorrecta");
		} while (!correcta);
		return quieroJugar;
	}

}

/*
Ash Charizard fuego 100
Brock Squirtle agua 38 
Ash Pikachu electricidad 10
torneo
fuego
electricidad
fin
*/

/*
Misty Blastoise agua 18
Clemont Pikachu electricidad 22
Millo Kadabra psíquico 90
torneo
fuego
electricidad
fuego
fin
*/
