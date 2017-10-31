import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class p08MelrahShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String pattern = sc.nextLine();
 
        Pattern pat = Pattern.compile(pattern);
        int groupcount = 0;
        while (true) {
            Matcher match = pat.matcher(input);
            if(pattern.equals("")){
                System.out.println("No shake.");
                break;
            }
            while (match.find()) {
                groupcount++;
            }
            if (groupcount < 2) {
                System.out.println("No shake.");
                break;
            }
            groupcount=0;
            input = input.replaceFirst(pattern, "");
            input = replaceLast(input, pattern, "");
            int indexToRemove = pattern.length() / 2;
            pattern = pattern.substring(0, indexToRemove) + pattern.substring(indexToRemove + 1);
            System.out.println("Shaked it.");
            pat = Pattern.compile(pattern);
        }
        System.out.println(input);
    }
 
    public static String replaceLast(String string, String toReplace, String replacement) {
        int pos = string.lastIndexOf(toReplace);
        if (pos > -1) {
            return string.substring(0, pos)
                    + replacement
                    + string.substring(pos + toReplace.length(), string.length());
        } else {
            return string;
        }
    }
}