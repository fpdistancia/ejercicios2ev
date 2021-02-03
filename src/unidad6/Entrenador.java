package unidad6;

import java.util.ArrayList;

public class Entrenador {
	
	private String nombre;
	private ArrayList<Pokemon> pokemons;
	private int insignias;
	
	public Entrenador(String nombre) {
		this.nombre = nombre;
		pokemons = new ArrayList<>();
		insignias = 0;
	}

	public Entrenador(String nombre, ArrayList<Pokemon> pokemons) {
		this.nombre = nombre;
		this.pokemons = new ArrayList<>(pokemons);
		insignias = 0;
	}
	
	public Entrenador(String nombre, ArrayList<Pokemon> pokemons, int insignias) {
		this.nombre = nombre;
		this.pokemons = new ArrayList<>(pokemons);
		this.insignias = insignias;
	}

	public int getInsignias() {
		return insignias;
	}

	public void setInsignias(int insignias) {
		this.insignias = insignias;
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Pokemon> getPokemons() {
		return pokemons;
	}
	
	public void addPokemon(Pokemon p) {
		pokemons.add(p);
	}
	
}
