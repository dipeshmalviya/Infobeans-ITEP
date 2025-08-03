
//dynamic
import java.util.Scanner;
class LowerTriangle{
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
//printing rightdiagonal from matrix
System.out.println("printing lowerTriangle from matrix :");

for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        if(i>j)
        System.out.print(arr[i][j] +" ");
    }
}


}
}





