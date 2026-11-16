public class BukuCetak extends Buku {
    private static final int ONGKIR_PER_BLOK = 5000;
    private static final int GRAM_PER_BLOK = 500;

    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    // Rp5.000 per 500 gram, sisa dibulatkan ke atas
    private int hitungOngkir() {
        int jumlahBlok = (beratGram + GRAM_PER_BLOK - 1) / GRAM_PER_BLOK;
        return jumlahBlok * ONGKIR_PER_BLOK;
    }

    @Override
    public int hargaAkhir() {
        return getHarga() + hitungOngkir();
    }

    @Override
    public String keterangan() {
        return beratGram + " gram, ongkir " + formatRupiah(hitungOngkir());
    }
}