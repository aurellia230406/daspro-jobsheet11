public class kafee203 {
    public static void main(String[] args) {
        menu("prasetro", false);
    }

    public static void menu(String NamaPelanggan, boolean isMember) {
        System.err.println("Selamat datang Pelanggan " + NamaPelanggan);
        if (isMember) {
            System.out.println("Anda adalah member, Selamat mendapatkan diskon 10%");
        }
        System.out.println("\n ==MENU RESTO KAFE AYAA");
        System.out.println("1.Kopi Hitam - Rp.15.000,00");
        System.out.println("2.Capucino - Rp.20.000,00");
        System.out.println("3.Latte - Rp.22.000,00");
        System.out.println("4.Teh Tarik - Rp.12.000,00");
        System.out.println("5.Roti Bakar - Rp.10.000,00");
        System.out.println("6.Mie Goreng - Rp.18.000,00");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }
}