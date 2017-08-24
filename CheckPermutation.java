package ArraysAndStrings;

import java.util.Arrays;

public class CheckPermutation {
	static String sort(String s) {
		char[] charset = s.toCharArray();
		Arrays.sort(charset);
		return new String(charset);
	}
	static boolean checkPermutation(String s1,String s2){
		System.out.println(s1+"   "+s2);
		if(s1.length()!=s2.length()){
			return false;
		}
		System.out.println(sort(s1)+"   "+sort(s2));
		return(sort(s1).equals(sort(s2)));
	}
	
	
	/**
	 * Another approach
	 * @param args
	 */
	static boolean secondApproach(String s1,String s2){
		int[] charset=new int[128];
		if(s1.length()!=s2.length()){
			return false;
		}
		else{ int size=s1.length();
		       int size2=s2.length();
			for(int i=0;i<size;i++){
				charset[s1.charAt(i)]++;
			}
			for(int j=0;j<size2;j++){
				charset[s1.charAt(j)]--;
		        if(charset[s1.charAt(j)]<0){
		        	return false;
		        }
			}
			return true;
		}
			
			
	}
	public static void main(String[] args){
		System.out.println(checkPermutation("manjary","jaryman"));
		System.out.println("_______________");
		System.out.println(secondApproach("manjary","jaryman"));
	}
}
