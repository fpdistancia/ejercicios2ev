package unidad6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JuegoMascotas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Mascota> mascotas = new ArrayList<>();
		String linea;
		System.out.print("> ");
		linea = in.nextLine();
		while (!linea.equals("salir")) {
			String [] cmd = linea.split(" ");
			try {
				Mascota mascota;
				switch (cmd[0]) {
				case "crear":
					if (cmd.length != 2)
						System.out.println("no lo entiendo: " + linea);
					else {
						boolean encontrado = false;
						for (Mascota m: mascotas)
							if (m.getNombre().equals(cmd[1])) {
								encontrado = true;
								break;
							}
						if (encontrado)
							System.out.println("Ya existe una mascota con ese nombre");
						else
							mascotas.add(new Mascota(cmd[1]));
					}
					break;
				case "comer":
					mascota = comprobarBuscar(cmd, mascotas);
					if (mascota != null) {
						System.out.println(mascota.comer());
						if (mascota.estado() == Mascota.Estado.FALLECIDA)
							mascotas.remove(mascota);
					}
					break;
				case "ejercicio":
					mascota = comprobarBuscar(cmd, mascotas);
					if (mascota != null) {
						System.out.println(mascota.hacerEjercicio());
						if (mascota.estado() == Mascota.Estado.FALLECIDA)
							mascotas.remove(mascota);
					}
					break;
				case "dormir":
					mascota = comprobarBuscar(cmd, mascotas);
					if (mascota != null) {
						System.out.println(mascota.dormir());
						if (mascota.estado() == Mascota.Estado.FALLECIDA)
							mascotas.remove(mascota);
					}
					break;
				case "curar":
					mascota = comprobarBuscar(cmd, mascotas);
					if (mascota != null)
						mascota.curar();
					break;
				}	
			} catch (MascotaException e) {
				System.out.println("no lo entiendo: " + linea);
			}
			System.out.print("> ");
			linea = in.nextLine();
		}
		in.close();
	}

	static Mascota comprobarBuscar(String [] cmd, List<Mascota> mascotas) throws MascotaException {
		if (cmd.length != 2)
			throw new MascotaException();
		Mascota mascota = null;
		for (Mascota m: mascotas)
			if (m.getNombre().equals(cmd[1])) {
					mascota = m;
					break;
				}
		if (mascota == null)
			System.out.println("No existe una mascota con ese nombre");
		return mascota;
	}
}
