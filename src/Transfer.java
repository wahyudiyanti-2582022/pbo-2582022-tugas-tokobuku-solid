public class Transfer implements MetodeBayar {
    private static final int BIAYA_TRANSFER = 2500;

    @Override
    public String nama() {
        return "Transfer (+" + Buku.formatRupiah(BIAYA_TRANSFER) + ")";
    }

    @Override
    public int totalBayar(int totalBelanja) {
        return totalBelanja + BIAYA_TRANSFER;
    }
}