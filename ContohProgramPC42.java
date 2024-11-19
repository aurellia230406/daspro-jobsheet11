public static void daftarPengunjung(int usia, String... namaPengunjung) {
    
    System.out.println("Usia Pengunjung: " + usia);
    System.out.println("Daftar Nama Pengunjung: ");
    for (String nama : namaPengunjung) {
        System.out.println("- " + nama);
    }
}