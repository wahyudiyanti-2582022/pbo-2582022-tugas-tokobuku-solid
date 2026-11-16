public class BukuDigital extends Buku implements BisaDiunduh {
    private static final int DISKON_PERSEN = 20;

    private double ukuranMB;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMB) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
    }

    @Override
    public int hargaAkhir() {
        return getHarga() - getHarga() * DISKON_PERSEN / 100;
    }

    @Override
    public String keterangan() {
        return ukuranMB + " MB, diskon " + DISKON_PERSEN + "%";
    }

    @Override
    public String linkUnduh() {
        return "https://toko.buku/ebook/" + buatSlug(getJudul());
    }
}