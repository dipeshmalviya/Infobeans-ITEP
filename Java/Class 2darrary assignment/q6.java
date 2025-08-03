
//dynamic
import java.util.Scanner;
class SumMax{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Square size matrix only enter (Row or Coloumn size)and +ve only");
    int size=sc.nextInt();
    int arr[][]=new int[size][size];
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        System.out.println("Enter element in row " +(i+1) +" coloum " +(j+1));
        arr[i][j]=sc.nextInt();
    }
}
    //Printing matrix

    for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j] +" ");
    }
    System.out.println();
}
//checking maximum sum and printing that row and sum from matrix
System.out.println("printing sum of maximum  from row in matrix :");
int x[]=new int[arr.length];
int sum=0,max=0;
for(int i=0;i<arr.length;i++){
    sum=0;
    for(int j=0;j<arr[i].length;j++){
        sum=sum+arr[i][j];
        
        
    }
    x[i]=sum;
    System.out.print(" " +x[i]);
    if(sum>max){
      max=sum;
    }
}
 System.out.print("\nrows maximum sum is: "+max );
int index;
for(index=0;index<x.length;index++){
    if(x[index]==max){
       break;
    }

 }
//printing max row
System.out.println("\nrows elements are: "); 
for(int j=0; j<arr.length; j++){
  System.out.print(" "+arr[index][j]);
}
   


}
}





