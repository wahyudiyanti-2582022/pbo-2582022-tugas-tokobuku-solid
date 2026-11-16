public class BukuAudio extends Buku implements BisaDiunduh {
    private static final int DISKON_PERSEN = 10;

    private int durasiMenit;

    public BukuAudio(String judul, String penulis, int harga, int durasiMenit) {
        super(judul, penulis, harga);
        this.durasiMenit = durasiMenit;
    }

    @Override
    public int hargaAkhir() {
        return getHarga() - getHarga() * DISKON_PERSEN / 100;
    }

    @Override
    public String keterangan() {
        return durasiMenit + " menit, diskon " + DISKON_PERSEN + "%";
    }

    @Override
    public String linkUnduh() {
        return "https://toko.buku/audio/" + buatSlug(getJudul());
    }
}