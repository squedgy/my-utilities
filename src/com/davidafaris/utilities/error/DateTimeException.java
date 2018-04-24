package com.davidafaris.utilities.error;

/**
 *
 * @author David
 */
public class DateTimeException extends RuntimeException{
	
	public DateTimeException(){
		this("There was an issue within the DateTimeUtilities class.");
	}
	
	public DateTimeException(String message){
		super(message);
	}
	
	@Override
	public String getMessage(){
		return super.getMessage();
	}
}
