//59) WAP to find out the sum of all integer between 100 and 200 which are divisible by 9

class Sum{
public static void main(String args[]){
System.out.println(" sum of all integer between 100 and 200 which are divisible by 9: ");
int st=100;
//int ed=;
int sum=0;
while (st<=200) {
    if(st%9==0){
      sum=sum+st;
    }
    st++;
}
System.out.println("sum is: " +sum);


}
}
