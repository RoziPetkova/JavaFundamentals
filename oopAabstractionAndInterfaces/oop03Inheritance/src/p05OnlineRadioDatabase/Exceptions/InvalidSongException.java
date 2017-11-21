package p05OnlineRadioDatabase.Exceptions;

public class InvalidSongException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSongException(String exception){
		super(exception);
	}
}
