public interface MetodeBayar {
    String nama();

    /*
     * KONTRAK totalBayar (berlaku untuk SEMUA metode bayar):
     * - menerima total belanja (tidak negatif),
     * - mengembalikan jumlah yang harus dibayar,
     * - hasilnya TIDAK PERNAH negatif.
     */
    int totalBayar(int totalBelanja);
}