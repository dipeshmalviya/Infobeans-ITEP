import java.util.Scanner;
class InsertSpecific{
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
        System.out.println("Before inserting array : " );
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +" ");
        }   
        //input index number    
        System.out.println("\nEnter index position(number) in which you to insert element :");
          int index=sc.nextInt();
        //input value
         int value=sc.nextInt();
        System.out.println("\nEnter value which you to want  :");

         //Insert specific position
         int l=arr.length-2;
         int l2=index;
        for(int i=index;i<arr.length-2;i++){
              arr[l-1]=arr[l];
        }  
        //inserting logic
        // System.out.println("After Inserting at specific index : ");
        //  for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i] +" ");
        // } 

        //After inserting printing

        for(int element :arr){
            System.out.print(element +" ");
        }


    }
}