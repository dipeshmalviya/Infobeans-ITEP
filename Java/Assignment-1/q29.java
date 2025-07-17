/* 29. How many square tiles of side 10 cm will be required to tile a floor measuring 800 cm by 900 cm? */
class Square{
public static void main(String []args) {
 
int side = 10, flen = 800, fbrea=900;
int tiles = (flen*fbrea)/ (side * side);

System.out.println(" Square tiles is: "+ tiles);
}
}
