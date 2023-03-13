public class Main {
    public static void main(String[] args) {

        Perpustakaan perpustakaan1 = new Perpustakaan();
        perpustakaan1.nama = "Perpusatakan";

        perpustakaan1.inputBuku("A1", "One Piece", 0);
        perpustakaan1.inputBuku("A2", "Naruto", 2);
        perpustakaan1.inputBuku("A4", "Boku no Hero", 1);

        perpustakaan1.cekBuku("A1");
        perpustakaan1.cekBuku("A2");

        perpustakaan1.cekData("A3");
        perpustakaan1.cekData("A2");

        perpustakaan1.cariBuku("One");
        perpustakaan1.cariBuku("uto");
        perpustakaan1.cariBuku("no");
        perpustakaan1.cariBuku("lo");
    }
}
