package unidad7;

public class Revista extends Publicación {

	private int día;
	private int mes;
	private int número;
	
	public Revista(int código, String título, int día, int mes, int año, int número) {
		super(código, título, año);
		this.día = día;
		this.mes = mes;
		this.número = número;
	}

	public int getDía() {
		return día;
	}

	public int getMes() {
		return mes;
	}

	public int getNúmero() {
		return número;
	}

	@Override
	public String toString() {
		return "Revista [día=" + día + ", mes=" + mes + ", número=" + número + ", toString()=" + super.toString() + "]";
	}
	
}
