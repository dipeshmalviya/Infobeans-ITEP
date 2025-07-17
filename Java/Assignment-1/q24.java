/*24. How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required for a wall 20 m long, 2 m high and 0.75 m thick? If bricks sell at $900 per thousand what will it cost to build the wall? */
class Wall{
public static void main(String args[]){

int blon=25, bhei=10, wlon=20*100, whei = 2*100,rate=900;

float bthic = 7.5f,wthic=.75f*100f;

double cost = (((wlon*whei*wthic)/(blon*bhei*bthic)) /1000)*rate;

System.out.println("Cost of wall is:" + cost +"$");
}
}