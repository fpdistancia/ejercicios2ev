package unidad5;

public class PruebaHucha {

	public static void main(String[] args) {
		Hucha hucha = new Hucha(325);
		
		try {
			hucha.abrir("a");
			System.out.println(hucha.getDesglose(Hucha.DIEZ));
		} catch (HuchaVaciaException e) {
			System.out.println("La hucha está cerrada");
		} catch (ContraseñaIncorrectaException e1) {
			System.out.println("Contraseña incorrecta");
		}
	}

}
