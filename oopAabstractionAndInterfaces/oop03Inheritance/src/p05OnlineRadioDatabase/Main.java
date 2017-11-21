package p05OnlineRadioDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

import p05OnlineRadioDatabase.Exceptions.InvalidSongException;

public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//format <artist name>;<song name>;<minutes:seconds>
		int counter = Integer.parseInt(reader.readLine());
		Calendar calendar = Calendar.getInstance();
		calendar.set(0, 0, 0, 0, 0, 0);
		int totalSongs = 0;
		String[] line;
		
		while (counter > 0) {
			line = reader.readLine().split(";");
			
			try {
				Song currentSong = new Song(line[0], line[1], line[2].split(":")[0],  line[2].split(":")[1]);
				System.out.println("Song added.");
				totalSongs+=1;
				calendar.add(Calendar.MINUTE, Integer.valueOf(line[2].split(":")[0]));
				calendar.add(Calendar.SECOND, Integer.valueOf(line[2].split(":")[1]));
			} catch (InvalidSongException e) {
				System.out.println(e.getMessage());
			}
			counter --;
		}
		
		System.out.printf("Songs added: %s\n", totalSongs);
		System.out.printf("Playlist length: %sh %sm %ss", calendar.get(Calendar.HOUR), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));
	}

	
}