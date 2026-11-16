import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Keranjang {
    private ArrayList<Buku> isi = new ArrayList<>();

    public void tambah(Buku buku) {
        isi.add(buku);
    }

    // Daftar hanya-baca: pemanggil boleh membaca, tidak boleh menambah/menghapus lewat sini
    public List<Buku> getIsi() {
        return Collections.unmodifiableList(isi);
    }

    public int hitungTotal() {
        int total = 0;
        for (Buku b : isi) {
            total += b.hargaAkhir();
        }
        return total;
    }
}