public class StrukPrinter {
    private static final int LEBAR = 41;

    // Judul di tengah: "=========== KERANJANG PERTAMA ==========="
    private String buatJudul(String judul, char pengisi) {
        String isi = " " + judul + " ";
        int sisa = LEBAR - isi.length();
        int kiri = sisa / 2;
        int kanan = sisa - kiri;

        StringBuilder baris = new StringBuilder();
        for (int i = 0; i < kiri; i++) {
            baris.append(pengisi);
        }
        baris.append(isi);
        for (int i = 0; i < kanan; i++) {
            baris.append(pengisi);
        }
        return baris.toString();
    }

    public void cetakKeranjang(String judul, Keranjang keranjang) {
        System.out.println(buatJudul(judul, '='));
        for (Buku b : keranjang.getIsi()) {
            System.out.println(b.getJudul() + " (" + b.getPenulis() + ")");
            System.out.println("  Harga       : " + Buku.formatRupiah(b.getHarga()));
            System.out.println("  Keterangan  : " + b.keterangan());
            System.out.println("  Harga akhir : " + Buku.formatRupiah(b.hargaAkhir()));
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total belanja : " + Buku.formatRupiah(keranjang.hitungTotal()));
    }

    public void cetakPembayaran(int totalBelanja, MetodeBayar[] pilihan) {
        System.out.println(buatJudul("PEMBAYARAN", '-'));
        for (MetodeBayar m : pilihan) {
            System.out.printf("%-20s : %s%n", m.nama(), Buku.formatRupiah(m.totalBayar(totalBelanja)));
        }
    }
}