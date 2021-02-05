package edu.escuelaing.arep.stat.exceptions;

/**
 * The Class StatException.
 */
public class StatException extends Exception{
	
	/** The Constant DIVISION_CERO. */
	public static final String DIVISION_CERO = "El cociente de la división es igual a cero";
	
	/**
	 * Instantiates a new stat exception.
	 *
	 * @param message Mensaje de la excepción a ser lanzada.
	 */
	public StatException(String message) {
		super(message);
	}
}
