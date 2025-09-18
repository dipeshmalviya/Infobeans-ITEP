import java.util.Scanner;
class PrintArrayElements{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        //input
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter " +(i+1) +" element: ");
             arr[i]=sc.nextInt();
        }
        // printing array by normal for loop
        System.out.print("Elements are: " );
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i] +" ");
             
        // }       
        //for each loop
        // for(int element: arr){
        //     System.out.print(element +" ");
        // }






    }
}