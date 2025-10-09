// insertion sort
class Test{
    public static void main(String args[]){
        int arr[] = {1,4,5,73,2,3,45,10};
        int n = arr.length;

        System.out.println("Before sorting the array--------");

        for(int element : arr){
            System.out.print(" " + element);
        }

        for(int i = 0; i < n-1; i++){
            int min_indx = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min_indx]){
                    min_indx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_indx];
            arr[min_indx] = temp;
        }

        System.out.println("\nAfter sorting the array--------");

        for(int element : arr){
            System.out.print(" " + element);
        }
    }
}