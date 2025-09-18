import java.util.Scanner;
class SumOfEvenNOddElemnts{
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
        //printing array by normal for loop
        System.out.print("Elements are: " );
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +" ");
        }       
       
        //calculating even elemnts sum
        int even_sum=0,odd_sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
            even_sum += arr[i];
            else
            odd_sum += arr[i];
        }  
        System.out.println("\nSum of even elements is : " +even_sum);
        System.out.println("Sum of odd elements is : " +odd_sum);



    }
}