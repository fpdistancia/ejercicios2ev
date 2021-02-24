package unidad7;

public abstract class Publicación {
	
	private int código;
	private String título;
	private int año;
	
	public Publicación(int código, String título, int año) {
		this.código = código;
		this.título = título;
		this.año = año;
	}

	public int getCódigo() {
		return código;
	}

	public String getTítulo() {
		return título;
	}

	public int getAño() {
		return año;
	}

	@Override
	public String toString() {
		return "Publicación [código=" + código + ", título=" + título + ", año=" + año + "]";
	}
	
}
