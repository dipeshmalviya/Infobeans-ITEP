/*   17. Luci is making a display board for the school exhibition. The display board is a 3 m by 2 m rectangle. He needs to add a ribbon border around the entire display board. What is the length of ribbon that he needs?*/

import java.util.Scanner;
class Ribbon
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int blen= sc.nextInt();
int bbrea= sc.nextInt();
int peri = 2 *(blen + bbrea);

System.out.println("Luci needs "+peri +"m of ribbon for the border");
}
}