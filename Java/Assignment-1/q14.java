/* 14. The length of one of the diagonals of a field in the form of a quadrilateral is 46 m. The perpendicular distance of the other two vertices from the diagonal are 13 m and 10 m, find the area of the field. */
class Quadrilateral{
public static void main(String []args){

int diagonal = 46, v1 = 13, v2=10;
float A = (1/2.0f)*diagonal*(v1+v2);

System.out.println("area the field is: "+A);
}
}