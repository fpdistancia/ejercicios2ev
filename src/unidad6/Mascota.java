package unidad6;

import java.util.Random;

public class Mascota {
	
	public static enum Estado { SANA, ENFERMA, FALLECIDA } 
	
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
		if (estado() == Estado.FALLECIDA)
			new Exception("La mascota ha fallecido");
		if (r.nextInt(10) < 3 && estado() == Estado.SANA && energia > 10)
			energia = 10;
		else if (estado() == Estado.ENFERMA)
			energia--;
		else
			energia += 5;
		return estadoDeAnimo();
	}
	
	public String dormir() {
		if (estado() == Estado.FALLECIDA)
			new Exception("La mascota a fallecido");
		if (estado() == Estado.ENFERMA)
			energia--;
		else
			energia += 2;
		return estadoDeAnimo();
	}
	
	public String hacerEjercicio() {
		if (estado() == Estado.FALLECIDA)
			new Exception("La mascota a fallecido");
		energia -= 3;
		if (estado() == Estado.ENFERMA)
			energia--;
		return estadoDeAnimo();
	}
	
	public Estado estado() {
		if (energia >= 5 && energia <=50)
			return Estado.SANA;
		else if ((energia >= 0 && energia < 5) || (energia > 50 && energia <= 55))
			return Estado.ENFERMA;
		else 
			return Estado.FALLECIDA;
	}
	
	public void curar() {
		if (estado() == Estado.FALLECIDA)
			new Exception("La mascota a fallecido");
		if (estado() == Estado.ENFERMA)
			energia = 20;
	}
	
	private String estadoDeAnimo() {
		if (energia > 8 || energia <  47)
			return "RRRRRRRRR " + energia + estado();
		else if ((energia > 4 && energia <= 8) || (energia >= 47 && energia <= 50) )
			return "PUF " + energia + estado();
		else if (estado() == Estado.ENFERMA)
			return "AY " + energia + estado();
		else
			return "LA MASCOTA HA FALLECIDO " + energia + estado();
	}
	
}
