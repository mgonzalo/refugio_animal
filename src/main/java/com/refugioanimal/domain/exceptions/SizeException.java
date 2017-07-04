/**
 * 
 */
package com.refugioanimal.domain.exceptions;

/**
 * @author Administrator
 */
public class SizeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2095097405746552927L;

	/**
	 * 
	 */
	public SizeException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public SizeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public SizeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public SizeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public SizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
