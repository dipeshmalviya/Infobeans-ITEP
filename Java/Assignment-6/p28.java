class Test{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int k = -1;

        for(int element : arr) System.out.print(" " + element);

        System.out.println();
        int i = 0;

        for(i = 0; i < n; i++){
            if(arr[i] == k) break;
        }

        if(i == n) System.out.println("Element not found");
        else System.out.println("Element found");
    }
}