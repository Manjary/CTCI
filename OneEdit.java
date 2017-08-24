package ArraysAndStrings;

public class OneEdit {
	static boolean replace(String s1, String s2) {
		boolean foundDifference = false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (foundDifference) {
					return false;
				}
				foundDifference = true;
			}
		}
		return true;
	}

	static boolean edit(String s1, String s2) {
		int index1 = 0, index2 = 0;
		while (index1 < s1.length() && index2 < s2.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}
				index2++;
			} else
				index1++;
			index2++;
		}
		return true;
	}

	static boolean oneEditWay(String s1, String s2) {
		if (s1.length() == s2.length()) {
			return replace(s1, s2);
		} else if (s1.length() + 1 == s2.length()) {
			return edit(s1, s2);
		} else if (s1.length() + 1 == s2.length()) {
			return edit(s2, s1);
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(oneEditWay("manjary", "manjarym"));
	}
}
