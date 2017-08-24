package ArraysAndStrings;

import java.util.Arrays;

public class palindromePermutation {
	static boolean permutation(String s) {
		int countOdd = 0;
		int[] charset = new int[Character.getNumericValue('z')
				- Character.getNumericValue('a') + 1];
		System.out.println(charset.length);
		for (char c : s.toCharArray()) {
			int x = getVal(c);
			if (x != -1) {
				charset[x]++;
				if (charset[x] % 2 == 1) {
					countOdd++;
				} else {
					countOdd--;
				}
			}
		}
		return countOdd <= 1;
	}

	static int getVal(char c) {
		if ('a' <= c && 'z' >= c) {
			return c - 'a';
		} else
			return -1;
	}

	public static void main(String[] args) {
		System.out.println(permutation("taco cat"));
	}

}
