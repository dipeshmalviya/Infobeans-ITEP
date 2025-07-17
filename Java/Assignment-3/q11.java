import java.util.Scanner;
class Place{
public static void main(String []args){
Scanner sc=new Scanner (System.in);
System.out.println("Enter sex of person(M/F):");
char sex=sc.next().charAt(0);
System.out.println("Enter age of person:");
int age=sc.nextInt();
if(sex=='F')
System.out.println("work in urban");
else if (sex=='M'){
     if(age>=20 && age<=40)
    System.out.println("Work anywhere");
     else if(age>=40 && age<=60)
       System.out.println(" Work Urban Area");
     else
       System.out.println("age should between 20 to 60");


}
else
System.out.println("ERROR");
}
}
