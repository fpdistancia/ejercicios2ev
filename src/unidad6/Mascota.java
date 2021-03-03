package unidad6;

import java.util.Random;

public class Mascota {
	
	public static enum Estado {
		SANA("RRRRRRRRR"),
		APATICA("PUF"), 
		ENFERMA("AY"), 
		FALLECIDA("LA MASCOTA HA FALLECIDO");
		String descripcion;
		private Estado(String descripcion) {
			this.descripcion = descripcion;
		}
		public String getDescripcion() {
			return descripcion;
		}
	} 
	
	private static Random r = new Random();
	
	private String nombre;
	private int energia = 20;
	
	public Mascota(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String comer() {
		Estado e = estado();
		if (e == Estado.FALLECIDA)
			new Exception("La mascota ha fallecido");
		if (r.nextInt(10) < 3 && e == Estado.SANA && energia > 10)
			energia = 10;
		else if (e == Estado.ENFERMA) 
			agravarEnfermedad();
		else
			energia += 5;
		return estado().getDescripcion() + " " + energia + " " + estado();
	}
	
	public String dormir() {
		Estado e = estado();
		if (e == Estado.FALLECIDA)
			new Exception("La mascota a fallecido");
		if (e == Estado.ENFERMA) 
			agravarEnfermedad();
		else
			energia += 2;
		return estado().getDescripcion() + " " + energia + " " + estado();
	}
	
	public String hacerEjercicio() {
		Estado e = estado();
		if (e == Estado.FALLECIDA)
			new Exception("La mascota a fallecido");
		if (e == Estado.ENFERMA) 
			agravarEnfermedad();
		else
			energia -= 3;
		return estado().getDescripcion() + " " + energia + " " + estado();
	}
	
	private void agravarEnfermedad() {
		if (energia < 5)
			energia--;
		else
			energia++;
	}
	
	public Estado estado() {
		if (energia < 0 || energia > 55)
			return Estado.FALLECIDA;
		else if (energia < 5 || energia > 50)
			return Estado.ENFERMA;
		else if (energia < 7 || energia > 47)
			return Estado.APATICA;
		else 
			return Estado.SANA;
	}
	
	public void curar() {
		Estado e = estado();
		if (e == Estado.FALLECIDA)
			new Exception("La mascota a fallecido");
		if (e == Estado.ENFERMA)
			energia = 20;
		else
			// esto no se dice en el enunciado del ejercicio
			energia = 10;
	}
	
}
