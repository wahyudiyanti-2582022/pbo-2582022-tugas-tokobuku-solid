public class EWallet implements MetodeBayar {
    private static final int DISKON_PERSEN = 2;

    @Override
    public String nama() {
        return "E-Wallet (diskon " + DISKON_PERSEN + "%)";
    }

    @Override
    public int totalBayar(int totalBelanja) {
        return totalBelanja * (100 - DISKON_PERSEN) / 100;
    }
}