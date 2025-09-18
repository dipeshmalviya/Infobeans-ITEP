/*
  12) Input data exactly in the following format,
   and print sum of all integer
  values.
 Sample Input: "67, 89, 23, 67, 12, 55, 66".
  (Hint use String class split
 method and Integer class parseInt method)
 */
class Utility{
    Utility(){};
    public int sum(String s){
        String a[] = s.split(", ");
        int numArr[]=new int[a.length];
        int sum=0;
        for (int i=0;i<a.length;i++) {
                numArr[i] = Integer.parseInt(a[i]);
                sum +=numArr[i];
        }
   return sum;
    }
}

class TestMain {
    public static void main(String[] args) {
        String s = "67, 89, 23, 67, 12, 55, 66";
     //  String a[]= s.split(", ");
        Utility u1 = new Utility();
       int sum= u1.sum(s);
        System.out.println("Total sum is : " +sum );
    }
}
