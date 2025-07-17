/* 33. A rectangular garden has dimensions of 30 m by 20 m and is divided in to 4 parts by two pathways that run perpendicular from its sides. One pathway has a width of 3 m and the other, 4 m. Calculate the total usable area of the garden. */
class Rectangle{
public static void main(String args[]){

int d1=30,d2=20 , parts=4, path = 2,pw1=3,pw2=4;
int AOG= d1 * d2;

int P1 = d1*pw1;

int P2= d2* pw2 ;

int PS = pw1*pw2;
int TPA=P1+P2-PS;
int UA = AOG-TPA;

System.out.println("usable area is:"+UA);
}
}
