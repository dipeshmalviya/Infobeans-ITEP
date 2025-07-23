import java.util.Scanner;
class Dmart{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);

System.out.println("D-Mart");

System.out.println("Enter your name:");
String p_name=sc.nextLine();

System.out.println("Enter your gender(m/M||f/F):");
char p_gender=sc.next().charAt(0);


System.out.println("tell the item name and quantity of each product purchased one by one");

System.out.println("Enter item1 name(withoutspace):");
String item1_name=sc.next();
System.out.println("Enter quantity of item1 :");
int item1_quantity=sc.nextInt();
float cost_item1=10f;
float total_item1=cost_item1*item1_quantity;


System.out.println("Enter item2 name:");
String item2_name=sc.next();
System.out.println("Enter quantity of item2 :");
int item2_quantity=sc.nextInt();
float cost_item2=20f;
float total_item2=cost_item2*item2_quantity;



System.out.println("Enter item3 name:");
String item3_name=sc.next();
System.out.println("Enter quantity of item3 :");
int item3_quantity=sc.nextInt();
float cost_item3=30f;
float total_item3=cost_item3*item3_quantity;



System.out.println("Enter item4 name:");
String item4_name=sc.next();
System.out.println("Enter quantity of item4 :");
int item4_quantity=sc.nextInt();
float cost_item4=40f;
float total_item4=cost_item4*item4_quantity;



System.out.println("Enter item5 name:");
String item5_name=sc.next();
System.out.println("Enter quantity of item5 :");
int item5_quantity=sc.nextInt();
float cost_item5=50f;
float total_item5=cost_item5*item5_quantity;



System.out.println("Enter item6 name:");
String item6_name=sc.next();
System.out.println("Enter quantity of item6 :");
int item6_quantity=sc.nextInt();
float cost_item6=60f;
float total_item6=cost_item6*item6_quantity;



System.out.println("Enter item7 name:");
String item7_name=sc.next();
System.out.println("Enter quantity of item7 :");
int item7_quantity=sc.nextInt();
float cost_item7=70f;
float total_item7=cost_item7*item7_quantity;


System.out.println("Enter item8 name:");
String item8_name=sc.next();
System.out.println("Enter quantity of item8 :");
int item8_quantity=sc.nextInt();
float cost_item8=80f;
float total_item8=cost_item8*item8_quantity;



System.out.println("Enter item9 name:");
String item9_name=sc.next();
System.out.println("Enter quantity of item9 :");
int item9_quantity=sc.nextInt();
float cost_item9=90f;
float total_item9=cost_item9*item9_quantity;



System.out.println("Enter item10 name:");
String item10_name=sc.next();
System.out.println("Enter quantity of item10 :");
int item10_quantity=sc.nextInt();
float cost_item10=100f;
float total_item10=cost_item10*item10_quantity;


float total_amount=(item1_quantity*cost_item1+item2_quantity*cost_item2+item3_quantity*cost_item3+item4_quantity*cost_item4+item5_quantity*cost_item5+item6_quantity*cost_item6+item7_quantity*cost_item7+item8_quantity*cost_item8+item9_quantity*cost_item9+item10_quantity*cost_item10);

float actual_amount=total_amount;

System.out.println(" total bill amount without any discount:"+total_amount);

float item0_discount=0f;
float item1_discount=0f;
float item10_discount=0f;

if(item1_quantity>4){
item1_discount=item1_quantity*((cost_item1*5)/100);
System.out.println("item1-discount:"+item1_discount);
}

if(item5_quantity>0){
total_amount=total_amount-((total_amount*10)/100);
System.out.println("total_amount:"+total_amount);
}

if(item10_quantity>0){
item10_discount=item10_quantity*((cost_item10*15)/100);
System.out.println("item10_discount:"+item10_discount);
}
String gift;
if(p_gender=='f'||p_gender=='F'){
System.out.println("Congratulation you won gift Cadeberry");
 gift="Cadeberry";

}
else{
System.out.println("Congratulation you won gift Ladger Wallet");
 gift="Ladger Wallet";

}

System.out.println("You want carry bag:(yes/no)");
String permission=sc.next();


if(total_amount>10000){
total_amount=total_amount-((total_amount*15)/100);
System.out.println("total_amount:"+total_amount);
}

if((total_amount>5000) && (total_amount<=10000)){
total_amount=total_amount-((total_amount*10)/100);
System.out.println("total_amount:"+total_amount);
}
float discount_on_total=total_amount;

int carrybeg=0;
if(permission.equals("yes")){
 carrybeg=10;
total_amount=total_amount+carrybeg;
System.out.println("total_amount:"+total_amount);
}
/* else{
 carrybeg=0;
}
*/

System.out.println("Adding GST on total bill amount 10%");
float GST=((total_amount*10)/100);

total_amount=total_amount+GST;
System.out.println("total_amount:"+total_amount);

float gift_cost=0f;

float TAP=actual_amount+carrybeg+GST;
float TDP=discount_on_total+carrybeg+GST;

System.out.println("					D-Mart						        ");
System.out.println("Name : "+ p_name + "							 Data: 24/9/2022");

System.out.println("--------------------------------------------------------------------------------------------");

System.out.println("\tItem Name \tQuantity \tPrice \t\tTotal \t\tAfter-Discount \t\t");
System.out.println();
System.out.println("\t"+item1_name +"\t\t"+item1_quantity +"\t\t"+cost_item1 +"\t\t" +total_item1 +"\t\t"+item1_discount +" Rs");
System.out.println("\t"+item2_name +"\t\t"+item2_quantity +"\t\t"+cost_item2 +"\t\t" +total_item2 +"\t\t"+item0_discount +" Rs");
System.out.println("\t"+item3_name +"\t\t"+item3_quantity +"\t\t"+cost_item3 +"\t\t" +total_item3 +"\t\t"+item0_discount +" Rs");
System.out.println("\t"+item4_name +"\t\t"+item4_quantity +"\t\t"+cost_item4 +"\t\t" +total_item4 +"\t\t"+item0_discount +" Rs");
System.out.println("\t"+item5_name +"\t\t"+item5_quantity +"\t\t"+cost_item5 +"\t\t" +total_item5 +"\t\t"+item0_discount +" Rs");
System.out.println("\t"+item6_name +"\t\t"+item6_quantity +"\t\t"+cost_item6 +"\t\t" +total_item6 +"\t\t"+item0_discount +" Rs");
System.out.println("\t"+item7_name +"\t\t"+item7_quantity +"\t\t"+cost_item7 +"\t\t" +total_item7 +"\t\t"+item0_discount +" Rs");
System.out.println("\t"+item8_name +"\t\t"+item8_quantity +"\t\t"+cost_item8 +"\t\t" +total_item8 +"\t\t"+item0_discount +" Rs");
System.out.println("\t"+item9_name +"\t\t"+item9_quantity +"\t\t"+cost_item9 +"\t\t" +total_item9 +"\t\t"+item0_discount +" Rs");
System.out.println("\t"+item10_name +"\t\t"+item10_quantity +"\t\t"+cost_item10 +"\t\t" +total_item10 +"\t\t"+item10_discount +" Rs");

System.out.println("--------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t\tA.P\t\tD.P\t\t ");
System.out.println("\t\t\t\t\t"+ actual_amount +"\t\t"+discount_on_total +"\t\t");
System.out.println("Gift :-" +gift +"\t\t\t"+ gift_cost +"\t\t"+ gift_cost +"\t\t");
System.out.println("Carry Bag : "+permission +"\t\t\t\t" +carrybeg +"\t\t"+carrybeg +"\t\t");
System.out.println("GST (10%)\t\t\t\t" +GST +"\t\t"+GST +"\t\t");
System.out.println("--------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t\t"+TAP +"\t\t"+TDP +"\t\t" );
System.out.println("                                                                                            ");
System.out.println("                                      Thank You                                             ");
System.out.println("                                     To Visit us                                            ");
System.out.println("                                      D-Mart                                                ");                                                                                                 
System.out.println("--------------------------------------------------------------------------------------------");





}
}