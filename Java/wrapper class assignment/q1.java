class Main{
    public static void main(String args[]){

        String s = "1 2 3 4 5 6 7 8 9 10";
      String value []= s.split(" ");
      int sum=0;
      for(String v:value ){
        int a=Integer.parseInt(v);
        sum +=a;
      }
      System.out.println("Sum of this string is : "+sum);
    }
}