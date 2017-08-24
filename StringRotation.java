package ArraysAndStrings;

public class StringRotation {
	public static boolean stringRotate(String s1, String s2) {
		if (s1.length() != s2.length() || s2.length() <= 0) {
			return false;
		} else {
			String s = s2 + s2;
			return s.contains(s1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringRotate("111", ""));
	}

}
