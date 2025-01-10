package mid;//

import java.util.Scanner;

interface BangunDatar {
    double hitungLuas();
    double hitungKeliling();
}

class Persegi implements BangunDatar {
    private double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }
}

public class no3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = scanner.nextDouble();

        BangunDatar persegi = new Persegi(sisi);

        System.out.println("Luas persegi: " + persegi.hitungLuas());
        System.out.println("Keliling persegi: " + persegi.hitungKeliling());
    }
}