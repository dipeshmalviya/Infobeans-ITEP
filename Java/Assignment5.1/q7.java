import java.util.Scanner;
class BinarySearch{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter "+(i+1) +"  element");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a number that you want to Search :");
        int num=sc.nextInt();
        int i=0;
        if(num<=(arr[size/2])){
         for( i=(size/2);i<size;i++){
            if(arr[i]==num){
                
                break;
            }
            else
               break;
        }
    }
         
         else{
             for( i=0;i<(size/2);i++){
                if(arr[i]==num){
                break;
            }
            else
               break;
        } 
        if(arr[i]==num)
        System.out.println("Number is found at index number" +i);
       else
        System.out.println("Number is not found at index number" +i);

        }
    
    }
}