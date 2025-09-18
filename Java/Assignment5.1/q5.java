import java.util.Scanner;
class Replace{
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
        //Before replacing
        System.out.print("Before replacing: " );
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +" ");
        }       
       System.out.println();
        //replace the element whose multiple is 5

        for(int i=0;i<arr.length;i++){
            if(arr[i]%5==0){
                arr[i]=0;
            }
        }  
        System.out.print("After Replacing :");
       //by for each loop
       for(int element :arr){
        System.out.print(element +" ");

       }

    }
}