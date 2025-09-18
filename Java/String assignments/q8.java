/* 8) WAP to find out total occurrence of each letter in string.
	 Sample Input: "aabbccddd"
	 Output:   a- 2 times
			b- 2 times
			c- 2 times
			d- 3 times */
class Utility {
      public Utility() {
      }
      public void occurrence(String str) {
        char c[]=str.toCharArray();
		char temp[]=new char[c.length];
		for(int i=0;i<c.length;i++) {
			int count=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;
					c[j]='\0'; // Mark as counted		
				}
				temp[i]=c [i];
            }
            if(c[i]!='\0' && temp[i]!='\0') {					
			System.out.println(temp[i]+"- "+count+" times");
           }
         }
		}
	}
class TestMain{
	public static void main(String[] args) {
		
		String str = "aabbccdddaaaaaaaa";
		Utility utility = new Utility();
		utility.occurrence(str);
	}
}
