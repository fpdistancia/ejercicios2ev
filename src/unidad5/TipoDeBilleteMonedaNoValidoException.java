package unidad5;

public class TipoDeBilleteMonedaNoValidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public TipoDeBilleteMonedaNoValidoException() {
	}

	public TipoDeBilleteMonedaNoValidoException(String message) {
		super(message);
	}

	public TipoDeBilleteMonedaNoValidoException(Throwable cause) {
		super(cause);
	}

	public TipoDeBilleteMonedaNoValidoException(String message, Throwable cause) {
		super(message, cause);
	}

	public TipoDeBilleteMonedaNoValidoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
