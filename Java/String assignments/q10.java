/*10) WAP to count the word whose first letter is  vowel. */
class Utility {
    //   public Utility() {}
      public int occurrence(String str) {
       String s1[]=str.split(" ");
	
	   int count=0;
	for (String word : s1) {
		if(word.startsWith("a") || word.startsWith("A") || 
           word.startsWith("e") || word.startsWith("E") ||
           word.startsWith("i") || word.startsWith("I") ||
          word.startsWith("o") || word.startsWith("O") ||
           word.startsWith("u") || word.startsWith("U")) {
     
			count++;
}
		}
		return count;
	}
      
		
	}



 class TestMain{
	public static void main(String[] args) {
		
		String str = "aabbc edddaa pari malviya oa  usss adipesh emalviya";
		Utility utility = new Utility();
		int count=utility.occurrence(str);
		System.out.println(" count the word whose first letter is  vowel is: "+count);
	}
}