/*12. Check given character is vowel or not using switch case */


import java.util.Scanner;
class Check{
public static void main(String []args){

Scanner sc=new Scanner (System.in);

System.out.println("Enter  character:");
char ch=sc.next().charAt(0);
switch(ch){
case 'A':
System.out.println("Vowel");
break;
case 'E':
System.out.println("Vowel");
break;
case 'I':
System.out.println("Vowel");
break;
case 'O':
System.out.println("Vowel");
break;
case 'U':
System.out.println("Vowel");
break;
default:
System.out.println("Not Vowel");




}




}
}