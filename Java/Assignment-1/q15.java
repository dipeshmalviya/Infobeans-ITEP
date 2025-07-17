/* 15. Shelly has a rectangular garden of length 22 m and breath 15 m. Her friend Rachel has a square garden of side 21 m. Whose garden is bigger and by how much? */
class Rectangle{
public static void main(String args[]){

int Slen = 22, Sbrea = 15, RSqs=21;
int AOSR=Slen*Sbrea;
int AORR=RSqs*RSqs;
System.out.println("Shelly garden area is:" +AOSR);
System.out.println("Rachel garden area is :"+AORR);

System.out.println("Rachel garden is bigger is : "+(AORR-AOSR));
}
}