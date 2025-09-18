class Utility{
     private String data;
    public Utility(String data){
        this.data = data;
    }
    public String removeDuplicate(){
        char c1[]=data.toCharArray();
        for(int i=0;i<=c1.length-1;i++){
            for(int j=i+1;j<c1.length;j++){
                if(c1[i]==c1[j]){
                    c1[j]='\0';
                }
                 
            }
        }
        return new String(c1);
    }
}

class TestMain{
    public static void main(String args[]){
      Utility u1 = new Utility("aabbccddd");
      String s1=u1.removeDuplicate();
      System.out.println(s1);

	}
}