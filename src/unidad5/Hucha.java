package unidad5;

import java.util.Arrays;

public class Hucha {
	public static final int CINCUENTA = 0;
	public static final int VEINTE = 1;
	public static final int DIEZ = 2;
	public static final int CINCO = 3;
	public static final int DOS = 4;
	public static final int UNO = 5;
	
	private static int [] tipos = {50, 20, 10, 5, 2, 1};
	private int [] desglose  = new int[tipos.length];
	private boolean abierta;
	private String contraseña;
	
	public Hucha() {
	}
	
	public Hucha(boolean abierta, String contraseña) {
		this.abierta = abierta;
		this.contraseña = contraseña;
	}
	
	public Hucha(int cincuenta, int veinte, int diez, int cinco, int dos, int uno) {
		desglose[0] = cincuenta;
		desglose[1] = veinte;
		desglose[2] = diez;
		desglose[3] = cinco;
		desglose[4] = dos;
		desglose[5] = uno;
	}
	
	public Hucha(int cincuenta, int veinte, int diez, int cinco, int dos, int uno, boolean abierta) {
		this(cincuenta, veinte, diez, cinco, dos, uno);
		this.abierta = abierta;
	}
	
	public Hucha(int cincuenta, int veinte, int diez, int cinco, int dos, int uno, boolean abierta, String contraseña) {
		this(cincuenta, veinte, diez, cinco, dos, uno, abierta);
		this.contraseña = contraseña;
	}
	
	public Hucha(int cantidad) {
		for (int i=0; i<tipos.length && cantidad > 0; i++) {
			if (cantidad > tipos[i]) {
				desglose[i] = cantidad / tipos[i];
				cantidad %= tipos[i];
			}
		}
	}
	
	public Hucha(int cantidad, boolean abierta) {
		this(cantidad);
		this.abierta = abierta;
	}
	
	public Hucha(int cantidad, boolean abierta, String contraseña) {
		this(cantidad, abierta);
		this.contraseña = contraseña;
	}
	
	public int getDesglose(int tipo) {
		return desglose[tipo];
	}
	
	public int retirar(int cantidad, int tipo) {
		if (desglose[tipo] < cantidad)
			cantidad = desglose[tipo];
		desglose[tipo] -= cantidad;
		return cantidad;
	}
	
	public int retirar(int cantidad) {
		// modificar esto para hacer lo que se pide
		for (int i=0; i<tipos.length && cantidad > 0; i++) {
			if (cantidad > tipos[i]) {
				desglose[i] = cantidad / tipos[i];
				cantidad %= tipos[i];
			}
		}
	}
	
	@Override
	public String toString() {
		return Arrays.toString(desglose);
	}
	
	public static void main(String[] args) {
		Hucha h = new Hucha(224);
		System.out.println(h);
		System.out.println(h.retirar(10, Hucha.CINCUENTA));
		System.out.println(h);
	}
}
