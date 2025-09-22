class Main {
    public static void main(String args[]) {

        String s = "Hello 1 World 2 Welcome 3";
        String value[] = s.split(" ");
                         
        int sum = 0;
        for(String v:value){
            try{
                int a = Integer.parseInt(v);
                sum += a;
            }
            catch(NumberFormatException nfe){
            }
          }
        System.out.println("Sum of this string is : " + sum);
            
        }
}
       
    
