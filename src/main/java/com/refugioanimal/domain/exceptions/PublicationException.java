/**
 * 
 */
package com.refugioanimal.domain.exceptions;

/**
 * @author Administrator
 */
public class PublicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5768381761911717246L;

	/**
	 * 
	 */
	public PublicationException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public PublicationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public PublicationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public PublicationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public PublicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
