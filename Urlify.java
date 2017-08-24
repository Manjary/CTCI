package ArraysAndStrings;

public class Urlify {
	public static String urlify(char[] s, int length) {
		//System.out.println(length+"   "+new String(s));
		int counter = 0;
		for (int i = 0; i < length; i++) {
			if (s[i] == ' ') {
				counter++;
			}
		}
		System.out.println(counter);
		int finalLength = length + counter * 2;
		char[] result = new char[finalLength];
		for (int j = length-1; j >= 0; j--) {
			//System.out.println(s[j]);
			if (s[j] == ' ') {
				result[finalLength - 1] = '0';
				result[finalLength - 2] = '2';
				result[finalLength - 3] = '%';
				finalLength =finalLength-3;
				//System.out.println(finalLength);
			} else {
				
				result[finalLength - 1] = s[j];
				finalLength =finalLength- 1;
				
			}
		}
		return new String(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(urlify(("my name is manjary").toCharArray(),("my name is manjary").length()));
	}

}
