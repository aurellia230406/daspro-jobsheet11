import java.util.Scanner;

public class ModifikasiProgram323 {

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal = (int) (hargaTotal * 0.5); 
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = (int) (hargaTotal * 0.7); 
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid, tidak ada pengurangan total harga.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int totalKeseluruhan = 0;

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (1-6) atau 0 untuk selesai: ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break; 
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: "); 
            int banyakItem = sc.nextInt();
            System.out.print("Masukkan kode promo (kosongkan jika tidak ada): ");
            String kodePromo = sc.next();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;

            System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
        }

        System.out.println("Total keseluruhan pesanan Anda: Rp" + totalKeseluruhan);
        
        sc.close(); 
    }
}