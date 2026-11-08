
public class TokoBuku {
    public static void main(String[] args) {
//    Hasil ketika baris super() di constuctor BukuDigital dihapus sementara
//  pesan Error:
//    java: constructor Buku in class Buku cannot be applied to given types;
//    required: java.lang.String,java.lang.String,int
//    found:    no arguments
//    reason: actual and formal argument lists differ in length

        Buku[] keranjang = {
                new BukuCetak("Pemrograman Java", "John Doe",120000, 750),
                new BukuCetak("Algoritma dasar", "Jane Smith", 95000,400),
                new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5)
        };

        System.out.println("=============== KERANJANG ===============");
        int total =0;
        for (Buku buku : keranjang){
            buku.tampilkanInfo();
            total += buku.hargaAkhir();
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total bayar    : " + Buku.formatRupiah(total));

    }
}