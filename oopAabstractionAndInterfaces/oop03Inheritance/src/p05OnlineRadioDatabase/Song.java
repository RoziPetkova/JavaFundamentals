package p05OnlineRadioDatabase;

import p05OnlineRadioDatabase.Exceptions.InvalidArtistNameException;
import p05OnlineRadioDatabase.Exceptions.InvalidSongException;
import p05OnlineRadioDatabase.Exceptions.InvalidSongLengthException;
import p05OnlineRadioDatabase.Exceptions.InvalidSongMinutesException;
import p05OnlineRadioDatabase.Exceptions.InvalidSongNameException;
import p05OnlineRadioDatabase.Exceptions.InvalidSongSecondsException;

public class Song {
	
	private String artistName;
	private String songName;
	private Integer	minutes;
	private Integer seconds;
	
	Song(String artistName, String songName, String minutes, String seconds) throws InvalidSongException {
		this.setArtistName(artistName);
		this.setSongName(songName);
		checkValidity(minutes+"", seconds+"");
		this.setMinutes(Integer.valueOf(minutes));
		this.setSeconds(Integer.valueOf(seconds));
	}

	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) throws InvalidArtistNameException {
		if(artistName.length() > 20  || artistName.length() < 3)
			throw new InvalidArtistNameException("Artist name should be between 3 and 20 symbols.");
		this.artistName = artistName;
	}
	
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) throws InvalidSongNameException {
		if(songName.length() > 30  || songName.length() < 3)
			throw new InvalidSongNameException("Song name should be between 3 and 30 symbols.");
		this.songName = songName;
	}
	
	
	public Integer getMinutes() {
		return minutes;
	}
	public void setMinutes(Integer minutes) throws InvalidSongMinutesException {
		if( minutes > 14 || minutes < 0)
			throw new InvalidSongMinutesException("Song minutes should be between 0 and 14.");
		this.minutes = minutes;
	}
	
	
	public Integer getSeconds() {
		return seconds;
	}
	public void setSeconds(Integer seconds) throws InvalidSongSecondsException {
		if( seconds > 59 || seconds < 0)
			throw new InvalidSongSecondsException("Song seconds should be between 0 and 59.");
		this.seconds = seconds;
	}
	
	private static void checkValidity(String minutes, String seconds) throws InvalidSongLengthException {
		try {
			@SuppressWarnings("unused")
			int i = Integer.valueOf(minutes);
			i = Integer.valueOf(seconds);
		} catch (NumberFormatException e) {
			throw new InvalidSongLengthException("Invalid song length.");
		}
	}
}
