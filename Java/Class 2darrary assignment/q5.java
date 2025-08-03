
//dynamic
import java.util.Scanner;
class Sum{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Square size matrix only enter (Row or Coloumn size)");
    int size=sc.nextInt();
    int arr[][]=new int[size][size];
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        System.out.println("Enter element in row " +(i+1) +" coloum " +(j+1));
        arr[i][j]=sc.nextInt();
    }
}
    //Printing

    for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j] +" ");
    }
    System.out.println();
}

int even_sum=0,odd_sum=0;
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        if(arr[i][j]%2==0)
        even_sum += arr[i][j];
        else
        odd_sum += arr[i][j];

    }
}
System.out.println("Sum of even term is: " +even_sum );
System.out.println("Sum of odd term is: " +odd_sum );




}
}





