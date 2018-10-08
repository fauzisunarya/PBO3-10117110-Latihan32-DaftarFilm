
package pbo3.pkg10117110.latihan32.daftarfilm;


public class Film {
    public String filmName, filmGenre;
    public double filmRating;
    public int filmDuration;
    

    public void nowPlaying(String filmName, String filmGenre, 
            double filmRating, int filmDuration){
        
        System.out.println("Judul Film : "+filmName);
        System.out.println("Genre Film : "+filmGenre);
        System.out.println("Rating Film : "+filmRating);
        System.out.println("Duration Film : "+filmDuration+" Menit");
        System.out.println("");
        
    }
    
    
}
