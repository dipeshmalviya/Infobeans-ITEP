import java.util.Scanner;
class FindElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        //input array
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter " +(i+1) +" element: ");
             arr[i]=sc.nextInt();
        }
        //printing array by normal for loop
        System.out.println("Elements are: " );
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +" ");
        }

        //input number
        System.out.println("\nEnter element you want to find in array : ");
        int num=sc.nextInt();

       //finding element
       int j;
        for( j=0;j<arr.length;j++){
           if(num==arr[j]){
             System.out.println("Number " +num +" is found at index number :" +j);
           break;
           }
        }  
        if(j==size)
        System.out.println("Number is not found in array");


    }
}