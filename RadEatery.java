package pxrad.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RadEatery {
    public static void main(String[] args) {
        // Membuat objek scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi data menu makanan dan minuman
        Map<String, Integer> menuMakanan = new HashMap<>();
        menuMakanan.put("Roti Rasa Coklat", 10000);
        menuMakanan.put("Donut Rasa Stroberi", 8000);
        // Tambahkan data menu makanan lainnya (total 60)

        Map<String, Integer> menuMinuman = new HashMap<>();
        menuMinuman.put("Mojito", 15000);
        menuMinuman.put("Minuman Alkohol 1", 20000);
        menuMinuman.put("Minuman Alkohol 2", 25000);
        menuMinuman.put("Minuman Bersoda 1", 10000);
        menuMinuman.put("Minuman Bersoda 2", 12000);
        // Tambahkan data menu minuman lainnya (total 11)

        Map<String, Integer> menuKopi = new HashMap<>();
        menuKopi.put("Kopi Hitam", 8000);
        menuKopi.put("Kopi Latte", 12000);
        // Tambahkan data menu kopi lainnya (total 10)

        Map<String, Integer> menuMakananLainnya = new HashMap<>();
        menuMakananLainnya.put("Makanan 1", 15000);
        menuMakananLainnya.put("Makanan 2", 20000);
        // Tambahkan data menu makanan lainnya (total 70)

        // Menampilkan menu pilihan
        System.out.println("=== Rad's Eatery ===");
        System.out.println("1. Pesan Pesanan");
        System.out.println("2. Lihat Tempat Kosong");
        System.out.println("3. Tambah Saran Makanan");
        System.out.println("4. Hapus Menu Hidangan");
        System.out.println("5. Exit");

        // Meminta input dari pengguna
        System.out.print("Pilih menu (1-5): ");
        int pilihan = scanner.nextInt();

        Map<String, Integer> menuMakananl = null;
		switch (pilihan) {
            case 1:
                pesanPesanan(menuMakananl, menuMinuman, menuKopi, menuMakananLainnya, scanner);
                break;
            case 2:
                lihatTempatKosong();
                break;
            case 3:
                tambahSaranMakanan(menuMakananLainnya, scanner);
                break;
            case 4:
                hapusMenuHidangan(menuMakananl, menuMinuman, menuKopi, menuMakananLainnya, scanner);
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan Rad's Eatery. Sampai jumpa lagi!");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        // Menutup scanner
        scanner.close();
    }

    private static void pesanPesanan(Map<String, Integer> menuMakanan, Map<String, Integer> menuMinuman,
            Map<String, Integer> menuKopi, Map<String, Integer> menuMakananLainnya, Scanner scanner) {
        // Menampilkan menu makanan dan minuman
        System.out.println("\n=== Menu Makanan ===");
        for (Map.Entry<String, Integer> entry : menuMakanan.entrySet()) {
            System.out.println(entry.getKey() + ": Rp" + entry.getValue());
        }

        System.out.println("\n=== Menu Minuman ===");
        for (Map.Entry<String, Integer> entry : menuMinuman.entrySet()) {
            System.out.println(entry.getKey() + ": Rp" + entry.getValue());
        }

        System.out.println("\n=== Menu Kopi ===");
        for (Map.Entry<String, Integer> entry : menuKopi.entrySet()) {
            System.out.println(entry.getKey() + ": Rp" + entry.getValue());
        }

        System.out.println("\n=== Menu Makanan Lainnya ===");
        for (Map.Entry<String, Integer> entry : menuMakananLainnya.entrySet()) {
            System.out.println(entry.getKey() + ": Rp" + entry.getValue());
        }

        // Meminta input dari pengguna
        System.out.print("\nMasukkan pesanan Anda (nama makanan/minuman): ");
        String pesanan = scanner.next();
        System.out.print("Jumlah: ");
        int jumlah = scanner.nextInt();
        
     // Menghitung total biaya pesanan
        int totalBiaya = 0;

        // Memeriksa apakah pesanan termasuk dalam menu makanan
        if (menuMakanan.containsKey(pesanan)) {
            int hargaMakanan = menuMakanan.get(pesanan);
            totalBiaya += hargaMakanan * jumlah;
        }
        // Memeriksa apakah pesanan termasuk dalam menu minuman
        else if (menuMinuman.containsKey(pesanan)) {
            int hargaMinuman = menuMinuman.get(pesanan);
            totalBiaya += hargaMinuman * jumlah;
        }
        // Memeriksa apakah pesanan termasuk dalam menu kopi
        else if (menuKopi.containsKey(pesanan)) {
            int hargaKopi = menuKopi.get(pesanan);
            totalBiaya += hargaKopi * jumlah;
        }
        // Memeriksa apakah pesanan termasuk dalam menu makanan lainnya
        else if (menuMakananLainnya.containsKey(pesanan)) {
            int hargaMakananLainnya = menuMakananLainnya.get(pesanan);
            totalBiaya += hargaMakananLainnya * jumlah;
        }
        // Pesanan tidak valid
        else {
            System.out.println("Pesanan tidak valid!");
            return;
        }

        // Menampilkan jumlah makanan dan total biaya pesanan
        System.out.println("\nJumlah " + pesanan + ": " + jumlah);
        System.out.println("Total biaya: Rp" + totalBiaya);
    }

    private static void lihatTempatKosong() {
        System.out.println("\nTempat masih tersedia. Silakan duduk!");
    }

    private static void tambahSaranMakanan(Map<String, Integer> menuMakananLainnya, Scanner scanner) {
        // Meminta input saran makanan dari pengguna
        System.out.print("\nMasukkan saran makanan: ");
        String saranMakanan = scanner.next();

        // Menambahkan saran makanan ke menu makanan lainnya
        menuMakananLainnya.put(saranMakanan, 0);

        System.out.println("Terima kasih atas saran makanan Anda!");
    }

    private static void hapusMenuHidangan(Map<String, Integer> menuMakanan, Map<String, Integer> menuMinuman,
            Map<String, Integer> menuKopi, Map<String, Integer> menuMakananLainnya, Scanner scanner) {
        // Meminta input menu yang akan dihapus dari pengguna
        System.out.print("\nMasukkan nama menu yang akan dihapus: ");
        String menuHapus = scanner.next();

        // Menghapus menu dari masing-masing kategori jika ada
        if (menuMakanan.containsKey(menuHapus)) {
            menuMakanan.remove(menuHapus);
            System.out.println("Menu makanan " + menuHapus + " berhasil dihapus.");
        } else if (menuMinuman.containsKey(menuHapus)) {
            menuMinuman.remove(menuHapus);
            System.out.println("Menu minuman " + menuHapus + " berhasil dihapus.");
        } else if (menuKopi.containsKey(menuHapus)) {
            menuKopi.remove(menuHapus);
            System.out.println("Menu kopi " + menuHapus + " berhasil dihapus.");
        } else if (menuMakananLainnya.containsKey(menuHapus)) {
            menuMakananLainnya.remove(menuHapus);
            System.out.println("Menu makanan lainnya " + menuHapus + " berhasil dihapus.");
        } else {
            System.out.println("Menu tidak ditemukan!");
        }
    }
}