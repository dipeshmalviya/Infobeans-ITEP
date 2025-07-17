/* 32. A square garden with a side length of 150 m has a square swimming pool in the very centre with a side length of 25 m . Calculate the area of the garden. */
class Square {
public static void main(String []args){

int glen=150, slen = 25;

int AOS = (slen*slen);

int AOG =(glen*glen)-AOS;

System.out.println("Area of garden is:"+AOG);
}
}
