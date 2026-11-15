public class BukuCetak extends Buku{
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul,penulis,harga);
        this.beratGram = beratGram;
    }

    public int hitungOngkir() {
        int paket = (beratGram + 499) / 500;
        return paket * 5000;
    }

    @Override
    public int hargaAkhir() {
        return getHarga() + hitungOngkir();
    }

    @Override
    public String keterangan(){
        return beratGram + " gram, ongkir " + formatRupiah(hitungOngkir());
    }
}
