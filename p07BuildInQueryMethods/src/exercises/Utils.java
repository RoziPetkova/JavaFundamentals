package exercises;

public class Utils {
	public static String naforNull(String str) {
		if (str == null)
			return "n/a";
		else
			return str;
	}
	
	public static String emptyForNull(String str) {
		if(str == null)
			return "";
		else return str;
	}
}
