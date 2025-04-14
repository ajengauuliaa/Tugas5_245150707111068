public class Kalkulator {

    // Static Method: Penjumlahan
    public static int tambah(int a, int b) {
        return a + b;
    }

    // Static Method: Pengurangan
    public static int kurang(int a, int b) {
        return a - b;
    }

    // Non-static Method: Perkalian
    public int kali(int a, int b) {
        return a * b;
    }

    // Non-static Method: Pembagian
    public double bagi(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa dibagi dengan nol!");
        }
        return (double) a / b;
    }

    // Non-static Method: Menyederhanakan Pecahan
    public void sederhana(int pembilang, int penyebut) {
        int gcd = cariFPB(pembilang, penyebut);
        pembilang /= gcd;
        penyebut /= gcd;
        System.out.println("Pecahan sederhana: " + pembilang + "/" + penyebut);
    }

    // Helper untuk mencari FPB
    private int cariFPB(int a, int b) {
        while (b != 0) {
            int sisa = a % b;
            a = b;
            b = sisa;
        }
        return a;
    }
}
