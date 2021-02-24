package unidad7;

public class Libro extends Publicación {
	
	private String autor;

	public Libro(int código, String título, int año, String autor) {
		super(código, título, año);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return super.toString() + "[autor=" + autor + "]";
	}
	
	public void unMetodo() {
		System.out.println("soy un método");
	}
	
}
