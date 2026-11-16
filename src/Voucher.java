public class Voucher implements MetodeBayar {
    private int nilai;

    public Voucher(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public String nama() {
        return "Voucher " + Buku.formatRupiah(nilai);
    }

    // Percobaan awal: return totalBelanja - nilai;
    // Hasil baris voucher keranjang kedua saat dijalankan:
    // Voucher Rp100.000    : -Rp36.000
    // Itu melanggar kontrak MetodeBayar.totalBayar (hasil tidak pernah negatif),
    // jadi diperbaiki: total bayar paling rendah nol.
    @Override
    public int totalBayar(int totalBelanja) {
        return Math.max(0, totalBelanja - nilai);
    }
}