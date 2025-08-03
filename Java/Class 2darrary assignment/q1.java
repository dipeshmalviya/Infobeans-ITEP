
//dynamic
import java.util.Scanner;
class RightDiagonalMatrix{
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
System.out.println("printing rightdiagonal from matrix :");

for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        if(i==j)
        System.out.print(arr[i][j] +" ");
    }
}


}
}





//static
/*class RightDiagonalMatrix{
public static void main(String[] args) {
    int arr[][]={
        {10,20,30},
        {40,50,60},
        {70,80,90}
    };
    System.out.print(arr[0][0] +" ");
    System.out.print(arr[1][1] +" ");
    System.out.print(arr[2][2] +" ");



}
}
*/