package p05OnlineRadioDatabase.Exceptions;

public class InvalidSongLengthException extends InvalidSongException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSongLengthException(String exception){
		super(exception);
	}
}
