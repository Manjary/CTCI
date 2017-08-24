package ArraysAndStrings;

public class uniqueCharacterString {
	public static boolean uniqueCharString(String s) {
		boolean charSet[] = new boolean[128];
		if (s.length() > 128) {
			return false;
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (charSet[(s.charAt(i))] == true) {
					return false;
				}
				charSet[(s.charAt(i))] = true;
			}
		}
		return true;
	}
	public static void main(String[]args){
		System.out.println(uniqueCharString(""));
	}
}
