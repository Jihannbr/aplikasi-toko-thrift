package mid;//no1
import java.util.Scanner;
public class no1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah pelanggan: ");
        int jumlahpelanggan = input.nextInt();
        
        String[] nama = new String[jumlahpelanggan];
        String[] kodePelanggan = new String[jumlahpelanggan];
        double[] hargaPerM3 = new double[jumlahpelanggan];
        double[] biayaBeban = new double[jumlahpelanggan];
        
        for (int i = 0; i < jumlahpelanggan; i++) {
            System.out.println("Data pelanggan ke-" + (i + 1) + ":");
            System.out.print("Nama Pelanggan: ");
            nama = scanner.nextLine();
            System.out.print("Kode Pelanggan: ");
            kodePelanggan = scanner.nextLine();

            for (int i = 0; i < jumlahpelanggan; i++) {
            switch (kodePelanggan) {
                case "L01":
                    hargaPerM3 = 2500;
                    biayaBeban = 50000;
                    break;
                case "L02":
                    hargaPerM3 = 2000;
                    biayaBeban = 35000;
                    break;
                case "L03":
                    hargaPerM3 = 1500;
                    biayaBeban = 25000;
                case "L04":
                    hargaPerM3 = 750;
                    biayaBeban = 15000;
                    break;
                default:
                    System.out.println("Kode Pelanggan tidak valid.");
                    continue; }
        }
            

            System.out.print("Jumlah Pemakaian (m3): ");
            double jumlahPemakaian = scanner.nextDouble();

            double totalHarga = hargaPerM3 * jumlahPemakaian + biayaBeban;
            double pajak = 0.15 * totalHarga;
            double totalBayar = totalHarga + pajak;
           
            System.out.println("\n=== Hasil Pendataan ===");
            System.out.println("Nama Pelanggan: " + nama);
            System.out.println("Total Harga: Rp " + totalHarga);
            System.out.println("Pajak (15%): Rp " + pajak);
            System.out.println("Total yang harus dibayar: Rp " + totalBayar);
           
            
            }
        }
}
