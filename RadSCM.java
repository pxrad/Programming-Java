package pxrad.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RadSCM {
    public static void main(String[] args) {
        try (// Membuat objek scanner untuk menerima input dari pengguna
		Scanner scanner = new Scanner(System.in)) {
			// Inisialisasi data buah dan sayur
			Map<String, Integer> buah = new HashMap<>();
			buah.put("Apel", 50);
			buah.put("Jeruk", 100);
			buah.put("Mangga", 75);
			// Tambahkan data buah lainnya

			Map<String, Integer> sayur = new HashMap<>();
			sayur.put("Bayam", 30);
			sayur.put("Wortel", 40);
			sayur.put("Brokoli", 25);
			// Tambahkan data sayur lainnya

			// Menampilkan kategori buah dan sayur
			System.out.println("=== Kategori Buah ===");
			for (String namaBuah : buah.keySet()) {
			    System.out.println(namaBuah);
			}

			System.out.println("\n=== Kategori Sayur ===");
			for (String namaSayur : sayur.keySet()) {
			    System.out.println(namaSayur);
			}

			// Meminta input dari pengguna
			System.out.print("\nMasukkan kategori (buah/sayur): ");
			String kategori = scanner.nextLine();

			// Memvalidasi input kategori
			if (kategori.equalsIgnoreCase("buah")) {
			    // Menampilkan data buah
			    System.out.println("\n=== Data Buah ===");
			    for (Map.Entry<String, Integer> entry : buah.entrySet()) {
			        System.out.println(entry.getKey() + ": " + entry.getValue());
			    }

			    // Meminta input buah dari pengguna
			    System.out.print("\nMasukkan nama buah: ");
			    String namaBuah = scanner.nextLine();

			    // Memvalidasi input buah
			    if (buah.containsKey(namaBuah)) {
			        int jumlahBuah = buah.get(namaBuah);
			        System.out.println("Jumlah " + namaBuah + ": " + jumlahBuah);
			    } else {
			        System.out.println("Buah tidak ditemukan!");
			    }
			} else if (kategori.equalsIgnoreCase("sayur")) {
			    // Menampilkan data sayur
			    System.out.println("\n=== Data Sayur ===");
			    for (Map.Entry<String, Integer> entry : sayur.entrySet()) {
			        System.out.println(entry.getKey() + ": " + entry.getValue());
			    }

			    // Meminta input sayur dari pengguna
			    System.out.print("\nMasukkan nama sayur: ");
			    String namaSayur = scanner.nextLine();

			    // Memvalidasi input sayur
			    if (sayur.containsKey(namaSayur)) {
			        int jumlahSayur = sayur.get(namaSayur);
			        System.out.println("Jumlah " + namaSayur + ": " + jumlahSayur);
			    } else {
			        System.out.println("Sayur tidak ditemukan!");
			    }
			} else {
			    System.out.println("\nKategori tidak valid! Harap masukkan kategori yang benar (buah/sayur).");
			}}}}