import java.util.Scanner;

public class Tugas2 {
     static int[][] penjualan;
    static String[] menu;
    static int jumlahMenu = 5;
    static int jumlahHari = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        penjualan = new int[jumlahMenu][jumlahHari];
        menu = new String[jumlahMenu];
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            menu[i] = scanner.nextLine();
        }

        boolean selesai = false;
        while (!selesai) {
            System.out.println("\nPilih opsi:");
            System.out.println("1. Inputkan data penjualan");
            System.out.println("2. Tampilkan seluruh data penjualan");
            System.out.println("3. Tampilkan menu dengan penjualan tertinggi");
            System.out.println("4. Tampilkan rata-rata penjualan per menu");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    inputPenjualan(scanner);
                    break;
                case 2:
                    tampilkanDataPenjualan();
                    break;
                case 3:
                    tampilkanMenuTerlaris();
                    break;
                case 4:
                    tampilkanRataRataPenjualan();
                    break;
                case 5:
                    selesai = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }


        scanner.close();
    }

    static void inputPenjualan(Scanner scanner) {
        for (int i = 0; i < jumlahHari; i++) {
            System.out.println("Hari ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahMenu; j++) {
                System.out.print("  Masukkan penjualan untuk " + menu[j] + ": ");
                penjualan[j][i] = scanner.nextInt();
            }
        }
    }

    static void tampilkanDataPenjualan() {
        System.out.println("\nData Penjualan:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void tampilkanMenuTerlaris() {
        int maxPenjualan = 0;
        String menuTerlaris = "";

        for (int i = 0; i < jumlahMenu; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTerlaris = menu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi adalah: " + menuTerlaris + " dengan total " + maxPenjualan + " penjualan.");
    }

    static void tampilkanRataRataPenjualan() {
        System.out.println("\nRata-rata penjualan per menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / jumlahHari;
            System.out.println(menu[i] + ": " + String.format("%.2f", rataRata));
        }
    }
}