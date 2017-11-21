package p05OnlineRadioDatabase.Exceptions;

public class InvalidArtistNameException extends InvalidSongException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidArtistNameException(String exception){
		super(exception);
	}
}
