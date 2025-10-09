import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n + 1];

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("Enter " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        System.out.println("Enter the value you want to add at " + index);
        int value = sc.nextInt();

        for (int i = n; i < index - 1; i--)
            arr[i] = arr[i + 1];

        arr[index - 1] = value;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}