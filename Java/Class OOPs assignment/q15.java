/* 15. Write a Java program to create a class called 
"MusicLibrary" with a collection of songs and methods 
 to add and remove songs, and to play a random song.
 */
import java.util.ArrayList;
class MusicLibrary{
    private ArrayList<String> music = new ArrayList<String>();
   public MusicLibrary(){}
    public void addMusic(String m1){
        System.out.println("music added : "+m1);
       music.add(m1);
    }
    public void removeMusic(String m1){
        System.out.println("music removed : "+m1);
        music.remove(m1);
    }
   public void PlayRandomSong(){
      int n=(int)( Math.random()*music.size());
               //System.out.println(n);
         System.out.println("playing random music"+music.get(n));
   }
}

   class TestMain{
    public static void main(String []args){
        MusicLibrary spotify= new MusicLibrary();
        spotify.addMusic("Divani");
        spotify.addMusic("ranjha");
        spotify.addMusic("yo yo");
        spotify.addMusic("yo 1");
        spotify.addMusic("yo 2");
        spotify.addMusic("yo 3");
        spotify.addMusic("yo 4");
        spotify.addMusic("yo 5");
        spotify.addMusic("yo 6");
        spotify.addMusic("yo 7");
        spotify.addMusic("yo 8");
        spotify.addMusic("yo 9");
        spotify.addMusic("yo 10");
        spotify.addMusic("yo 11");
        spotify.addMusic("yo 12");
        spotify.addMusic("yo 13");
        spotify.addMusic("yo 14");
        spotify.addMusic("yo 15");
        spotify.addMusic("yo 16");
        spotify.addMusic("yo 17");
        spotify.addMusic("yo 18");
        spotify.addMusic("yo 19");

        spotify.addMusic("mohobbat");
        spotify.removeMusic("Divani");
        spotify.PlayRandomSong();
        
    }
   }
   