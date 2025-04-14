public class Jaket {
    // Harga tetap (final)
    private final int hargaA = 100000;
    private final int hargaB = 125000;
    private final int hargaC = 175000;

    public void beliJaket(String jenis, int jumlah) {
        int hargaSatuan = 0;
        int total = 0;

        switch (jenis.toUpperCase()) {
            case "A":
                hargaSatuan = (jumlah > 100) ? 95000 : hargaA;
                break;
            case "B":
                hargaSatuan = (jumlah > 100) ? 120000 : hargaB;
                break;
            case "C":
                hargaSatuan = (jumlah > 100) ? 160000 : hargaC;
                break;
            default:
                System.out.println("Jenis jaket tidak valid!");
                return;
        }

        total = hargaSatuan * jumlah;
        System.out.println("Jaket " + jenis + " sebanyak " + jumlah + " buah.");
        System.out.println("Harga per buah: Rp " + hargaSatuan);
        System.out.println("Total harga: Rp " + total);
    }

    // Untuk testing
    public static void main(String[] args) {
        // Tes Kalkulator
        Kalkulator k = new Kalkulator();
        System.out.println("Penjumlahan 5 + 3 = " + Kalkulator.tambah(5, 3));
        System.out.println("Pengurangan 10 - 4 = " + Kalkulator.kurang(10, 4));
        System.out.println("Perkalian 6 * 7 = " + k.kali(6, 7));
        System.out.println("Pembagian 20 / 5 = " + k.bagi(20, 5));
        k.sederhana(20, 60); // Output: 1/3

        // Tes Jaket
        Jaket j = new Jaket();
        j.beliJaket("A", 101);
        j.beliJaket("B", 90);
        j.beliJaket("C", 150);
    }
}
