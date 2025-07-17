/* 30. How many tiles of length 5 cm and breadth 8 cm are needed to tile the floor of a bed room 200 cm long and 400 cm wide? */
class Floor{
public static void main (String args[]) {

int tlen=5, tbrea=8,rlen=200, rbrea=400;

int tiles = (rlen*rbrea) / (tlen * tbrea);

System.out.println("required tiles is:"+tiles);
}
}