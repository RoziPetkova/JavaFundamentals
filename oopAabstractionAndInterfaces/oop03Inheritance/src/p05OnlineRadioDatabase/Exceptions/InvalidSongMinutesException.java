package p05OnlineRadioDatabase.Exceptions;

public class InvalidSongMinutesException extends InvalidSongLengthException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSongMinutesException(String exception){
		super(exception);
	}
}
