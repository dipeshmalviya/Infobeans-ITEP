/* 45. Find the sum of 28 terms of an Arithmetic Progression -21 -18 -15 -12 . . . . . */
class ArithmeticProgression{
public static void main (String []args){

int a = - 2 , n = 28 ,d = (- 18 - (a));
//int term28=60;
int Sn = ((n/2) *(2 * a + (n - 1) + d));

System.out.println("sum of 28 term of AP is:" +Sn);
}
}


