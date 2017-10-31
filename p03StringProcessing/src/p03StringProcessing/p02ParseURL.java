package p03StringProcessing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class p02ParseURL {
	// [protocol]://[server]/[resource]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String URL = scan.nextLine();

		/*String protocol = URL.contains("://") ? URL.substring(0, URL.indexOf("://")) : "Invalid URL" ;
		URL = URL.replaceAll(protocol + "://", "");
		String server = URL.contains("/") ? URL.substring(0, URL.indexOf("/")) : "Invalid URL";
		String resource = URL.contains("://") ? "Invalid URL" : URL.substring(URL.indexOf("/") + 1, URL.length());

		if (resource.startsWith("Invalid")|| protocol.startsWith("Invalid")) {
			System.out.println("Invalid URL");
		} else {
			System.out.println("Protocol = " + protocol);
			System.out.println("Server = " + server);
			System.out.println("Resources = " + resource);
		} */
		String pattern ="([a-z]+)://([\\w+.]+)\\/([^\\s]+[^:\\/\\/]+)";
		Pattern regex = Pattern.compile(pattern);
		Matcher matches = regex.matcher(URL);
		
		Boolean mm = matches.find();
		System.out.printf("%s,\n%s\n%s\n", matches.group(1), matches.group(2), matches.group(3));
	}
}
