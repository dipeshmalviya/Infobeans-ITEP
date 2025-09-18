/*20)Create class Tile to store the edge length of a 
square tile , and create another class Floor to store 
length and width of a rectangular floor. Add method totalTiles
(Tile t) in Floor class with Tile as argument to calculate
 the whole number of tiles needed to cover the floor completely. */
 
 import java.util.Scanner;
 class Tile{
    private int edge_len_sq_tile;
     Tile(){}
     Tile(int x){
        this.edge_len_sq_tile=x;
    }
    public int getTileArea(){
        return edge_len_sq_tile*edge_len_sq_tile;
    }

 }
 class Floor{
    private int length_rec_floor;
    private int width_rec_floor;
     Floor(){}
     Floor(int l,int w){
        this.length_rec_floor=l;
        this.width_rec_floor=w;
    }
    public int getFloorArea(){
        return length_rec_floor*width_rec_floor;
    }
    public float totalTiles(Tile t){
         return (float)(getFloorArea())/(t.getTileArea());
    }
    
 }
class TestMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Edge length of square tile : ");
        int edge=sc.nextInt();
        Tile t1=new Tile(edge);
        Floor f1=new Floor(20,10);
        float total_tiles=f1.totalTiles(t1);
     System.out.println("Total tiles required = " + total_tiles);


    }
}