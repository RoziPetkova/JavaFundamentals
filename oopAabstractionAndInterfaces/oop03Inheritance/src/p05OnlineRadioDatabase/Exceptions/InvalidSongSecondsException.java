package p05OnlineRadioDatabase.Exceptions;

public class InvalidSongSecondsException extends InvalidSongLengthException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSongSecondsException(String exception) {
		super(exception);
	}
}
