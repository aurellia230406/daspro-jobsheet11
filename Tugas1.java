import java.util.Scanner;
public class Tugas1 {
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();
        double volume = hitungVolume(sisi);
        double luasPermukaan = hitungLuasPermukaan(sisi);


        System.out.println("Volume Kubus: " + volume);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);


        scanner.close();
    }
}