/*11) Input name of a person and count how many vowels
 it contains. Use String class methods. */

import java.util.Scanner;

class Functionality {
      public Functionality() {}
      public int countVowels(String str) {
       char c[]=str.toCharArray();
       int count=0;
      for (int i=0;i<c.length;i++) {
		if(c[i]=='a'|| c[i] == 'A' || 
            c[i] == 'e' || c[i] == 'E' ||
            c[i] == 'i' || c[i] == 'I' ||
            c[i] == 'o' || c[i] == 'O' ||
            c[i] == 'u' || c[i] == 'u') {
			count++;
 }
  }
      	return count;
    }
  }

  class TestMain{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a name of a person");
      String name=sc.nextLine();
      Functionality f1=new Functionality(); 
      int count=f1.countVowels(name);
      System.out.println("Total number of vowels in person's name is: "+count);
    }
  }
    
