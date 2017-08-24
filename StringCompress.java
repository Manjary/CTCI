package ArraysAndStrings;

public class StringCompress {

	static String compress(String s){
	  StringBuffer sb=new StringBuffer();
	  int counter=0;
	  for(int i=0;i<s.length();i++){
		  counter++;
		  if(i+1>=s.length()||s.charAt(i)!=s.charAt(i+1)){
			  sb.append(s.charAt(i));
			  sb.append(counter);
			  counter=0;
		  }
		  
	  }
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(compress("qqddaaqq"));
	}

}
