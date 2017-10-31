package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p11ReplaceAtag {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder code = new StringBuilder();
		String line = reader.readLine();

		while (!line.equals("END")) {
			line = line + reader.readLine();
			if ("END".equals(line))
				break;
			code.append(line).append("\r\n");
		}
		 Pattern pattern = Pattern.compile("<a(.+?)>(.*?)<\\/a>", Pattern.DOTALL);
		 
		Matcher matcher = pattern.matcher(code);
	
		String replacement = "[URL$1]$2[/URL]";
		String result = matcher.replaceAll(replacement);
		System.out.println(result);
	}
}
