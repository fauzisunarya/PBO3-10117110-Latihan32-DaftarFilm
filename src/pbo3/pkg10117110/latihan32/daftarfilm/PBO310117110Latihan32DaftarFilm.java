

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Daftar Film Dengan Menggunakan Konsep OOP
 */
package pbo3.pkg10117110.latihan32.daftarfilm;


public class PBO310117110Latihan32DaftarFilm {


    public static void main(String[] args) {
        
    Film film1 = new Film();
        film1.filmName = "Venom";
        film1.filmGenre = "Action, Horror, Scifi";
        film1.filmRating = 8.5;
        film1.filmDuration = 120;
        film1.nowPlaying(film1.filmName,film1.filmGenre,film1.filmRating,
                film1.filmDuration);
        
    Film film2 = new Film();
        film2.filmName = "small Foot";
        film2.filmGenre = "Animation";
        film2.filmRating = 9.0;
        film2.filmDuration = 96;
        film2.nowPlaying(film2.filmName,film2.filmGenre,film2.filmRating,
                film2.filmDuration);
        
    Film film3 = new Film();
        film3.filmName = "Crazy Rich Asian";
        film3.filmGenre = "Comedy";
        film3.filmRating = 7.8;
        film3.filmDuration = 119;
        film3.nowPlaying(film3.filmName,film3.filmGenre,film3.filmRating,
                film3.filmDuration);
        
    Film film4 = new Film();
        film4.filmName = "Asih";
        film4.filmGenre = "Horror";
        film4.filmRating = 6.0;
        film4.filmDuration = 100;
        film4.nowPlaying(film4.filmName,film4.filmGenre,film4.filmRating,
                film4.filmDuration);

    }
    
}
