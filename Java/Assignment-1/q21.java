/* 21. A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height. How many bricks will be used to make a wall of length 15 m, breadth 10 m and height 8 metres? */
class Wall {
public static void main (String args[]){

int blen=15, bbrea= 8, bhei= 5;
int wlen=15*100, wbrea=10*100, whei=8*100;

int tBrick = (wlen*wbrea*whei) / (blen*bbrea*bhei);

System.out.println("Total bricks is:"+tBrick);
}
}