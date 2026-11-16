public abstract class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getHarga() {
        return harga;
    }

    // Method abstract: hanya tanda tangan, tanpa isi. Wajib diisi oleh subclass.
    public abstract int hargaAkhir();

    public abstract String keterangan();

    // 120000 -> "Rp120.000", -36000 -> "-Rp36.000"
    protected static String formatRupiah(int angka) {
        if (angka < 0) {
            return "-" + formatRupiah(-angka);
        }
        String digit = String.valueOf(angka);
        StringBuilder hasil = new StringBuilder();
        int hitung = 0;
        for (int i = digit.length() - 1; i >= 0; i--) {
            hasil.insert(0, digit.charAt(i));
            hitung++;
            if (hitung % 3 == 0 && i > 0) {
                hasil.insert(0, '.');
            }
        }
        return "Rp" + hasil;
    }

    // Helper untuk subclass: "Belajar OOP" -> "belajar-oop"
    protected static String buatSlug(String teks) {
        return teks.toLowerCase().replace(" ", "-");
    }
}