/*3. ArrayIndexOutOfBoundsException

👉 Create an array of size 5. Ask the user for an index and print the element. Handle the case when the index is out of range.

// Expected
Enter index: 8
java.lang.ArrayIndexOutOfBoundsException caught */
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[]=new int[5];
        System.out.print("Enter index: ");
        int n=sc.nextInt();

        try {
           a[n]=10;
           System.out.println();

        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println(aioobe.getClass().getName() + " Caught");
        } 
    }
}