public class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String judul(){
        return judul;
    }

    public int getHarga(){
        return harga;
    }

    public abstract int hargaAkhir();

    public abstract String keterangan();

    public void tampilkanInfo(){
        System.out.println(judul + " (" + penulis + ")");
        System.out.println("  Harga       : " + formatRupiah(harga));
        System.out.println("  Keterangan  : " + keterangan());
        System.out.println("  Harga akhir : " + formatRupiah(hargaAkhir()));
    }

    protected static String formatRupiah(int angka){
        return "Rp" + String.format("%,d", angka).replace(',','.');
    }
}
