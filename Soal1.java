package LatUKL031125;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double harga, v;
        System.out.println("--MENGHITUNG TOTAL BIAYA PENGIRIMAN--");
        System.out.println("Jarak Pengiriman (Km):");
        double jarak = in.nextDouble();
        System.out.println("Berat paket (kg):");
        double berat = in.nextDouble();
        System.out.println("Ukuran paket (panjang, lebar, tinggi) dalam cm:");
        double p = in.nextDouble();
        double l = in.nextDouble();
        double t = in.nextDouble();

        if (jarak <= 10) {
            harga = 4250 * berat;
        } else {
            harga = 6000 * berat;
        }
        v = p * l * t;
        if (v > 100) {
            harga += 50000;
        } else {
            harga += 0;
        }
        System.out.println("Total biaya pengiriman adalah Rp " + harga);
        in.close();
    }
}