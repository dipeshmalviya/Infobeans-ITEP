/*Write a Java program to find the second largest number in an array.
Example Input: {10, 5, 20, 8, 25, 3}
Example Output: Second Largest = 20 */
import java.util.Scanner;
class Utility{
    
    Utility(){}
   public int findSecongLargestNumber(int numArr[]){
      if(numArr.length==1) return numArr[0];
    int i=0; 
    int max=numArr[i];
       for(i=0;i<numArr.length;i++){
             if(numArr[i]>max){
                max=numArr[i];   
             }
            }
            int max2=numArr[1];
           for(int j=1;j<numArr.length-1;j++){
              if(numArr[j]>max2){
                max2=numArr[j];   
             }
           }
       
   return max2; 
}
}
class TestMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  System.out.println("Enter element in array(only 10 values)");
        int arr[]={1,-8,3,2,3,1};
        // for(int i=0;i<arr.length;i++){
        //  System.out.println("Enter "+(i+1) +" element :");
        //    arr[i]=sc.nextInt();
        // }
       
        Utility u1=new Utility();
        int secondLargestElement = u1.findSecongLargestNumber(arr);
        System.out.println("Second Largest = "+secondLargestElement);
    //    int s= u1.findSecongLargestNumber(arr);
    //    System.out.println(s);
    }
}