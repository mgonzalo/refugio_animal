/**
 * 
 */
package com.refugioanimal.domain.exceptions;

/**
 * @author Administrator
 */
public class PetTypeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6393655091229250249L;

	/**
	 * 
	 */
	public PetTypeException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public PetTypeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public PetTypeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public PetTypeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public PetTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
