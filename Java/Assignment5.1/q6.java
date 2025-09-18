import java.util.Scanner;
class LinearSort{
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
        //before sorting printing array by normal for loop
        System.out.print(" Before sorting Elements are: " );
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +" ");
        }       
       System.out.println();
        //Sorting logic
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }  
        System.out.print(" Before sorting Elements are: " );

        //After sorting
        for(int element:arr)
        System.out.print(element +" ");


    }
}