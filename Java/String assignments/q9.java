/* 9) WAP to find word of maximum length in given String.
	Sample Input: "Dear Student ,You have need to work hard"
`	Output: "Student" */
class Utility{
     public Utility(){}
	 public String maxilenString(String str){
      String s1[]= str.split(" ");
	  int max=0;
	  
	  for(String s:s1){
         if(max<s.length()){
			max=s.length(); 
		 }
	  }
	  for(String s:s1){
		if(max==s.length()){
			return s;
		}
	  }

return str;

	
	 }
}
class TestMain{
	public static void main(String[] args) {
		
		String str = "Dear Student ,You have need to work hard";
		Utility utility = new Utility();
		String s1=utility.maxilenString(str);
		System.out.println(s1);
	}
}
